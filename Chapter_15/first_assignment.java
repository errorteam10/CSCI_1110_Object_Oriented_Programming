
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.awt.event.*;

public class ControlCircle extends Application {
	private CirclePane circlePane = new CirclePane();

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Hold two buttons in an HBox
		HBox hBox = new HBox();
		//hBox.setSpacing(10);
		//hBox.setAlignment(Pos.CENTER);
		Button left 	= new Button("Left");
		Button right 	= new Button("Right");
		Button up 		= new Button("Up");
		Button down 	= new Button("Down");
		
		hBox.getChildren().addAll(left, right, up, down);
		
		// Create and register the handler
		left.setOnAction(new LeftHandler());
		right.setOnAction(new RightHandler());
		up.setOnAction(new UpHandler());
		down.setOnAction(new DownHandler());

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("ControlCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	class LeftHandler implements  EventHandler<ActionEvent> {
		
		@Override
		public void handle(ActionEvent e) {
			circlePane.left();
		}
		
	}
	
	class RightHandler implements  EventHandler<ActionEvent> {
			
		@Override
		public void handle(ActionEvent e) {
			circlePane.right();
		}
		
	}
		
	class UpHandler implements  EventHandler<ActionEvent> {
			
		@Override
		public void handle(ActionEvent e) {
			circlePane.up();
		}
		
	}
	
	class DownHandler implements  EventHandler<ActionEvent> {
			
		@Override
		public void handle(ActionEvent e) {
			circlePane.down();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

class CirclePane extends StackPane {
	private Circle circle = new Circle(50); 
	
	public CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}
	
	public void enlarge() {
		circle.setRadius(circle.getRadius() + 2);
	}
	
	public void shrink() {
		circle.setRadius(circle.getRadius() > 2 ? 
			circle.getRadius() - 2 : circle.getRadius());
	}
	
	public void left() {
		
		if((getLayoutBounds().getMaxX() / 2) / 2 > circle.getTranslateX() * -1)
			circle.setTranslateX(circle.getTranslateX() - 2);
	}
	
	public void right() {
		if((getLayoutBounds().getMaxX() / 2) / 2 > circle.getTranslateX())
			circle.setTranslateX(circle.getTranslateX() + 2);
	}
	
	public void up() {
		if(((getLayoutBounds().getMaxY() / 2) / 2) - 20 > circle.getTranslateY() * -1)
			circle.setTranslateY(circle.getTranslateY() - 2);
	}
	
	public void down() {
		if(((getLayoutBounds().getMaxY() / 2) / 2) - 20 > circle.getTranslateY())
			circle.setTranslateY(circle.getTranslateY() + 2);
	}
}