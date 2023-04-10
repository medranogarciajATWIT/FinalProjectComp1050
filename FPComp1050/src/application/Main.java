package application;

import javafx.animation.Animation;
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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Main extends Application {
	//non graphical elements
	public long startTime = 0;
	
	public int totalClicks = 0;
	
	public int purchaseAmount = 1;
	
	public int cpsAmount = 1;
	
	public int Clicker1Amount = 0;
	
	public int Clicker1Cost = 100;
	
	public int Clicker2Amount = 0;
	
	public int Clicker2Cost = 2500;
		
	public int Clicker3Amount = 0;
	
	public int Clicker3Cost = 10000;
		
	public int Clicker4Amount = 0;
	
	public int Clicker4Cost = 50000;
		
	public int Clicker5Amount = 0;
	
	public int Clicker5Cost = 275000;
		
	public int Clicker6Amount = 0;
	
	public int Clicker6Cost = 1000000;
		
	public int Clicker7Amount = 0;
	
	public int Clicker7Cost = 25000000;
	
	public int Prestiege = 1;
	
	public int cpsCost = 10;
	
	public double clicksPerSecond = 0;
	
	public Timeline autoClickerTimer1;
	
	public Timeline autoClickerTimer2;
	
	public Timeline autoClickerTimer3;
	
	public Timeline autoClickerTimer4;
	
	public Timeline autoClickerTimer5;
	
	public Timeline autoClickerTimer6;
	
	public Timeline autoClickerTimer7;
	
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
			
			//image for the main button
			Image cat = new Image("cat.png");
			ImageView catImageView = new ImageView(cat);
			catImageView.setFitWidth(200);
			catImageView.setFitHeight(200);
			
			Image cat2 = new Image("cat lmao.png");
			ImageView catImageView2 = new ImageView(cat2);
			catImageView2.setFitWidth(100);
			catImageView2.setFitHeight(100);
			catImageView2.setTranslateX(10);
			catImageView2.setTranslateY(450);
			root.getChildren().add(catImageView2);
			
			Image cat3 = new Image("funny cat.png");
			ImageView catImageView3 = new ImageView(cat3);
			catImageView3.setFitHeight(100);
			catImageView3.setFitWidth(100);
			catImageView3.setTranslateX(160);
			catImageView3.setTranslateY(450);
			root.getChildren().add(catImageView3);
			
			
			//button for the main clicker 
			final Button btn = new Button();  //change for cat picture 
			//btn.setText("Click Me!");
			btn.setTranslateX(130);
		    btn.setTranslateY(80);
		    btn.setPrefWidth(200);
	        btn.setPrefHeight(200);
		    btn.setGraphic(catImageView);
			root.getChildren().add(btn);
			
			final Button x1 = new Button();
			x1.setText("x1");
			x1.setTranslateX(525);
			x1.setTranslateY(8);
			btn.setMaxSize(100, 100);
			root.getChildren().add(x1);
			
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
			
			final Button autoClicker1 = new Button();
			autoClicker1.setText("Auto Feeder 1");
			autoClicker1.setTranslateX(525);
			autoClicker1.setTranslateY(135);
			autoClicker1.setMaxSize(100, 100);
			root.getChildren().add(autoClicker1);
			
			final Button autoClicker2 = new Button();
			autoClicker2.setText("Auto Feeder 2");
			autoClicker2.setTranslateX(525);
			autoClicker2.setTranslateY(205);
			autoClicker2.setMaxSize(100, 100);
			root.getChildren().add(autoClicker2);
			
			final Button autoClicker3 = new Button();
			autoClicker3.setText("Auto Feeder 3");
			autoClicker3.setTranslateX(525);
			autoClicker3.setTranslateY(275);
			autoClicker3.setMaxSize(100, 100);
			root.getChildren().add(autoClicker3);
			
			final Button autoClicker4 = new Button();
			autoClicker4.setText("Robo Litter Box");
			autoClicker4.setTranslateX(525);
			autoClicker4.setTranslateY(345);
			autoClicker4.setMaxSize(100, 100);
			root.getChildren().add(autoClicker4);
			
			final Button autoClicker5 = new Button();
			autoClicker5.setText("Luxury Hairbrush");
			autoClicker5.setTranslateX(525);
			autoClicker5.setTranslateY(420);
			autoClicker5.setMaxSize(150, 100);
			root.getChildren().add(autoClicker5);
			
			final Button autoClicker6 = new Button();
			autoClicker6.setText("Quality Food");
			autoClicker6.setTranslateX(525);
			autoClicker6.setTranslateY(490);
			autoClicker6.setMaxSize(100, 100);
			root.getChildren().add(autoClicker6);
			
			final Button autoClicker7 = new Button();
			autoClicker7.setText("Scratching Post");
			autoClicker7.setTranslateX(525);
			autoClicker7.setTranslateY(560);
			autoClicker7.setMaxSize(125, 100);
			root.getChildren().add(autoClicker7);
			
			Label count = new Label(String.format("Count: %d", totalClicks));
			count.setTranslateX(200);
			count.setTranslateY(300);
			count.setMaxSize(100, 100);
			root.getChildren().add(count);
			
			Label feedCat = new Label("Feed Stir Fry! :)");
			feedCat.setTranslateX(200);
			feedCat.setTranslateY(50);
			feedCat.setMaxSize(100, 100);
			root.getChildren().add(feedCat);
			
			Label averageClicks = new Label(String.format("Average Clicks: %.2f", clicksPerSecond));
			averageClicks.setTranslateX(200);
			averageClicks.setTranslateY(325);
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
			
			Label clicker1Total = new Label(String.format("Amount: %d", Clicker1Amount));
			clicker1Total.setTranslateX(625);
			clicker1Total.setTranslateY(140);
			clicker1Total.setMaxSize(100, 100);
			root.getChildren().add(clicker1Total);
			
			Label clicker1Price = new Label(String.format("Price: %d", Clicker1Cost));
			clicker1Price.setTranslateX(700);
			clicker1Price.setTranslateY(140);
			clicker1Total.setMaxSize(100, 100);
			root.getChildren().add(clicker1Price);
			
			Label clicker2Total = new Label(String.format("Amount: %d", Clicker2Amount));
			clicker2Total.setTranslateX(625);
			clicker2Total.setTranslateY(210);
			clicker2Total.setMaxSize(100, 100);
			root.getChildren().add(clicker2Total);
			
			Label clicker2Price = new Label(String.format("Price: %d", Clicker2Cost));
			clicker2Price.setTranslateX(700);
			clicker2Price.setTranslateY(210);
			clicker2Total.setMaxSize(100, 100);
			root.getChildren().add(clicker2Price);
			
			Label clicker3Total = new Label(String.format("Amount: %d", Clicker3Amount));
			clicker3Total.setTranslateX(625);
			clicker3Total.setTranslateY(280);
			clicker3Total.setMaxSize(100, 100);
			root.getChildren().add(clicker3Total);
			
			Label clicker3Price = new Label(String.format("Price: %d", Clicker3Cost));
			clicker3Price.setTranslateX(700);
			clicker3Price.setTranslateY(280);
			clicker3Total.setMaxSize(100, 100);
			root.getChildren().add(clicker3Price);
			
			Label clicker4Total = new Label(String.format("Amount: %d", Clicker4Amount));
			clicker4Total.setTranslateX(625);
			clicker4Total.setTranslateY(350);
			clicker4Total.setMaxSize(100, 100);
			root.getChildren().add(clicker4Total);
			
			Label clicker4Price = new Label(String.format("Price: %d", Clicker4Cost));
			clicker4Price.setTranslateX(700);
			clicker4Price.setTranslateY(350);
			clicker4Total.setMaxSize(100, 100);
			root.getChildren().add(clicker4Price);
			
			Label clicker5Total = new Label(String.format("Amount: %d", Clicker5Amount));
			clicker5Total.setTranslateX(635);
			clicker5Total.setTranslateY(425);
			clicker5Total.setMaxSize(100, 100);
			root.getChildren().add(clicker5Total);
			
			Label clicker5Price = new Label(String.format("Price: %d", Clicker5Cost));
			clicker5Price.setTranslateX(700);
			clicker5Price.setTranslateY(425);
			clicker5Total.setMaxSize(100, 100);
			root.getChildren().add(clicker5Price);
			
			Label clicker6Total = new Label(String.format("Amount: %d", Clicker6Amount));
			clicker6Total.setTranslateX(625);
			clicker6Total.setTranslateY(495);
			clicker6Total.setMaxSize(100, 100);
			root.getChildren().add(clicker6Total);
			
			Label clicker6Price = new Label(String.format("Price: %d", Clicker6Cost));
			clicker6Price.setTranslateX(700);
			clicker6Price.setTranslateY(495);
			clicker6Total.setMaxSize(100, 100);
			root.getChildren().add(clicker6Price);
			
			Label clicker7Total = new Label(String.format("Amount: %d", Clicker7Amount));
			clicker7Total.setTranslateX(625);
			clicker7Total.setTranslateY(565);
			clicker7Total.setMaxSize(100, 100);
			root.getChildren().add(clicker7Total);
			
			Label clicker7Price = new Label(String.format("Price: %d", Clicker7Cost));
			clicker7Price.setTranslateX(700);
			clicker7Price.setTranslateY(565);
			clicker7Total.setMaxSize(100, 100);
			root.getChildren().add(clicker7Price);
			
			//grid for the counter / clicks per second 
			
			GridPane grid = new GridPane();
			grid.setGridLinesVisible(true);
			
			//Clicker button functionality + total/average count
			btn.setOnAction(e -> {
				totalClicks += cpsAmount;
				count.setText("Count: " + totalClicks);
				if (startTime == 0) {
					startTime = System.currentTimeMillis();
				}
			});
			//Updates average clicks every second
			Timeline averageClicksTimer = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
				if(totalClicks > 0) {
						long currentTime = System.currentTimeMillis();
						double elapsedTimeInSeconds = (currentTime - startTime) / 1000;
						clicksPerSecond = totalClicks / elapsedTimeInSeconds;
				}
				averageClicks.setText(String.format("Average Clicks: %.2f", clicksPerSecond));
			}));
			averageClicksTimer.setCycleCount(Animation.INDEFINITE);
			averageClicksTimer.play();
			
			//Options for buying in bulk
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
			//Increase number of clicks per second
			cpsIncrease.setOnAction(e -> {
				if (totalClicks >= cpsCost * purchaseAmount) {
					totalClicks = totalClicks - (cpsCost * purchaseAmount);
					cpsAmount =+ purchaseAmount;
					cpsCost = purchaseAmount * (cpsCost * 2);
					cpsTotal.setText(String.format("Amount: %d", cpsAmount));
					cpsPrice.setText(String.format("Price: %d", cpsCost));
					count.setText("Count: " + totalClicks);
				}
			});
			//Structure for all the auto clickers
			autoClicker1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(totalClicks >= Clicker1Cost) {
						totalClicks -= Clicker1Cost * purchaseAmount;
						count.setText("Count: " + totalClicks);
						Clicker1Amount += purchaseAmount;
						clicker1Total.setText("Amount: " + Clicker1Amount);
						Clicker1Cost = purchaseAmount * (Clicker1Cost * 2);
						clicker1Price.setText("Cost: " + Clicker1Cost);
					}
					if(autoClickerTimer1 == null) {
						autoClickerTimer1 = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								totalClicks += Clicker1Amount;
								count.setText("Count: " + totalClicks);
							}
						}));
						autoClickerTimer1.setCycleCount(Animation.INDEFINITE);
						autoClickerTimer1.play();
					}
				}
			});
			
			autoClicker2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(totalClicks >= Clicker2Cost) {
						totalClicks -= Clicker2Cost * purchaseAmount;
						count.setText("Count: " + totalClicks);
						Clicker2Amount += purchaseAmount;
						clicker2Total.setText("Amount: " + Clicker2Amount);
						Clicker2Cost = purchaseAmount * (2 * Clicker2Cost);
						clicker2Price.setText("Cost: " + Clicker2Cost);
					}
					if(autoClickerTimer2 == null) {
						autoClickerTimer2 = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								totalClicks += Clicker2Amount * 10;
								count.setText("Count: " + totalClicks);
							}
						}));
						autoClickerTimer2.setCycleCount(Animation.INDEFINITE);
						autoClickerTimer2.play();
					}
					
				}
			});
			
			autoClicker3.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(totalClicks >= Clicker3Cost) {
						totalClicks -= Clicker3Cost * purchaseAmount;
						count.setText("Count: " + totalClicks);
						Clicker3Amount += purchaseAmount;
						clicker3Total.setText("Amount: " + Clicker3Amount);
						Clicker3Cost = purchaseAmount * (2 * Clicker3Cost);
						clicker3Price.setText("Cost: " + Clicker3Cost);
					}
					if(autoClickerTimer3 == null) {
						autoClickerTimer3 = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								totalClicks += Clicker3Amount * 25;
								count.setText("Count: " + totalClicks);
							}
						}));
						autoClickerTimer3.setCycleCount(Animation.INDEFINITE);
						autoClickerTimer3.play();
					}
					
				}
			});
			
			autoClicker4.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(totalClicks >= Clicker4Cost) {
						totalClicks -= Clicker4Cost * purchaseAmount;
						count.setText("Count: " + totalClicks);
						Clicker4Amount += purchaseAmount;
						clicker4Total.setText("Amount: " + Clicker4Amount);
						Clicker4Cost = purchaseAmount * (2 * Clicker4Cost);
						clicker4Price.setText("Cost: " + Clicker4Cost);
					}
					if(autoClickerTimer4 == null) {
						autoClickerTimer4 = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								totalClicks += Clicker4Amount * 100;
								count.setText("Count: " + totalClicks);
							}
						}));
						autoClickerTimer4.setCycleCount(Animation.INDEFINITE);
						autoClickerTimer4.play();
					}
					
				}
			});
			
			autoClicker5.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(totalClicks >= Clicker5Cost) {
						totalClicks -= Clicker5Cost * purchaseAmount;
						count.setText("Count: " + totalClicks);
						Clicker5Amount += purchaseAmount;
						clicker5Total.setText("Amount: " + Clicker5Amount);
						Clicker5Cost = purchaseAmount * (2 * Clicker5Cost);
						clicker5Price.setText("Cost: " + Clicker5Cost);
					}
					if(autoClickerTimer5 == null) {
						autoClickerTimer5 = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								totalClicks += Clicker5Amount * 250;
								count.setText("Count: " + totalClicks);
							}
						}));
						autoClickerTimer5.setCycleCount(Animation.INDEFINITE);
						autoClickerTimer5.play();
					}
					
				}
			});
			
			autoClicker6.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(totalClicks >= Clicker6Cost) {
						totalClicks -= Clicker6Cost * purchaseAmount;
						count.setText("Count: " + totalClicks);
						Clicker6Amount += purchaseAmount;
						clicker6Total.setText("Amount: " + Clicker6Amount);
						Clicker6Cost = purchaseAmount * (2 * Clicker6Cost);
						clicker6Price.setText("Cost: " + Clicker6Cost);
					}
					if(autoClickerTimer6 == null) {
						autoClickerTimer6 = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								totalClicks += Clicker6Amount * 500;
								count.setText("Count: " + totalClicks);
							}
						}));
						autoClickerTimer6.setCycleCount(Animation.INDEFINITE);
						autoClickerTimer6.play();
					}
					
				}
			});
			
			autoClicker7.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(totalClicks >= Clicker7Cost) {
						totalClicks -= Clicker7Cost * purchaseAmount;
						count.setText("Count: " + totalClicks);
						Clicker7Amount += purchaseAmount;
						clicker7Total.setText("Amount: " + Clicker7Amount);
						Clicker7Cost = purchaseAmount * (2 * Clicker7Cost);
						clicker7Price.setText("Cost: " + Clicker7Cost);
					}
					if(autoClickerTimer7 == null) {
						autoClickerTimer7 = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								totalClicks += Clicker7Amount * 10000;
								count.setText("Count: " + totalClicks);
							}
						}));
						autoClickerTimer7.setCycleCount(Animation.INDEFINITE);
						autoClickerTimer7.play();
					}
					
				}
			});
			
	}

}
