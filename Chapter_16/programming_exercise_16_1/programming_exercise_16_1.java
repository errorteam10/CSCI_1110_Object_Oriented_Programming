
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import java.awt.*;
import javafx.geometry.Insets;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import java.beans.*;


public class programming_exercise_16_1 extends Application {

	private Color color = Color.BLACK;
	private Text text = new Text("Programming Is Fun");
	private ToggleGroup group = new ToggleGroup();
	
	RadioButton buttonRed = new RadioButton("Red");
	RadioButton buttonYellow = new RadioButton("Yellow");
	RadioButton buttonBlack = new RadioButton("Black");
	RadioButton buttonOrange = new RadioButton("Orange");
	RadioButton buttonGreen = new RadioButton("Green");
	
	Button buttonLeft = new Button("<<");
	Button buttonRight = new Button(">>");

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Hold two buttons in an HBox	

		BorderPane borderPane = new BorderPane();
		
		// Set Radio Buttons
		HBox paneForRadioButtons = new HBox(20);
		buttonRed.setToggleGroup(group);
		buttonYellow.setToggleGroup(group);
		buttonBlack.setToggleGroup(group);
		buttonOrange.setToggleGroup(group);
		buttonGreen.setToggleGroup(group);
		
		// Make Sure Black Is Selected To Start
		buttonBlack.setSelected(true);
		
		paneForRadioButtons.setAlignment(Pos.CENTER);
		paneForRadioButtons.getChildren().addAll(buttonRed, buttonYellow, buttonBlack, buttonOrange, buttonGreen);
		paneForRadioButtons.setPadding(new Insets(10, 10, 10, 10));
		
		// Set Radio's As Top Bar
		borderPane.setTop(paneForRadioButtons);
		
		// Create middle text
		HBox panelForText = new HBox(20);
		panelForText.setAlignment(Pos.CENTER);
		panelForText.getChildren().add(text);
		borderPane.setCenter(panelForText);
		
		// Create Bottom Movement Buttons.
		HBox panelForMovement = new HBox(20);
		panelForMovement.setAlignment(Pos.CENTER);
		panelForMovement.getChildren().addAll(buttonLeft, buttonRight);
		panelForMovement.setPadding(new Insets(10, 10, 10, 10));
		
		// Set buttons on bottom of page.
		borderPane.setBottom(panelForMovement);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 600, 400);
		primaryStage.setTitle("Programming Exercise 16-1"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		// Get Input
		getMovementInput(scene, borderPane);
		getRadioInput();
		
	}
	
	public void getRadioInput() {
		
		// Set Event Listeners For Radios
		buttonRed.setOnAction(e -> {
			if(buttonRed.isSelected())
				text.setFill(Color.RED);	 
		});
		
		buttonYellow.setOnAction(e -> {
			if(buttonYellow.isSelected())
				text.setFill(Color.YELLOW);	 
		});
		
		buttonBlack.setOnAction(e -> {
			if(buttonBlack.isSelected())
				text.setFill(Color.BLACK);	 
		});
		
		buttonOrange.setOnAction(e -> {
			if(buttonOrange.isSelected())
				text.setFill(Color.ORANGE);	 
		});
		
		buttonGreen.setOnAction(e -> {
			if(buttonGreen.isSelected())
				text.setFill(Color.GREEN);	 
		});
	}
	
	
	public void getMovementInput(Scene scene, BorderPane borderPane) {
		
		buttonLeft.setOnAction(e -> {
			if(((borderPane.getLayoutBounds().getMaxX() / 2) / 2) > text.getTranslateX() * -1)
				text.setTranslateX(text.getTranslateX() - 5);
		});
		
		buttonRight.setOnAction(e -> {
			if(((borderPane.getLayoutBounds().getMaxX() / 2) / 2) > text.getTranslateX())
				text.setTranslateX(text.getTranslateX() + 5);
		});
		
		scene.setOnKeyPressed(e -> {
			switch (e.getCode()) {
				case D:
					if(((borderPane.getLayoutBounds().getMaxX() / 2) / 2) > text.getTranslateX())
						text.setTranslateX(text.getTranslateX() + 5);
					break;
				case A:
					if(((borderPane.getLayoutBounds().getMaxX() / 2) / 2) > text.getTranslateX() * -1)
						text.setTranslateX(text.getTranslateX() - 5);
					break;
				
			}
		});
	}
	
}

