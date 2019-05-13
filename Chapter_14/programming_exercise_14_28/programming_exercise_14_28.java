
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class programming_exercise_14_28 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a clock and a label
		ClockPane clock = new ClockPane();
		int hour = getHour();
		int minute = getMinute();
		int second = getSecond();
		
		clock.setCurrentTime(hour, minute, second);
		clock.setSecondHandVisible(false);
		
		String timeString = hour + ":" + minute + ":" + second;
		Label lblCurrentTime = new Label(timeString);

		// Place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("DisplayClock"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public int getHour() {
		return (int)(Math.random() * (11 - 0) + 1) + 0;
	}
	
	public int getMinute() {
		return (int)(Math.random() * (60 - 0) + 1) + 0;
	}
	
	public int getSecond() {
		return (int)(Math.random() * (60 - 0) + 1) + 0;
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}