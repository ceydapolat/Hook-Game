//150116504 Zehra Zeynep PEHLIVAN  
//150117065 Hümeyra Ceyda POLAT

import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Level2 implements LevelDrawer {

	private int secondsPassed = 0;  //game duration

	Text t = new Text("4");
 	int count = Integer.parseInt(t.getText());
 	
	Timer timer = new Timer();
	TimerTask task = new TimerTask(){
		public void run(){
			secondsPassed++;
		}
	};

	private static int arcControl2 = 0;
	private int buttonClicked, arcControl = 0; // both of is for, is button clicked or not
	Button b1 = new Button();
	Button b2 = new Button();
	Button b3 = new Button();
	Button b4 = new Button();
	Line line1 = new Line(265, 100, 265, 150);
    Line line2 = new Line(265, 190, 265, 290);
	Line line3 = new Line(265, 330, 265, 430);
	Line line4 = new Line(265, 430, 265, 530);
	Line line5 = new Line(255, 430, 275, 430);
	Line line6 = new Line(110, 170, 275, 170);
	Line line7 = new Line(100, 170, 110, 170);
	Line line8 = new Line(110, 160, 110, 180);
	Line line9 = new Line(100, 530, 100, 170);
	Line line10 = new Line(255, 310, 355, 310);
	Line line11 = new Line(395, 310, 560, 310);
	Line line12 = new Line(560, 300, 560, 320);
	Line line13 = new Line(560, 310, 570, 310);
	Line line14 = new Line(570, 310, 570, 530);
	Line line15 = new Line(375, 300, 375, 430);
	Line line16 = new Line(385, 430, 365, 430);
	Line line17 = new Line(375, 430, 375, 530);

	// Create a pane to hold the nodes
	Pane pane = new Pane();

	private Stage stage;

	//constructor of Level2
	public Level2(Stage stage) {
		this.stage = stage;
	}

	@Override
	public void drawLevel() {

		StackPane stack = new StackPane();
		 t.setFont(Font.font(75));
		 stack.getChildren().add(t);
		 
		timer.scheduleAtFixedRate(task, 1000, 1000);

		Circle circle1 = new Circle();
		circle1.setCenterX(100);
		circle1.setCenterY(550);
		circle1.setRadius(20);
		circle1.setStroke(Color.DARKCYAN);
		circle1.setFill(Color.DARKCYAN);

		Circle circle2 = new Circle();
		circle2.setCenterX(265);
		circle2.setCenterY(550);
		circle2.setRadius(20);
		circle2.setStroke(Color.DARKCYAN);
		circle2.setFill(Color.DARKCYAN);

		Circle circle3 = new Circle();
		circle3.setCenterX(375);
		circle3.setCenterY(550);
		circle3.setRadius(20);
		circle3.setStroke(Color.DARKCYAN);
		circle3.setFill(Color.DARKCYAN);

		Circle circle4 = new Circle();
		circle4.setCenterX(570);
		circle4.setCenterY(550);
		circle4.setRadius(20);
		circle4.setStroke(Color.DARKCYAN);
		circle4.setFill(Color.DARKCYAN);

		Arc arc1 = new Arc(265, 170, 20, 20, 90, -180);
		arc1.setFill(Color.WHITE);
		arc1.setType(ArcType.OPEN);
		arc1.setStroke(Color.BLACK);
		arc1.setFill(Color.AZURE);
		arc1.setStrokeWidth(3);

		Arc arc2 = new Arc(265, 310, 20, 20, 90, 180);
		arc2.setFill(Color.WHITE);
		arc2.setType(ArcType.OPEN);
		arc2.setStroke(Color.BLACK);
		arc2.setFill(Color.AZURE);
		arc2.setStrokeWidth(3);

		Arc arc3 = new Arc(375, 310, 20, 20, 180, -180);
		arc3.setFill(Color.WHITE);
		arc3.setType(ArcType.OPEN);
		arc3.setStroke(Color.BLACK);
		arc3.setFill(Color.AZURE);
		arc3.setStrokeWidth(3);

		line1.setStrokeWidth(3);
		line2.setStrokeWidth(3);
		line3.setStrokeWidth(3);
		line5.setStrokeWidth(3);
		line6.setStrokeWidth(3);
		line8.setStrokeWidth(3);
		line10.setStrokeWidth(3);
		line11.setStrokeWidth(3);
		line12.setStrokeWidth(3);
		line15.setStrokeWidth(3);
		line16.setStrokeWidth(3);

		EventHandler<ActionEvent> eventHandlerLine6 = e -> {
			continueloopLine6(line6);
		};
		EventHandler<ActionEvent> eventHandlerEnlargeLine8 = e -> {
			EnlargeLine8(line8);
		};

		EventHandler<ActionEvent> eventHandlerShrinkLine8 = e -> {
			ShrinkLine8(line8, line6);
		};

		EventHandler<ActionEvent> eventHandler1 = e -> {
			circleActions(circle1);
		};

		EventHandler<ActionEvent> eventHandler2 = e -> {
			circleActions(circle2);
		};

		EventHandler<ActionEvent> eventHandler3 = e -> {
			circleActions(circle3);
		};

		EventHandler<ActionEvent> eventHandler4 = e -> {
			circleActions(circle4);
		};

		EventHandler<ActionEvent> eventHandlerDisButton1 = e -> {
			disappearanceButton1(b1, circle1, line6);
		};

		EventHandler<ActionEvent> eventHandlerDecrLine3 = e -> {
			decrLine3(line3);
		};

		EventHandler<ActionEvent> eventHandlerDecrLine15 = e -> {
			decrLine15(line15);
		};

		EventHandler<ActionEvent> eventHandlerEnlargeLine5 = e -> {
			EnlargeLine5(line5);
		};

		EventHandler<ActionEvent> eventHandlerShrinkLine5 = e -> {
			ShrinkLine5(line5, line1);
		};

		EventHandler<ActionEvent> eventHandlerEnlargeLine16 = e -> {
			EnlargeLine16(line16);
		};

		EventHandler<ActionEvent> eventHandlerShrinkLine16 = e -> {
			ShrinkLine16(line16, line15);
		};

		EventHandler<ActionEvent> eventHandlerDisButton3 = e -> {
			disappearanceButton3(b3, circle3, line15);
		};

		EventHandler<ActionEvent> eventHandlerShrinkLine11 = e -> {
			continueloopLine11(line11);
		};

		EventHandler<ActionEvent> eventHandlerEnlargeLine12 = e -> {
			EnlargeLine12(line12);
		};

		EventHandler<ActionEvent> eventHandlerShrinkLine12 = e -> {
			ShrinkLine12(line12, line10, line11);
		};

		EventHandler<ActionEvent> eventHandlerLine10 = e -> {
			continueloopLine10(line10);
		};

		EventHandler<ActionEvent> eventHandlercontinueloopArc3 = e -> {
			continueloopArc3(arc3);
		};

		EventHandler<ActionEvent> eventHandlerLine11 = e -> {
			decr_line11(line11);
		};

		EventHandler<ActionEvent> eventHandlerDisButton4 = e -> {
			disappearanceButton4(b4, circle4, line12);
		};

		EventHandler<ActionEvent> eventHandlerLine1 = e -> {
			continueloopLine1(line1);
		};

		EventHandler<ActionEvent> eventHandlerLine2 = e -> {
			continueloopLine2(line2);
		};

		EventHandler<ActionEvent> eventHandlerArc1 = e -> {
			continueloopArc1(arc1);
		};

		EventHandler<ActionEvent> eventHandlerArc2 = e -> {
			continueloopArc2(arc2);
		};

		EventHandler<ActionEvent> eventHandlerDisButton2 = e -> {
			disappearanceButton2(b2, circle2, line1);
		};

		EventHandler<ActionEvent> eventHandlerdecrOpacity = e -> {
	        decrOpacity();
	    };


		// Created a button 1
		b1.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
				+ "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
		b1.setLayoutX(80);
		b1.setLayoutY(530);

		// Created a button 2
		b2.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
				+ "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
		b2.setLayoutX(245);
		b2.setLayoutY(530);

		// Created a button 3
		b3.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
				+ "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
		b3.setLayoutX(355);
		b3.setLayoutY(530);

		// Created a button 4
		b4.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
				+ "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
		b4.setLayoutX(550);
		b4.setLayoutY(530);

		// Set on action to b1
		b1.setOnAction(new EventHandler<ActionEvent>() { //there is no collision
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				buttonClicked = 1;
				arcControl = 1;// button 1 is clicked
				count();
				// Animation for enlarge and shrink
				Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler1));
				animationButton.setCycleCount(2);
				animationButton.play();

				// Animation for line
				Timeline animationLine6 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerLine6));
				animationLine6.setCycleCount(165);
				animationLine6.play();

				// Animation for enlarge of line8
				Timeline animationEnlargeLine8 = new Timeline(
						new KeyFrame(Duration.millis(100), eventHandlerEnlargeLine8));
				animationEnlargeLine8.setCycleCount(5);
				animationEnlargeLine8.play();

				// Animation for shrink line8
				Timeline animationShrinkLine8 = new Timeline(
						new KeyFrame(Duration.millis(40), eventHandlerShrinkLine8));
				animationShrinkLine8.setCycleCount(44);
				animationShrinkLine8.play();

				// line7 is disappearing
				FadeTransition ft7 = new FadeTransition(Duration.millis(1500), line7);
				ft7.setFromValue(5.0);
				ft7.setToValue(0);
				ft7.play();

				// line9 is disappearing
				FadeTransition ft9 = new FadeTransition(Duration.millis(1500), line9);
				ft9.setFromValue(5.0);
				ft9.setToValue(0);
				ft9.play();

				Timeline animationDisButton1 = new Timeline(new KeyFrame(Duration.millis(40), eventHandlerDisButton1));
				animationDisButton1.setCycleCount(44);
				animationDisButton1.play();
			}
		});

		// Set on action for b2
		b2.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				secondsPassed = 0;
				count();
				// Animation for enlarge and shrink
				Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler2));
				animationButton.setCycleCount(2);
				animationButton.play();

				// Animation for enlarge of line5
				Timeline animationEnlargeLine5 = new Timeline(
						new KeyFrame(Duration.millis(80), eventHandlerEnlargeLine5));
				animationEnlargeLine5.setCycleCount(7);
				animationEnlargeLine5.play();

				if (buttonClicked == 0) {  // if collision appears

					System.out.println("1");     // Firstly clicked button 2
					PathTransition pt = new PathTransition(Duration.millis(500), new Line(265, 125, 265, 140), line1);
					pt.play();

					PathTransition pta1 = new PathTransition(Duration.millis(500), new Line(275, 170, 275, 185), arc1);
					pta1.play();

					PathTransition pt2 = new PathTransition(Duration.millis(500), new Line(265, 240, 265, 255), line2);
					pt2.play();

					PathTransition pta2 = new PathTransition(Duration.millis(500), new Line(255, 310, 255, 325), arc2);
					pta2.play();

					// animation for line3 when collision
					Timeline animationDecrLine3 = new Timeline(
							new KeyFrame(Duration.millis(30), eventHandlerDecrLine3));
					animationDecrLine3.setCycleCount(15);
					animationDecrLine3.play();

					Timeline animationPaneOpacity = new Timeline(
                            new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
                    animationPaneOpacity.setCycleCount(15);
                    animationPaneOpacity.play();

				} else if ((buttonClicked == 1 || buttonClicked == 4)) {

					if ((line6.getEndX() < 275) && (line10.getStartX() == 255)) { // if button 1 is clicked but button 4 is not, there is collision

						PathTransition pt = new PathTransition(Duration.millis(500), new Line(265, 125, 265, 140),
								line1);
						pt.play();

						PathTransition pta1 = new PathTransition(Duration.millis(500), new Line(275, 170, 275, 185),
								arc1);
						pta1.play();

						PathTransition pt2 = new PathTransition(Duration.millis(500), new Line(265, 240, 265, 255),
								line2);
						pt2.play();

						PathTransition pta2 = new PathTransition(Duration.millis(500), new Line(255, 310, 255, 325),
								arc2);
						pta2.play();

						// animation for line3 when collision
						Timeline animationDecrLine3 = new Timeline(
								new KeyFrame(Duration.millis(30), eventHandlerDecrLine3));
						animationDecrLine3.setCycleCount(15);
						animationDecrLine3.play();

						Timeline animationPaneOpacity = new Timeline(
                                new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
                        animationPaneOpacity.setCycleCount(15);
                        animationPaneOpacity.play();

					} else if (line10.getStartX() > 255 && line6.getEndX() == 275) {// if button 4 is clicked but button 1 is not, there is collision

						PathTransition pt = new PathTransition(Duration.millis(500), new Line(265, 125, 265, 140),
								line1);
						pt.play();

						PathTransition pta1 = new PathTransition(Duration.millis(500), new Line(275, 170, 275, 185),
								arc1);
						pta1.play();

						PathTransition pt2 = new PathTransition(Duration.millis(500), new Line(265, 240, 265, 255),
								line2);
						pt2.play();

						PathTransition pta2 = new PathTransition(Duration.millis(500), new Line(255, 310, 255, 325),
								arc2);
						pta2.play();

						// animation for line3 when collision
						Timeline animationDecrLine3 = new Timeline(
								new KeyFrame(Duration.millis(30), eventHandlerDecrLine3));
						animationDecrLine3.setCycleCount(15);
						animationDecrLine3.play();

						Timeline animationPaneOpacity = new Timeline(
                                new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
                        animationPaneOpacity.setCycleCount(15);
                        animationPaneOpacity.play();

					} else if (line6.getEndX() < 275 && line10.getStartX() > 255) { // button1 and button2 is already clicked so there is no collision

						// animation for line3 when collision
						Timeline animationDecrLine3 = new Timeline(
								new KeyFrame(Duration.millis(6), eventHandlerDecrLine3));
						animationDecrLine3.setCycleCount(200);
						animationDecrLine3.play();

						// Animation for line1
						Timeline animationLine1 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerLine1));
						animationLine1.setCycleCount(400);
						animationLine1.play();

						// Animation for line1
						Timeline animationLine2 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerLine2));
						animationLine2.setCycleCount(400);
						animationLine2.play();

						// Animation for arc1
						Timeline animationArc1 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerArc1));
						animationArc1.setCycleCount(276);
						animationArc1.play();

						// Animation for arc2
						Timeline animationArc2 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerArc2));
						animationArc2.setCycleCount(136);
						animationArc2.play();

						// line4 is disappearing
						FadeTransition ftLine4 = new FadeTransition(Duration.millis(2000), line4);
						ftLine4.setFromValue(5.0);
						ftLine4.setToValue(0);
						ftLine4.play();

						// Animation for shrink line5
						Timeline animationShrinkLine5 = new Timeline(
								new KeyFrame(Duration.millis(30), eventHandlerShrinkLine5));
						animationShrinkLine5.setCycleCount(100);
						animationShrinkLine5.play();

						// button2 disappearing
						Timeline animationDisButton2 = new Timeline(
								new KeyFrame(Duration.millis(35), eventHandlerDisButton2));
						animationDisButton2.setCycleCount(100);
						animationDisButton2.play();

						// pane is disappearing
						FadeTransition ft = new FadeTransition(Duration.millis(1000000), pane);
						ft.setFromValue(5.0);
						ft.setToValue(0);
						ft.play();

					}
				} else if (buttonClicked == 3) { // Finally clicked button 3 there is collision


					PathTransition pt = new PathTransition(Duration.millis(500), new Line(265, 125, 265, 140), line1);
					pt.play(); // Start animation

					PathTransition pta1 = new PathTransition(Duration.millis(500), new Line(275, 170, 275, 185), arc1);
					pta1.play();

					PathTransition pt2 = new PathTransition(Duration.millis(500), new Line(265, 240, 265, 255), line2);
					pt2.play(); // Start animation

					PathTransition pta2 = new PathTransition(Duration.millis(500), new Line(255, 310, 255, 325), arc2);
					pta2.play();

					// animation for line3 when collision
					Timeline animationDecrLine3 = new Timeline(
							new KeyFrame(Duration.millis(30), eventHandlerDecrLine3));
					animationDecrLine3.setCycleCount(15);
					animationDecrLine3.play();

					//Animation for decrement opacity when collision occurs
					Timeline animationPaneOpacity = new Timeline(
                            new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
                    animationPaneOpacity.setCycleCount(15);
                    animationPaneOpacity.play();
				}

			}
		});

		// Set on action for b3
		b3.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				buttonClicked = 3;
				count();
				
				// Animation for enlarge and shrink
				Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler3));
				animationButton.setCycleCount(2);
				animationButton.play();


				// animation for line15 when collision
				Timeline animationDecrLine15 = new Timeline(new KeyFrame(Duration.millis(8), eventHandlerDecrLine15));
				animationDecrLine15.setCycleCount(130);
				animationDecrLine15.play();

				// Animation for enlarge of line16
				Timeline animationEnlargeLine16 = new Timeline(
						new KeyFrame(Duration.millis(100), eventHandlerEnlargeLine16));
				animationEnlargeLine16.setCycleCount(5);
				animationEnlargeLine16.play();

				// Animation for shrink line16
				Timeline animationShrinkLine16 = new Timeline(
						new KeyFrame(Duration.millis(30), eventHandlerShrinkLine16));
				animationShrinkLine16.setCycleCount(60);
				animationShrinkLine16.play();

				// line17 is disappearing
				FadeTransition ftLine17 = new FadeTransition(Duration.millis(2000), line17);
				ftLine17.setFromValue(5.0);
				ftLine17.setToValue(0);
				ftLine17.play();

				// button3 disappearing when collision occurs
				Timeline animationDisButton3 = new Timeline(new KeyFrame(Duration.millis(30), eventHandlerDisButton3));
				animationDisButton3.setCycleCount(54);
				animationDisButton3.play();
			}
		});

		// Set on action for b4
		b4.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
               secondsPassed=0;
               buttonClicked = 4;
               count();
				// Animation for enlarge and shrink
				Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler4));
				animationButton.setCycleCount(2);
				animationButton.play();

				if (line15.getStartY() > 300) {// if button 3 is clicked there is no collision

					// Animation for line10
					Timeline animationLine10 = new Timeline(new KeyFrame(Duration.millis(8), eventHandlerLine10));
					animationLine10.setCycleCount(400);
					animationLine10.play();

					// Animation for line11
					Timeline animationLine11 = new Timeline(new KeyFrame(Duration.millis(8), eventHandlerLine11));
					animationLine11.setCycleCount(400);
					animationLine11.play();

					// Animation for enlarge of line12
					Timeline animationEnlargeLine12 = new Timeline(
							new KeyFrame(Duration.millis(100), eventHandlerEnlargeLine12));
					animationEnlargeLine12.setCycleCount(5);
					animationEnlargeLine12.play();

					// Animation for arc3
					Timeline animationArc3 = new Timeline(
							new KeyFrame(Duration.millis(8), eventHandlercontinueloopArc3));
					animationArc3.setCycleCount(224);
					animationArc3.play();

					// Animation for shrink line12
					Timeline animationShrinkLine12 = new Timeline(
							new KeyFrame(Duration.millis(40), eventHandlerShrinkLine12));
					animationShrinkLine12.setCycleCount(80);
					animationShrinkLine12.play();

					// Animation for disappearing button4
					Timeline animationDisButton4 = new Timeline(
							new KeyFrame(Duration.millis(20), eventHandlerDisButton4));
					animationDisButton4.setCycleCount(200);
					animationDisButton4.play();

					// line13 is disappearing
					FadeTransition ft13 = new FadeTransition(Duration.millis(1500), line13);
					ft13.setFromValue(5.0);
					ft13.setToValue(0);
					ft13.play();

					// line14 is disappearing
					FadeTransition ft14 = new FadeTransition(Duration.millis(1500), line14);
					ft14.setFromValue(5.0);
					ft14.setToValue(0);
					ft14.play();
				} else {// if button 3 is not clicked

					// Animation for shrink line11
					Timeline shrinkLine11 = new Timeline(new KeyFrame(Duration.millis(30), eventHandlerShrinkLine11));
					shrinkLine11.setCycleCount(17);
					shrinkLine11.play();

					PathTransition pta3 = new PathTransition(Duration.millis(500), new Line(375, 300, 390, 300), arc3);
					pta3.play();

					PathTransition ptline10 = new PathTransition(Duration.millis(500), new Line(305, 310, 320, 310),
							line10);
					ptline10.play();

					// Animation for enlarge of line12
					Timeline animationEnlargeLine12 = new Timeline(
							new KeyFrame(Duration.millis(100), eventHandlerEnlargeLine12));
					animationEnlargeLine12.setCycleCount(5);
					animationEnlargeLine12.play();

					//Animation for decrement opacity when collision occurs
					Timeline animationPaneOpacity = new Timeline(
                            new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
                    animationPaneOpacity.setCycleCount(15);
                    animationPaneOpacity.play();
				}
			}
		});

		// Added nodes to the pane
		pane.getChildren().addAll(circle1, circle2, circle3, circle4, b1, b2, b3, b4, arc1, arc2, arc3, line1, line2,
				line3, line4, line5, line6, line7, line8, line9, line10, line11, line12, line13, line14, line15, line16,
				line17, stack);

		 pane.setStyle("-fx-background-color: azure;");
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 650, 650, Color.AZURE);
		stage.setTitle("GAME"); // Set the stage title
		stage.setScene(scene); // Place the scene in the stage
		stage.setResizable(false);// Set stage resizable
		stage.show(); // Display the stage
	}

	@Override
	public void onSuccess() {
		new Level3(stage).drawLevel();
	}

	@Override
	public void onFail() {
		new Level2(stage).drawLevel();
	}

	@Override
	public void moveFail() {
		new Level1(stage).drawLevel();
	}

	public boolean continueloopLine6(Line line) {	// Created a method for disappearance of line 6

		if (line.getEndX() == 110) {
			pane.getChildren().remove(line);

		} else if (line.getEndX() != 110) {
			line.setEndX(line.getEndX() - 1);
		}

		return true;
	}


	public boolean EnlargeLine8(Line line) { // enlarge line 8when button is clicked
		line.setEndY(line.getEndY() + 2);
		line.setStartY(line.getStartY() - 2);
		return true;
	}


	public boolean ShrinkLine8(Line line, Line line6) { //disappearance line8 if there is no collision when button is clicked line8
		if (line6.getEndX() == 110) {
			line.setEndY(line.getEndY() - 1);
			line.setStartY(line.getStartY() + 1);
		}

		if (line.getStartY() == line.getEndY()) {
			pane.getChildren().removeAll(line6, line);
			return false;
		}
		return true;
	}


	public void circleActions(Circle circle) {  // button action method
		if (circle.getRadius() - 7 >= 20) {
			for (int i = 0; i <= 7; i++) {
				circle.setRadius(circle.getRadius() - 1);
			}
		} else {
			for (int i = 0; i < 7; i++) {
				circle.setRadius(circle.getRadius() + 1);
			}
		}
	}


	public boolean disappearanceButton3(Button button, Circle circle, Line line) {   //disappearance button3 if there is no collision when button is clicked
		pane.getChildren().remove(button);

		if (line.getStartY() == line.getEndY()) {
			circle.setRadius(circle.getRadius() - 1);
		}

		return true;
	}


	public boolean disappearanceButton4(Button button, Circle circle, Line line) {   //disappearance button4 if there is no collision when button is clicked
			pane.getChildren().remove(button);

			if (line.getStartY() >= 307) {
				circle.setRadius(circle.getRadius() - 1);
			}
			return true;
			}

	public boolean disappearanceButton1(Button button, Circle circle, Line line) {  //disappearance button1 if there is no collision when button is clicked
		pane.getChildren().remove(button);

		if (line.getEndX() == 110) {
			circle.setRadius(circle.getRadius() - 1);
		}

		return true;
	}

	public boolean disappearanceButton2(Button button, Circle circle, Line line1) {  //disappearance button2 if there is no collision when button is clicked
		 pane.getChildren().remove(button);

		 if (line1.getStartY() >= 430 ) {

		 circle.setRadius(circle.getRadius() - 1);
		 if (circle.getRadius() == 0) {
		 onSuccess();
		 }
		 }

		return true;
	}

	public void decrLine3(Line line) {    //decrement line15
		line.setStartY(line.getStartY() + 1);
		if (line.getEndY() == line.getStartY())
			pane.getChildren().remove(line);

		if(line8.getEndY()== 160|| line13.getStartY() ==300  ){
			onFail();
		}
	}

	public void decrLine15(Line line) {  //decrement line15
		line.setStartY(line.getStartY() + 1);
		if (line.getEndY() == line.getStartY())
			pane.getChildren().remove(line);
		}

	public boolean EnlargeLine5(Line line) { // enlarge line5 when button is clicked
		line.setEndX(line.getEndX() + 2);
		line.setStartX(line.getStartX() - 2);
		return true;
	}

	public void ShrinkLine5(Line line, Line line1) { // line5 is disappearing

		if (line1.getStartY() >= 430) {
			line.setStartX(line.getStartX() + 1);
			line.setEndX(line.getEndX() - 1);
		}

		if (line.getEndX() == line.getStartX()) {
			pane.getChildren().remove(line);
		}
	}

	public boolean EnlargeLine16(Line line) { // enlarge line16 when button is clicked
		line.setEndX(line.getEndX() - 2);
		line.setStartX(line.getStartX() + 2);
		return true;
	}

	public boolean ShrinkLine16(Line line, Line line15) { // line16 is disappearing

		if (line15.getStartY() == line15.getEndY()) {
			line.setEndX(line.getEndX() + 1);
			line.setStartX(line.getStartX() - 1);
		}

		if (line.getStartX() == line.getEndX()) {
			pane.getChildren().remove(line);
			return false;
		}
		return true;
	}


	public boolean EnlargeLine12(Line line) {  // enlarge line12 when button is clicked
		line.setEndY(line.getEndY() + 2);
		line.setStartY(line.getStartY() - 2);
		return true;
	}


	public boolean ShrinkLine12(Line line, Line line10, Line line11) {  // shrink line12
		if (line10.getStartX() == 560) {
			line.setEndY(line.getEndY() - 1);
			line.setStartY(line.getStartY() + 1);
		}
		if (line.getStartY() == line.getEndY()) {
			pane.getChildren().removeAll(line10, line, line11);
			return false;
		}
		return true;
	}


	public boolean continueloopLine10(Line line) { // Created a method for disappearance of line10
		if (line.getStartX() != 560 && line.getEndX() != 560) {
			line.setStartX(line.getStartX() + 1);
			line.setEndX(line.getEndX() + 1);
		} else if (line.getEndX() == 560 && line.getStartX() != 560)
			line.setStartX(line.getStartX() + 1);
		else if (line.getStartX() == 560 && line.getEndX() == 560) {
			pane.getChildren().remove(line);
			return false;
		}
		return true;
	}


	public void continueloopLine11(Line line) {	 // Created a method for disappearance of line11
		line.setStartX(line.getStartX() + 1);
	}


	public boolean continueloopArc3(Arc arc) {   // Created a method for disappearance of arc3
		if (arc.getCenterX() <= 536) {
			arc.setCenterX(arc.getCenterX() + 1);

		} else if (arc.getCenterX() > 536 && arc.getCenterX() < 580) {
			arc.setLength(arc.getLength() + 4);
			arc.setCenterX(arc.getCenterX() + 1);
		} else if (arc.getCenterX() == 580 && arcControl <= 7) {

			arc.setLength(arc.getLength() + 4);
			arcControl2++;

			if (arc.getLength() == 0)
				pane.getChildren().remove(arc);
		}
		return true;
	}


	public boolean decr_line11(Line line) {  // Created a method for disappearance of line 11

		if (line.getStartX() == 560) {
			return false;
		} else if (line.getStartX() != 560) {
			line.setStartX(line.getStartX() + 1);
		}
		return true;
	}


	public boolean continueloopLine1 (Line line) {  // Created a method for disappearance of line1
		if (line.getStartY() != 430 && line.getEndY() != 430) {
			line.setStartY(line.getStartY() + 1);
			line.setEndY(line.getEndY() + 1);
		} else if (line.getEndY() == 430 && line.getStartY() != 430)
			line.setStartY(line.getStartY() + 1);

		else if (line.getStartY() == 430 && line.getEndY() == 430) {
			pane.getChildren().remove(line);
			return false;
		}
		return true;
	}

	public boolean continueloopLine2(Line line) {  	// Created a method for disappearance of line2

		if (line.getStartY() != 430 && line.getEndY() != 430) {
			line.setStartY(line.getStartY() + 1);
			line.setEndY(line.getEndY() + 1);
		} else if (line.getEndY() == 430 && line.getStartY() != 430)
			line.setStartY(line.getStartY() + 1);

		else if (line.getStartY() == 430 && line.getEndY() == 430) {
			pane.getChildren().remove(line);
			return false;
		}
		return true;
	}


	public boolean continueloopArc1(Arc arc) {   // Created a method for disappearance of arc1

		if (arc.getCenterY() <= 400) {
			arc.setCenterY(arc.getCenterY() + 1);
			return true;
		} else if (arc.getCenterY() > 400 && arc.getCenterY() < 445) {
			arc.setLength(arc.getLength() + 4);
			arc.setCenterY(arc.getCenterY() + 1);
			return true;
		} else if (arc.getCenterY() == 445 && arcControl <= 7) {
			arc.setLength(arc.getLength() + 4);
			arcControl++;
			return true;
		}
		return true;
	}

	public boolean continueloopArc2(Arc arc) {  // Created a method for disappearance of arc2

		if (arc.getCenterY() <= 400) {
			arc.setCenterY(arc.getCenterY() + 1);
			return true;
		} else if (arc.getCenterY() > 400 && arc.getCenterY() < 445) {
			arc.setLength(arc.getLength() - 4);
			arc.setCenterY(arc.getCenterY() + 1);
			return true;
		} else if (arc.getCenterY() == 445 && arcControl <= 7) {
			arc.setLength(arc.getLength() - 4);
			arcControl++;
			return true;
		}
		return true;
	}

	public void decrOpacity(){ //Decrements pane opacity
    	pane.setOpacity(pane.getOpacity() - 0.1);
    	if(secondsPassed == 2){
    		onFail();
    	}
    }

	public void count(){
		count--;
		String s2 = Integer.toString(count);
    	t.setText(s2);
    	if(count < 0){
    		moveFail();   	
	    }
	}
}