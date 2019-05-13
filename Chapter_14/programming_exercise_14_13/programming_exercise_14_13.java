
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.scene.Group;

public class programming_exercise_14_13 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		
		Arc arc1 = new Arc(100, 100, 80, 80, 0.0, 360.0 * (20.0 / 100.0)); // Create an arc
		arc1.setFill(Color.RED); // Set fill color
		arc1.setType(ArcType.ROUND); // Set arc type
		
		Arc arc2 = new Arc(100, 100, 80, 80, arc1.getStartAngle() + arc1.getLength(), 360.0 * (10.0 / 100.0));
		arc2.setFill(Color.BLUE);
		arc2.setType(ArcType.ROUND);

		Arc arc3 = new Arc(100, 100, 80, 80, arc2.getStartAngle() + arc2.getLength(), 360.0 * (30.0 /100.0));
		arc3.setFill(Color.GREEN);
		arc3.setType(ArcType.ROUND);
		
		Arc arc4 = new Arc(100, 100, 80, 80, arc3.getStartAngle() + arc3.getLength(), 360.0 * (40.0 / 100.0));
		arc4.setFill(Color.ORANGE);
		arc4.setType(ArcType.ROUND);

		
		// Create a group and add nodes to the group
		Group group = new Group();
			
		group.getChildren().addAll(arc1, arc2, arc3, arc4,
		 new Text(120, 80, "Project -- 20%"),
		 new Text(80  , 17,  "Quiz -- 10%"),
		 new Text(0, 100, "Midterm -- 30%"),
		 new Text(110, 175, "Final -- 40%")
		);      

		// Create a scene and place it in the stage
		Scene scene = new Scene(new BorderPane(group));
		primaryStage.setTitle("ShowArc"); // Set the stage title
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