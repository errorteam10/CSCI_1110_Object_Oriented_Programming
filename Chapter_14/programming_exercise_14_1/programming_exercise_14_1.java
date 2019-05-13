import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.text.html.*;

public class programming_exercise_14_1 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the image views
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		Image image1 = new Image("image/us.jpg", 350, 350, false, false);
		Image image2 = new Image("image/image2.jpg", 350, 350, false, false);
		Image image3 = new Image("image/image3.jpg", 350, 350, false, false);
		Image image4 = new Image("image/image4.png", 350, 350, false, false);
		pane.add(new ImageView(image1), 0, 0);
		
		ImageView imageView2 = new ImageView(image2);
		pane.add(imageView2, 1, 0);   

		ImageView imageView3 = new ImageView(image3);
		pane.add(imageView3, 0, 1);  
		
		ImageView imageView4 = new ImageView(image4);
		pane.add(imageView4, 1, 1);   
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowImage"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}