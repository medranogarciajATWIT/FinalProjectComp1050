package application;

import javafx.animation.KeyFrame;
import javafx.application.Application;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.Group; 
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Main extends Application {
	//non graphical elements
	public long startTime = 0;
	
	public int totalClicks = 0;
	
	public int purchaseAmount = 1;
	
	public int cpsAmount = 1;
	
	public int Clicker1 = 0;

	public int Clicker2 = 0;
	
	public int Clicker3 = 0;
	
	public int Clicker4 = 0;
	
	public int Clicker5 = 0;
	
	public int cpsCost = 10;
	
	public double clicksPerSecond = 0;
	
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
			primaryStage.setTitle("Stir Fry Clicker");
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
			
			final Line b5 = new Line();
			b5.setStartX(500);
			b5.setStartY(40);
			b5.setEndX(800);
			b5.setEndY(40);
			b5.setStrokeWidth(10);
			root.getChildren().add(b5);
			
			final Line b6 = new Line();
			b6.setStartX(500);
			b6.setStartY(110);
			b6.setEndX(800);
			b6.setEndY(110);
			b6.setStrokeWidth(10);
			root.getChildren().add(b6);
			
			final Line b7 = new Line();
			b7.setStartX(500);
			b7.setStartY(180);
			b7.setEndX(800);
			b7.setEndY(180);
			b7.setStrokeWidth(10);
			root.getChildren().add(b7);
			
			final Line b8 = new Line();
			b8.setStartX(500);
			b8.setStartY(250);
			b8.setEndX(800);
			b8.setEndY(250);
			b8.setStrokeWidth(10);
			root.getChildren().add(b8);
			
			final Line b9 = new Line();
			b9.setStartX(500);
			b9.setStartY(320);
			b9.setEndX(800);
			b9.setEndY(320);
			b9.setStrokeWidth(10);
			root.getChildren().add(b9);
			
			final Line b10 = new Line();
			b10.setStartX(500);
			b10.setStartY(400);
			b10.setEndX(800);
			b10.setEndY(400);
			b10.setStrokeWidth(10);
			root.getChildren().add(b10);
			
			final Line b11 = new Line();
			b11.setStartX(500);
			b11.setStartY(470);
			b11.setEndX(800);
			b11.setEndY(470);
			b11.setStrokeWidth(10);
			root.getChildren().add(b11);
			
			final Line b12 = new Line();
			b12.setStartX(500);
			b12.setStartY(540);
			b12.setEndX(800);
			b12.setEndY(540);
			b12.setStrokeWidth(10);
			root.getChildren().add(b12);
			
			
			//button for the main clicker 
			final Button btn = new Button();
			btn.setText("Click Me!");
			btn.setTranslateX(200);
		    btn.setTranslateY(200);
		    btn.setMaxSize(100, 100);
			root.getChildren().add(btn);
			
			Image stirFry = new Image("/Saved Pictures\\stir fry.PNG\"");
			ImageView image = new ImageView(stirFry);
			image.setFitHeight(80);
			image.setPreserveRatio(true);
			
			final Button x1 = new Button();
			x1.setText("x1");
			x1.setTranslateX(525);
			x1.setTranslateY(8);
			btn.setMaxSize(100, 100);
			root.getChildren().add(x1);
			
			btn.setGraphic(image);
			
			final Button x5 = new Button();
			x5.setText("x5");
			x5.setTranslateX(575);
			x5.setTranslateY(8);
			btn.setMaxSize(100, 100);
			root.getChildren().add(x5);
			
			final Button x10 = new Button();
			x10.setText("x10");
			x10.setTranslateX(625);
			x10.setTranslateY(8);
			btn.setMaxSize(100, 100);
			root.getChildren().add(x10);
			
			final Button cpsIncrease = new Button();
			cpsIncrease.setText("Increase Clicks");
			cpsIncrease.setTranslateX(525);
			cpsIncrease.setTranslateY(65);
			cpsIncrease.setMaxSize(100, 100);
			root.getChildren().add(cpsIncrease);
			
			Label count = new Label("Count: " + totalClicks);
			count.setTranslateX(200);
			count.setTranslateY(225);
			count.setMaxSize(100, 100);
			root.getChildren().add(count);
			
			Label feedCat = new Label("Feed Stir Fry! :)");
			feedCat.setTranslateX(200);
			feedCat.setTranslateY(50);
			feedCat.setMaxSize(100, 100);
			root.getChildren().add(feedCat);
			
			Label averageClicks = new Label(String.format("Average Clicks: %.2f", clicksPerSecond));
			averageClicks.setTranslateX(200);
			averageClicks.setTranslateY(250);
			averageClicks.setMaxSize(150, 100);
			root.getChildren().add(averageClicks);
			
			Label purchaseAmountIndicator = new Label(String.format("Buy: %d", purchaseAmount));
			purchaseAmountIndicator.setTranslateX(700);
			purchaseAmountIndicator.setTranslateY(10);
			purchaseAmountIndicator.setMaxSize(100, 100);
			root.getChildren().add(purchaseAmountIndicator);
			
			Label cpsTotal = new Label(String.format("Amount: %d", cpsAmount));
			cpsTotal.setTranslateX(625);
			cpsTotal.setTranslateY(70);
			cpsTotal.setMaxSize(100, 100);
			root.getChildren().add(cpsTotal);
			
			Label cpsPrice = new Label(String.format("Price: %d", cpsCost));
			cpsPrice.setTranslateX(700);
			cpsPrice.setTranslateY(70);
			cpsPrice.setMaxSize(100, 100);
			root.getChildren().add(cpsPrice);
			
			//grid for the counter / clicks per second 
			
			GridPane grid = new GridPane();
			grid.setGridLinesVisible(true);
			

			btn.setOnAction(e -> {
				totalClicks += cpsAmount;
				count.setText("Count: " + totalClicks);
				if (startTime == 0) {
					startTime = System.currentTimeMillis();
				}
				else {
					long currentTime = System.currentTimeMillis();
					double elapsedTimeInSeconds = (currentTime - startTime) / 1000;
					clicksPerSecond = totalClicks / elapsedTimeInSeconds;
					averageClicks.setText(String.format("Average Clicks: %.2f", clicksPerSecond));
				}
			});
	
			x1.setOnAction(e -> {
				if (purchaseAmount != 1) {
					purchaseAmount = 1;
					purchaseAmountIndicator.setText(String.format("Buy: %d", purchaseAmount));
				}
			});
			
			x5.setOnAction(e -> {
				if (purchaseAmount != 5) {
					purchaseAmount = 5;
					purchaseAmountIndicator.setText(String.format("Buy: %d", purchaseAmount));
				}
			});
			
			x10.setOnAction(e -> {
				if (purchaseAmount != 10) {
					purchaseAmount = 10;
					purchaseAmountIndicator.setText(String.format("Buy: %d", purchaseAmount));
				}
			});

			cpsIncrease.setOnAction(e -> {
				if (totalClicks >= cpsCost * purchaseAmount) {
					totalClicks = totalClicks - cpsCost;
					cpsAmount =+ purchaseAmount;
					cpsCost = cpsCost * 2;
					cpsTotal.setText(String.format("Amount: %d", cpsAmount));
					cpsPrice.setText(String.format("Price: %d", cpsCost));
				}
			});
			
	}

}
