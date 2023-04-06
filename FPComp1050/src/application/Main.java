package application;
	
import java.time.Clock;

import javafx.application.Application;


import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group; 
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label; 
import javafx.scene.layout.GridPane; 


public class Main extends Application {
	//non graphical elements
	Clock clock = Clock.systemDefaultZone();
	
	public int totalClicks = 0;
	
	public int Clicker1 = 0;

	public int Clicker2 = 0;
	
	public int Clicker3 = 0;
	
	public int Clicker4 = 0;
	
	public int Clicker5 = 0;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	@Override
	public void start(Stage primaryStage) {
		
		//main stage 
			Group root = new Group();
			Scene scene1 = new Scene(root,800,600, Color.BEIGE);
			//scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene1);
			primaryStage.show();
			//root.setStyle(gradient);
			primaryStage.setTitle("name of the game");
			primaryStage.setResizable(false);

			

			
			
//sections of the game layout 
			//s1
			final Line s1 = new Line();
			s1.setStartX(500);
			s1.setStartY(0);
			s1.setEndX(500); 
			s1.setEndY(600);
			s1.setStrokeWidth(10);
			
			
			
			final Line s1A = new Line();
			s1A.setStartX(0);
			s1A.setStartY(400);
			s1A.setEndX(500); 
			s1A.setEndY(400);
			s1A.setStrokeWidth(10);
			
			 //add the section to the root 
			root.getChildren().add(s1);
			root.getChildren().add(s1A);
			
			//border 
			final Line b1 = new Line();
			b1.setStartX(0);
			b1.setStartY(0);
			b1.setEndX(800); 
			b1.setEndY(0);
			b1.setStrokeWidth(10);
			root.getChildren().add(b1);
			
			final Line b2 = new Line();
			b2.setStartX(800);
			b2.setStartY(0);
			b2.setEndX(800); 
			b2.setEndY(600);
			b2.setStrokeWidth(10);
			root.getChildren().add(b2);
			
			final Line b3 = new Line();
			b3.setStartX(0);
			b3.setStartY(600);
			b3.setEndX(800); 
			b3.setEndY(600);
			b3.setStrokeWidth(10);
			root.getChildren().add(b3);
			
			final Line b4 = new Line();
			b4.setStartX(0);
			b4.setStartY(0);
			b4.setEndX(0); 
			b4.setEndY(600);
			b4.setStrokeWidth(10);
			root.getChildren().add(b4);
			

			//button for the main clicker 
			
			final Button btn = new Button();
			btn.setText("Click Me!");
			btn.setTranslateX(200);
		    btn.setTranslateY(200);
		    btn.setMaxSize(100, 100);
			root.getChildren().add(btn);
			
			Label count = new Label("Count: " + totalClicks);
			count.setTranslateX(200);
			count.setTranslateY(225);
			count.setMaxSize(100, 100);
			root.getChildren().add(count);
			
			//grid for the counter / clicks per second 
			
			GridPane grid = new GridPane();
			grid.setGridLinesVisible(true);
			
			btn.setOnAction(e -> {
				totalClicks++;
				count.setText("Count: " + totalClicks);
			});
	

	}

}
