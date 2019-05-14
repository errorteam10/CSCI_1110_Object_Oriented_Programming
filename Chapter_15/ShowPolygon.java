/**
*
* @author Brent Dalling
*
* May 14th, 2019
*
*/

import javafx.animation.PathTransition;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import java.awt.*;
import javafx.util.Duration;

public class ShowPolygon extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		// Create a scene and place it in the stage
		Scene scene = new Scene(new MyPolygon(), 400, 400);
		
		primaryStage.setTitle("ShowPolygon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

class MyPolygon extends Pane {
	
	public boolean isPlaying = true;
	
	private void paint() {
		
		// Create a polygon and place polygon to pane
		Polygon polygon = new Polygon();
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();
		
		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;

		// Add points to the polygon list
		for (int i = 0; i < 5; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 5));
		}     
		
		Rectangle rectangle = new Rectangle();
		rectangle.setFill(Color.BLACK);
		rectangle.setHeight(50);
		rectangle.setWidth(100);
		
		FadeTransition ft = new FadeTransition();
		PathTransition pt = new PathTransition();
		
		pt.setDuration(Duration.millis(4000));
		ft.setDuration(Duration.millis(4000));
		pt.setPath(polygon);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		pt.setNode(rectangle);
		ft.setNode(rectangle);
		pt.setOrientation(
			PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT
		);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
				
		polygon.setRotate(-18);
		
		getChildren().clear();
		getChildren().addAll(polygon, rectangle); 
		pt.play();
		ft.play();
		
		polygon.setOnMouseClicked(e -> {
			 
			if(isPlaying){
				pt.pause(); ft.pause();
			} else if(!isPlaying) {
				pt.play(); ft.play();
			}
			
			isPlaying  = isPlaying ? false : true;
				
		});

	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
}