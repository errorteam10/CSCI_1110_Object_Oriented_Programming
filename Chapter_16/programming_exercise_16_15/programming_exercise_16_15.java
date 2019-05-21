
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;

public class programming_exercise_16_15 extends Application {
	
	private ComboBox comboBox = new ComboBox<String>();
	private TextField text = new TextField();
	private Label label;
	

	private ImageView image = new ImageView(new Image("https://images.clipartlogo.com/files/istock/previews/9106/91063819-cartoon-grapes.jpg", 50, 50, true, false));

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Hold two buttons in an HBox	

		BorderPane borderPane = new BorderPane();
		
		label = new Label("Grapes", image);
		
		// Create middle text
		HBox panelForText = new HBox(20);
		panelForText.setAlignment(Pos.CENTER);
		panelForText.getChildren().add(label);
		borderPane.setCenter(panelForText);
		
		// Combo Bo x
		comboBox.getItems().addAll("Left", "Right", "Center", "Top", "Bottom");
			
		HBox panelForOptions = new HBox(20);
		panelForOptions.setPadding(new Insets(10, 10, 10, 10));
		panelForOptions.setAlignment(Pos.CENTER);
		panelForOptions.getChildren().addAll(new Text("Content Display: "), comboBox);
		panelForOptions.getChildren().addAll(new Text("Graphic-Text Gap: "), text);
		borderPane.setTop(panelForOptions);
		
		comboBox.setOnAction(e -> {
			adjust(comboBox.getValue(), label);
		});
		
		text.setOnAction(e -> {
			adjustGap(text.getText(), label);
		});
		
				
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 600, 400);
		primaryStage.setTitle("Programming Exercise 16-1"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}	
	
	public void adjust(Object string, Label label) {
		
		switch (string.toString()) {
			case "Top": label.setContentDisplay(ContentDisplay.TOP); break;
			case "Bottom": label.setContentDisplay(ContentDisplay.BOTTOM); break;
			case "Left": label.setContentDisplay(ContentDisplay.LEFT); break;
			case "Right": label.setContentDisplay(ContentDisplay.RIGHT); break;
			case "Center": label.setContentDisplay(ContentDisplay.CENTER); break;
		}
	}
	
	
	public void adjustGap(Object string, Label label) {
			
		label.setGraphicTextGap(Double.parseDouble(string.toString()));
	}
	

}

