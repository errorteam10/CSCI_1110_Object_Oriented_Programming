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
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;
import javafx.animation.KeyFrame; 
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer; 
import javafx.scene.media.MediaView;

public class programming_exercise_16_21 extends Application {
	
	TextField text = new TextField();
	Label label = new Label("Enter Time In Seconds: ", text);
	Double time;
	Text timeDisplay = new Text("Enter Time In Seconds To Begin");
	Timeline anim;
	Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	MediaPlayer mediaPlayer = new MediaPlayer(media);
	MediaView mediaView = new MediaView(mediaPlayer);

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Hold two buttons in an HBox	
		
		HBox box = new HBox(20);
		box.getChildren().add(label);
		box.setAlignment(Pos.CENTER);

		BorderPane borderPane = new BorderPane();
		borderPane.setPadding(new Insets(10, 10, 10, 10));
		borderPane.setTop(box);
		borderPane.setCenter(timeDisplay);
		borderPane.setBottom(mediaView);
		
		label.setContentDisplay(ContentDisplay.BOTTOM);
		
		EventHandler<ActionEvent> eventHandler = e -> {
		
			if(time > 0) {
				time -= 1;
				timeDisplay.setText(Double.toString(time));
			} else {
				timeDisplay.setText("Times Up!");
				borderPane.getChildren().add(box);
				anim.stop();
				mediaPlayer.play();
			}
		};
		
		text.setOnAction(e -> {
			
			borderPane.getChildren().remove(box);
			time = Double.parseDouble(text.getText());
			
			anim = new Timeline(
				new KeyFrame(Duration.millis((time * 1000) / time), eventHandler)
			);
			
			anim.setCycleCount(Timeline.INDEFINITE);
			anim.play();
		});
				
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 300, 150);
		primaryStage.setTitle("Programming Exercise 16-1"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}

}

