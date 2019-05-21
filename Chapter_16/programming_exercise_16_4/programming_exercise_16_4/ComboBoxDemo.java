/*
*
* @author Brent Dalling
*
*	MAY 21ST, 2019
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.nio.file.*;
import java.io.*;

import java.util.Scanner;



public class ComboBoxDemo extends Application {
	// Declare an array of Strings for flag titles
	private String[] flagTitles = {"Canada", "China", "Denmark", 
		"France", "Germany", "India", "Norway", "United Kingdom",
		"United States of America"};
	
	private File descriptors;
	
	private Scanner input;

	// Declare an ImageView array for the national flags of 9 countries
	private ImageView[] flagImage = {new ImageView("image/ca.gif"),
		new ImageView("image/china.gif"), 
		new ImageView("image/denmark.gif"), 
		new ImageView("image/fr.gif"), 
		new ImageView("image/germany.gif"),
		new ImageView("image/india.gif"), 
		new ImageView("image/norway.gif"),
		new ImageView("image/uk.gif"), 
		new ImageView("image/us.gif")};

	// Declare an array of strings for flag descriptions
	private String[] flagDescription = new String[9];

	// Declare and create a description pane
	private DescriptionPane descriptionPane = new DescriptionPane();

	// Create a combo box for selecting countries
	private ComboBox<String> cbo = new ComboBox<>(); // flagTitles

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		// Set The String Array To Empty String To remove null From Final Response.
		for(int i = 0; i < flagDescription.length; i++) {
			flagDescription[i] = "";
		}

		// Try And Open The Files.
		try {
			
			// For Length Of flagDescription Array
			for(int i = 0; i < flagDescription.length; i++) {
				
				// Get File
				input = new Scanner(new File("data" + i + ".txt"));
				
				// Loop Forever
				for(;;) {
					
					// If Next Character / Line
					if(input.hasNext()) {
						
						// Add Line To Response
						flagDescription[i] += input.nextLine();
					} else {
						
						// Break Infinite Loop
						break;
					}
				}
			}
			
		} catch (Exception e) {
			
			// Display Error
			System.out.println(e);
		}
		
		// Set the first country (Canada) for display
		setDisplay(0);

		// Add combo box and description pane to the border pane
		BorderPane pane = new BorderPane();
			
		BorderPane paneForComboBox = new BorderPane();
		
		pane.setOnKeyPressed(e -> System.out.println("Key pressed " + e.getCode() + " "));
		
		pane.setOnKeyTyped(e -> System.out.println("Key Typed " + e.getCode()));
		paneForComboBox.setLeft(new Label("Select a country: "));
		paneForComboBox.setCenter(cbo);
		pane.setTop(paneForComboBox);
		cbo.setPrefWidth(400);
		cbo.setValue("Canada");
		
		ObservableList<String> items = 
			FXCollections.observableArrayList(flagTitles);
		cbo.getItems().addAll(items); 
		pane.setCenter(descriptionPane);
		
		// Display the selected country
		cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 450, 170);
		primaryStage.setTitle("ComboBoxDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}


	/** Set display information on the description pane */
	public void setDisplay(int index) {
		descriptionPane.setTitle(flagTitles[index]);
		descriptionPane.setImageView(flagImage[index]);
		descriptionPane.setDescription(flagDescription[index]);
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}