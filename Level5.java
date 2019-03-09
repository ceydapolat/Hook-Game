//150116504 Zehra Zeynep PEHLIVAN  
//150117065 Hümeyra Ceyda POLAT
import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.*;
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

public class Level5 implements LevelDrawer {

	int secondsPassed = 0;//Game duration

	Text t = new Text("8");

 	int count = Integer.parseInt(t.getText());
 	
	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
		public void run() {
			secondsPassed++;
		}
	};

	private int buttonClicked, arcControl = 0;
	private final Stage stage;
	public int connectorControl1 = 0; // rotate control variable
	public int connectorControl2 = 0; // rotate control variable2

	Button b1 = new Button();
	Button b2 = new Button();
	Button b3 = new Button();
	Button b4 = new Button();
	Button b5 = new Button();
	Button b6 = new Button();
	Line line1 = new Line(240, 450, 280, 450);
	Line line2 = new Line(260, 330, 260, 370);
	Line line3 = new Line(260, 470, 260, 510);
	Line line4 = new Line(140, 450, 240, 450);
	Line line5 = new Line(260, 370, 260, 430);
	Line line6 = new Line(140, 350, 240, 350);
	Line line7 = new Line(260, 140, 260, 330);
	Line line8 = new Line(260, 140, 270, 140);
	Line line9 = new Line(270, 130, 270, 150);
	Line line10 = new Line(270, 140, 360, 140);
	Line line11 = new Line(400, 140, 540, 140);
	Line line12 = new Line(530, 100, 530, 120);
	Line line13 = new Line(530, 160, 530, 440);
	Line line14 = new Line(520, 440, 540, 440);
	Line line15 = new Line(530, 440, 530, 450);
	Line line16 = new Line(280, 450, 530, 450);
	Line line17 = new Line(280, 350, 380, 350);
	Line line18 = new Line(380, 340, 380, 350);
	Line line19 = new Line(370, 340, 390, 340);
	Line line20 = new Line(380, 190, 380, 340);
	Line line21 = new Line(380, 130, 380, 150);
	Line line22 = new Line(470, 170, 470, 510);
	Line line23 = new Line(460, 170, 470, 170);
	Line line24 = new Line(460, 160, 460, 180);
	Line line25 = new Line(370, 170, 460, 170);
	Arc arc1 = new Arc(380, 140, 20, 20, 0, 180);
	Arc arc2 = new Arc(380, 170, 20, 20, 90, 180);
	Arc arc3 = new Arc(530, 140, 20, 20, 90, -180);

	// Create a pane to hold the nodes
	Pane pane = new Pane();

	public Level5(Stage stage) {//Level5 contstructor
		this.stage = stage;
	}

	@Override
	public void drawLevel() {
		
		StackPane stack = new StackPane();
		 t.setFont(Font.font(75));
		 stack.getChildren().add(t);
		 
		timer.scheduleAtFixedRate(task, 1000, 1000);

		Circle circle1 = new Circle();
		circle1.setCenterX(260);
		circle1.setCenterY(530);
		circle1.setRadius(20);
		circle1.setStroke(Color.DARKCYAN);
		circle1.setFill(Color.DARKCYAN);

		Circle circle2 = new Circle();
		circle2.setCenterX(470);
		circle2.setCenterY(530);
		circle2.setRadius(20);
		circle2.setStroke(Color.DARKCYAN);
		circle2.setFill(Color.DARKCYAN);

		Circle circle3 = new Circle();
		circle3.setCenterX(120);
		circle3.setCenterY(450);
		circle3.setRadius(20);
		circle3.setStroke(Color.DARKCYAN);
		circle3.setFill(Color.DARKCYAN);

		Circle circle4 = new Circle();
		circle4.setCenterX(260);
		circle4.setCenterY(450);
		circle4.setRadius(20);
		circle4.setStroke(Color.DARKCYAN);
		circle4.setFill(Color.DARKCYAN);
		circle4.setStrokeWidth(3);

		Circle circle5 = new Circle();
		circle5.setCenterX(260);
		circle5.setCenterY(350);
		circle5.setRadius(20);
		circle5.setStroke(Color.DARKCYAN);
		circle5.setFill(Color.DARKCYAN);
		circle5.setStrokeWidth(3);

		Circle circle6 = new Circle();
		circle6.setCenterX(120);
		circle6.setCenterY(350);
		circle6.setRadius(20);
		circle6.setStroke(Color.DARKCYAN);
		circle6.setFill(Color.DARKCYAN);

		// Created a button 1
		b1.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
				+ "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
		b1.setLayoutX(240);
		b1.setLayoutY(510);

		// Created a button 2
		b2.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
				+ "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
		b2.setLayoutX(450);
		b2.setLayoutY(510);

		// Created a button 3
		b3.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
				+ "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
		b3.setLayoutX(100);
		b3.setLayoutY(430);

		// Created a button 4
		b4.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 36px; " + "-fx-min-height: 36px; "
				+ "-fx-max-width: 36px; " + "-fx-max-height: 36px;" + "-fx-background-color: azure;");
		b4.setLayoutX(242);
		b4.setLayoutY(431);

		// Created a button 5
		b5.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 36px; " + "-fx-min-height: 36px; "
				+ "-fx-max-width: 36px; " + "-fx-max-height: 36px;" + "-fx-background-color: azure;");
		b5.setLayoutX(242);
		b5.setLayoutY(331);

		// Created a button 4
		b6.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
				+ "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
		b6.setLayoutX(100);
		b6.setLayoutY(330);

		arc1.setFill(Color.WHITE);
		arc1.setType(ArcType.OPEN);
		arc1.setStroke(Color.BLACK);
		arc1.setFill(Color.AZURE);
		arc1.setStrokeWidth(3);

		arc2.setFill(Color.WHITE);
		arc2.setType(ArcType.OPEN);
		arc2.setStroke(Color.BLACK);
		arc2.setFill(Color.AZURE);
		arc2.setStrokeWidth(3);

		arc3.setFill(Color.WHITE);
		arc3.setType(ArcType.OPEN);
		arc3.setStroke(Color.BLACK);
		arc3.setFill(Color.AZURE);
		arc3.setStrokeWidth(3);

		line9.setStrokeWidth(3);
		line10.setStrokeWidth(3);
		line11.setStrokeWidth(3);
		line12.setStrokeWidth(3);
		line13.setStrokeWidth(3);
		line14.setStrokeWidth(3);
		line19.setStrokeWidth(3);
		line20.setStrokeWidth(3);
		line21.setStrokeWidth(3);
		line24.setStrokeWidth(3);
		line25.setStrokeWidth(3);

		EventHandler<ActionEvent> eventHandler1 = e -> {
			circleActions(circle1);
		};

		EventHandler<ActionEvent> eventHandler2 = e -> {
			circleActions(circle2);
		};

		EventHandler<ActionEvent> eventHandler3 = e -> {
			circleActions(circle3);
		};

		EventHandler<ActionEvent> eventHandler6 = e -> {
			circleActions(circle6);
		};
		EventHandler<ActionEvent> eventHandlerEnlargeLine9 = e -> {
			EnlargeLine9_24(line9);
		};

		EventHandler<ActionEvent> eventHandlerEnlargeLine24 = e -> {
			EnlargeLine9_24(line24);
		};

		EventHandler<ActionEvent> eventHandlerShrinkLine9 = e -> {
			ShrinkLine9(line9, line11);
		};

		EventHandler<ActionEvent> eventHandlerShrinkLine24 = e -> {
			ShrinkLine24(line24, line25);
		};

		EventHandler<ActionEvent> eventHandlerEnlargeLine14 = e -> {
			EnlargeLine14_19(line14);
		};

		EventHandler<ActionEvent> eventHandlerEnlargeLine19 = e -> {
			EnlargeLine14_19(line19);
		};

		EventHandler<ActionEvent> eventHandlerShrinkLine14 = e -> {
			ShrinkLine14(line14, line12);
		};

		EventHandler<ActionEvent> eventHandlerShrinkLine19 = e -> {
			ShrinkLine19(line19, line21);
		};

		EventHandler<ActionEvent> eventHandlerDecrLine10 = e -> {
			decrLine10(line10);
		};

		EventHandler<ActionEvent> eventHandlerLine11 = e -> {
			DisLine11(line11);
		};

		EventHandler<ActionEvent> eventHandlerArc1 = e -> {
			DisArc1(arc1);
		};

		EventHandler<ActionEvent> eventHandlerDisButton1 = e -> {
			disappearanceButton1(b1, circle1, line11);
		};

		EventHandler<ActionEvent> eventHandlerDisButton2 = e -> {
			disappearanceButton2(b2, circle2, line25);
		};

		EventHandler<ActionEvent> eventHandlerDecrLine25 = e -> {
			decrLine25(line25);
		};

		EventHandler<ActionEvent> eventHandlerDecrLine13 = e -> {
			decrLine13(line13);
		};

		EventHandler<ActionEvent> eventHandlerLine12 = e -> {
			disLine12(line12);
		};

		EventHandler<ActionEvent> eventHandlerArc3 = e -> {
			DisArc3(arc3);
		};

		EventHandler<ActionEvent> eventHandlerDisButton3 = e -> {
			disappearanceButton3(b3, circle3, line13);
		};

		EventHandler<ActionEvent> eventHandlerDecrLine20 = e -> {
			decrLine20(line20);
		};

		EventHandler<ActionEvent> eventHandlerLine21 = e -> {
			continueloopLine21(line21);
		};

		EventHandler<ActionEvent> eventHandlerArc2 = e -> {
			continueloopArc2(arc2);
		};

		EventHandler<ActionEvent> eventHandlerDisButton6 = e -> {
			disappearanceButton6(b6, circle6, line21);
		};

		EventHandler<ActionEvent> eventHandlerdecrOpacity = e -> {
			decrOpacity();
		};

		b1.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				buttonClicked = 1;
				secondsPassed = 0;
				count();

				if (connectorControl1 % 2 == 1) {

					// Animation button for enlarge and shrink of line1
					Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler1));
					animationButton.setCycleCount(2);
					animationButton.play();

					// Animation for enlarge of line9
					Timeline animationEnlargeLine9 = new Timeline(
							new KeyFrame(Duration.millis(100), eventHandlerEnlargeLine9));
					animationEnlargeLine9.setCycleCount(5);
					animationEnlargeLine9.play();

					if (line21.getStartY() <= 130) { // button6 is not clicked, if collision appears

						PathTransition pt = new PathTransition(Duration.millis(500), new Line(470, 140, 455, 140),
								line11);
						pt.play();

						PathTransition pt1 = new PathTransition(Duration.millis(500), new Line(380, 130, 365, 130),
								arc1);
						pt1.play();

						//Animation for line10 when collision appears
						Timeline animationDecrLine10 = new Timeline(
								new KeyFrame(Duration.millis(30), eventHandlerDecrLine10));
						animationDecrLine10.setCycleCount(15);
						animationDecrLine10.play();

						 //Animation for decrement pane opacity
						Timeline animationPaneOpacity = new Timeline(
								new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
						animationPaneOpacity.setCycleCount(15);
						animationPaneOpacity.play();
					} else {

						// Animation for line11
						Timeline animationLine11 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerLine11));
						animationLine11.setCycleCount(400);
						animationLine11.play();

						// Animation for arc1
						Timeline animationArc1 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerArc1));
						animationArc1.setCycleCount(131);
						animationArc1.play();

						//Disappearing line2
						Timeline animationDecrLine2 = new Timeline(
								new KeyFrame(Duration.millis(6), eventHandlerDecrLine10));
						animationDecrLine2.setCycleCount(100);
						animationDecrLine2.play();

						// Animation for shrink line9
						Timeline animationShrinkLine9 = new Timeline(
								new KeyFrame(Duration.millis(50), eventHandlerShrinkLine9));
						animationShrinkLine9.setCycleCount(100);
						animationShrinkLine9.play();

						// line7 is disappearing
						FadeTransition ft7 = new FadeTransition(Duration.millis(2500), line7);
						ft7.setFromValue(5.0);
						ft7.setToValue(0);
						ft7.play();

						// line5 is disappearing
						FadeTransition ft5 = new FadeTransition(Duration.millis(2500), line5);
						ft5.setFromValue(5.0);
						ft5.setToValue(0);
						ft5.play();

						// line3 is disappearing
						FadeTransition ft3 = new FadeTransition(Duration.millis(2500), line3);
						ft3.setFromValue(5.0);
						ft3.setToValue(0);
						ft3.play();

						// line8 is disappearing
						FadeTransition ft8 = new FadeTransition(Duration.millis(2500), line8);
						ft8.setFromValue(5.0);
						ft8.setToValue(0);
						ft8.play();

                        // Disapperance of button1
						Timeline animationDisButton1 = new Timeline(
								new KeyFrame(Duration.millis(40), eventHandlerDisButton1));
						animationDisButton1.setCycleCount(80);
						animationDisButton1.play();

						// button5 is disappearing
						FadeTransition ftb5 = new FadeTransition(Duration.millis(2500), b5);
						ftb5.setFromValue(5.0);
						ftb5.setToValue(0);
						ftb5.play();

						// line2 is disappearing
						FadeTransition ft2 = new FadeTransition(Duration.millis(2500), line2);
						ft2.setFromValue(5.0);
						ft2.setToValue(0);
						ft2.play();

						// circle5 is disappearing
						FadeTransition ftc5 = new FadeTransition(Duration.millis(2500), circle5);
						ftc5.setFromValue(5.0);
						ftc5.setToValue(0);
						ftc5.play();
					}
				}
			}
		});

		b2.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				buttonClicked = 2;
				count();

				// Animation button for enlarge and shrink of line2
				Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler2));
				animationButton.setCycleCount(2);
				animationButton.play();

				// Animation for enlarge of line24
				Timeline animationEnlargeLine24 = new Timeline(
						new KeyFrame(Duration.millis(100), eventHandlerEnlargeLine24));
				animationEnlargeLine24.setCycleCount(5);
				animationEnlargeLine24.play();

				//Disappearing line25
				Timeline animationDecrLine25 = new Timeline(new KeyFrame(Duration.millis(15), eventHandlerDecrLine25));
				animationDecrLine25.setCycleCount(100);
				animationDecrLine25.play();

				// line22 is disappearing
				FadeTransition ft22 = new FadeTransition(Duration.millis(3000), line22);
				ft22.setFromValue(5.0);
				ft22.setToValue(0);
				ft22.play();

				// line23 is disappearing
				FadeTransition ft23 = new FadeTransition(Duration.millis(3000), line23);
				ft23.setFromValue(5.0);
				ft23.setToValue(0);
				ft23.play();

				// Animation for shrink line24
				Timeline animationShrinkLine24 = new Timeline(
						new KeyFrame(Duration.millis(50), eventHandlerShrinkLine24));
				animationShrinkLine24.setCycleCount(100);
				animationShrinkLine24.play();

                // Disapperance of button2
				Timeline animationDisButton2 = new Timeline(new KeyFrame(Duration.millis(40), eventHandlerDisButton2));
				animationDisButton2.setCycleCount(80);
				animationDisButton2.play();
			}
		});

		b3.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				buttonClicked = 3;
				secondsPassed = 0;
				count();

				if (connectorControl1 % 2 == 0) {

				// Animation button for enlarge and shrink of line3
				Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler3));
				animationButton.setCycleCount(2);
				animationButton.play();

				// Animation for enlarge of line14
				Timeline animationEnlargeLine14 = new Timeline(
						new KeyFrame(Duration.millis(100), eventHandlerEnlargeLine14));
				animationEnlargeLine14.setCycleCount(5);
				animationEnlargeLine14.play();

				if (line11.getEndX() >= 540) {// b1 is not clicked, if collision appears

					PathTransition pt12 = new PathTransition(Duration.millis(500), new Line(530, 110, 530, 125),
							line12);
					pt12.play();

					PathTransition pta3 = new PathTransition(Duration.millis(500), new Line(540, 140, 540, 155), arc3);
					pta3.play();

					// animation for line12 when collision appears
					Timeline animationDecrLine12 = new Timeline(
							new KeyFrame(Duration.millis(30), eventHandlerDecrLine13));
					animationDecrLine12.setCycleCount(15);
					animationDecrLine12.play();

					 //Animation for decrement pane opacity
					Timeline animationPaneOpacity = new Timeline(
							new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
					animationPaneOpacity.setCycleCount(15);
					animationPaneOpacity.play();

				} else { // when collision does not appear

					// Animation for line12
					Timeline animationLine12 = new Timeline(new KeyFrame(Duration.millis(8), eventHandlerLine12));
					animationLine12.setCycleCount(400);
					animationLine12.play();

					// Animation for arc3
					Timeline animationArc3 = new Timeline(new KeyFrame(Duration.millis(8), eventHandlerArc3));
					animationArc3.setCycleCount(460);
					animationArc3.play();

					// Animation for line13
					Timeline animationLine13 = new Timeline(new KeyFrame(Duration.millis(8), eventHandlerDecrLine13));
					animationLine13.setCycleCount(400);
					animationLine13.play();

					// Animation for shrink line14
					Timeline animationShrinkLine14 = new Timeline(
							new KeyFrame(Duration.millis(45), eventHandlerShrinkLine14));
					animationShrinkLine14.setCycleCount(100);
					animationShrinkLine14.play();

					// line15 is disappearing
					FadeTransition ft15 = new FadeTransition(Duration.millis(3000), line15);
					ft15.setFromValue(5.0);
					ft15.setToValue(0);
					ft15.play();

					// line16 is disappearing
					FadeTransition ft16 = new FadeTransition(Duration.millis(3000), line16);
					ft16.setFromValue(5.0);
					ft16.setToValue(0);
					ft16.play();

					// line4 is disappearing
					FadeTransition ft4 = new FadeTransition(Duration.millis(3000), line4);
					ft4.setFromValue(5.0);
					ft4.setToValue(0);
					ft4.play();

                    //Animation for disappearing button3
					Timeline animationDisButton3 = new Timeline(
							new KeyFrame(Duration.millis(20), eventHandlerDisButton3));
					animationDisButton3.setCycleCount(180);
					animationDisButton3.play();

					//Button4 is disappearing
					FadeTransition ftb4 = new FadeTransition(Duration.millis(2500), b4);
					ftb4.setFromValue(5.0);
					ftb4.setToValue(0);
					ftb4.play();

					// line1 is disappearing
					FadeTransition ft1 = new FadeTransition(Duration.millis(2500), line1);
					ft1.setFromValue(5.0);
					ft1.setToValue(0);
					ft1.play();

					//Circle5 is disappearing
					FadeTransition ftc4 = new FadeTransition(Duration.millis(2500), circle4);
					ftc4.setFromValue(5.0);
					ftc4.setToValue(0);
					ftc4.play();
				}
				}}
		});

		b4.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				buttonClicked = 4;
				count();

				// Rotating line1 due to clicked connector
				RotateTransition rt = new RotateTransition(Duration.millis(100), line1);
				rt.setByAngle(90);
				rt.setCycleCount(1);
				rt.setAutoReverse(false);

				rt.play();
				connectorControl1++;
			}

		});

		b5.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				buttonClicked = 5;
				count();
				// Rotating line2 due to clicked connector
				RotateTransition rt = new RotateTransition(Duration.millis(100), line2);
				rt.setByAngle(90);
				rt.setCycleCount(1);
				rt.setAutoReverse(false);

				rt.play();

				connectorControl2++;
			}
		});

		b6.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				buttonClicked = 6;
				secondsPassed = 0;
				count();
				if (connectorControl2 % 2 == 1) {

					if (line25.getStartX() <= 370) { // button2 is not clicked, when collision appears

						PathTransition pt21 = new PathTransition(Duration.millis(500), new Line(380, 140, 380, 155),
								line21);
						pt21.play();

						PathTransition pta2 = new PathTransition(Duration.millis(500), new Line(370, 170, 370, 185),
								arc2);
						pta2.play();

						//Animation for line3 when collision appears
						Timeline animationDecrLine20 = new Timeline(
								new KeyFrame(Duration.millis(30), eventHandlerDecrLine20));
						animationDecrLine20.setCycleCount(15);
						animationDecrLine20.play();

                        //Animation for decrement pane opacity
						Timeline animationPaneOpacity = new Timeline(
								new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
						animationPaneOpacity.setCycleCount(15);
						animationPaneOpacity.play();
					}

					else { // button2 clicked, when collision does not appear

						// Animation button for enlarge and shrink of line6
						Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler6));
						animationButton.setCycleCount(2);
						animationButton.play();

						// Animation for enlarge of line19
						Timeline animationEnlargeLine19 = new Timeline(
								new KeyFrame(Duration.millis(90), eventHandlerEnlargeLine19));
						animationEnlargeLine19.setCycleCount(5);
						animationEnlargeLine19.play();

						// Animation for line21
						Timeline animationLine21 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerLine21));
						animationLine21.setCycleCount(400);
						animationLine21.play();

						// Animation for arc2
						Timeline animationArc2 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerArc2));
						animationArc2.setCycleCount(191);
						animationArc2.play();

						// animation for line3 when collision appears
						Timeline animationDecrLine20 = new Timeline(
								new KeyFrame(Duration.millis(6), eventHandlerDecrLine20));
						animationDecrLine20.setCycleCount(150);
						animationDecrLine20.play();

						// Animation for shrink line19
						Timeline animationShrinkLine19 = new Timeline(
								new KeyFrame(Duration.millis(50), eventHandlerShrinkLine19));
						animationShrinkLine19.setCycleCount(100);
						animationShrinkLine19.play();

						// line6 is disappearing
						FadeTransition ft6 = new FadeTransition(Duration.millis(2500), line6);
						ft6.setFromValue(5.0);
						ft6.setToValue(0);
						ft6.play();

						// line17 is disappearing
						FadeTransition ft17 = new FadeTransition(Duration.millis(2500), line17);
						ft17.setFromValue(5.0);
						ft17.setToValue(0);
						ft17.play();

						// line18 is disappearing
						FadeTransition ft18 = new FadeTransition(Duration.millis(2500), line18);
						ft18.setFromValue(5.0);
						ft18.setToValue(0);
						ft18.play();

	                    //Animation for disappearing button6
						Timeline animationDisButton6 = new Timeline(
								new KeyFrame(Duration.millis(40), eventHandlerDisButton6));
						animationDisButton6.setCycleCount(80);
						animationDisButton6.play();

					}

				}
			}
		});

		// Added nodes to the pane
		pane.getChildren().addAll(circle1, circle2, circle3, circle5, circle6, circle4, b1, b2, b3, b4, b5, b6, arc1,
				arc2, arc3, line1, line2, line3, line4, line5, line6, line7, line8, line9, line10, line11, line12,
				line13, line14, line15, line16, line17, line18, line19, line20, line21, line22, line23, line24, line25, stack);

        pane.setStyle("-fx-background-color: azure;");//Set pane color

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 600, 600, Color.AZURE);
		stage.setTitle("GAME"); // Set the stage title
		stage.setScene(scene); // Place the scene in the stage
		stage.setResizable(false);// Set stage resizable
		stage.show(); // Display the stage
	}

	@Override
	public void onSuccess() {
		new Congratulations(stage).drawLevel();

	}

	@Override
	public void onFail() {
		new Level5(stage).drawLevel();
	}
	
	@Override
	public void moveFail() {
		new Level1(stage).drawLevel();
	}

	// button action method
	public void circleActions(Circle circle) {
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

	// enlarge line9 and line24
	public boolean EnlargeLine9_24(Line line) {
		line.setEndY(line.getEndY() + 2);
		line.setStartY(line.getStartY() - 2);
		return true;
	}

	// shrink line9 and line24
	public boolean ShrinkLine9(Line line, Line line1) {

		if (line1.getEndX() <= 300) {
			line.setEndY(line.getEndY() - 1);
			line.setStartY(line.getStartY() + 1);
		}

		if (line.getStartY() == line.getEndY()) {
			pane.getChildren().removeAll(line1, line);
			return false;
		}
		return true;
	}

	// shrink line9 and line24
	public boolean ShrinkLine24(Line line, Line line25) {

		/// ICINI DUZENLE
		if (line25.getStartX() >= 460) {
			line.setEndY(line.getEndY() - 1);
			line.setStartY(line.getStartY() + 1);
		}

		if (line.getStartY() == line.getEndY()) {
			pane.getChildren().removeAll(line25, line);
			return false;
		}
		return true;
	}

	public void EnlargeLine14_19(Line line) { // button is clicked
		line.setEndX(line.getEndX() + 2);
		line.setStartX(line.getStartX() - 2);
	}

	public boolean ShrinkLine19(Line line, Line line11) { // line is
		// disappearing

		if (line11.getEndY() == line11.getStartY()) {
			line.setStartX(line.getStartX() + 1);
			line.setEndX(line.getEndX() - 1);

		}

		if (line.getEndX() == line.getStartX()) {
			pane.getChildren().remove(line);
			return false;
		}
		return false;
	}

	public void decrLine10(Line line) {
		line.setEndX(line.getEndX() - 1);
		if (line.getStartX() == line.getEndX())
			pane.getChildren().remove(line);
	}

	// Created a method for disappearance of line11
	public boolean DisLine11(Line line) {

		if (line.getStartX() != 270 && line.getEndX() != 270) {
			line.setStartX(line.getStartX() - 1);
			line.setEndX(line.getEndX() - 1);
		} else if (line.getStartX() == 270 && line.getEndX() != 270)
			line.setEndX(line.getEndX() - 1);

		else if (line.getStartX() == 270 && line.getEndX() == 270) {
			pane.getChildren().remove(line);


			return false;
		}

		return true;
	}

	// Created a method for disappearance of arc
	public boolean DisArc1(Arc arc) {

		if (arc.getCenterX() >= 295) {
			arc.setCenterX(arc.getCenterX() - 1);
			return false;
		} else if (arc.getCenterX() < 295 && arc.getCenterX() > 245) {
			arc.setLength(arc.getLength() - 4);
			arc.setCenterX(arc.getCenterX() - 1);
			return false;
		} else if (arc.getCenterX() == 245 && arcControl <= 7) {
			arc.setLength(arc.getLength() - 4);
			arcControl++;
			return false;
		}
		pane.getChildren().remove(arc);
		return true;
	}

	public boolean disappearanceButton1(Button button, Circle circle, Line line) {
		pane.getChildren().remove(button);

		if (line.getStartX() == line.getEndX()) {
			circle.setRadius(circle.getRadius() - 1);
		}

		return true;
	}

	public boolean disappearanceButton2(Button button, Circle circle, Line line) {
		pane.getChildren().remove(button);

		if (line.getStartX() >= 460) {
			circle.setRadius(circle.getRadius() - 1);
		}

		return true;
	}

	public void decrLine25(Line line) {
		line.setStartX(line.getStartX() + 1);

		if (line.getStartX() == line.getEndX())
			pane.getChildren().remove(line);
	}

	public void decrLine13(Line line) {
		line.setStartY(line.getStartY() + 1);
		if (line.getEndY() == line.getStartY())
			pane.getChildren().remove(line);
	}

	// Created a method for disappearance of line11
	public void disLine12(Line line) {

		if (line.getStartY() != 440 && line.getEndY() != 440) {
			line.setStartY(line.getStartY() + 1);
			line.setEndY(line.getEndY() + 1);
		} else if (line.getStartY() != 440 && line.getEndY() == 440)
			line.setStartY(line.getStartY() + 1);

		else if (line.getStartY() == 440 && line.getEndY() == 440) {
			pane.getChildren().remove(line);
		}
	}

	// Created a method for disappearance of arc3
	public boolean DisArc3(Arc arc) {

		if (arc.getCenterY() <= 414) {
			arc.setCenterY(arc.getCenterY() + 1);
			return false;
		} else if (arc.getCenterY() > 414 && arc.getCenterY() < 440) {
			arc.setLength(arc.getLength() + 5);
			arc.setCenterY(arc.getCenterY() + 1);
			return false;
		} else if (arc.getCenterY() == 440 && arcControl <= 6) {
			arc.setLength(arc.getLength() + 5);
			arcControl++;
			return false;

		}
		pane.getChildren().remove(arc);
		return false;
	}

	public boolean ShrinkLine14(Line line, Line line12) { // line is
		// disappearing

		if (line12.getEndY() == line12.getStartY()) {
			line.setStartX(line.getStartX() + 1);
			line.setEndX(line.getEndX() - 1);

		}

		if (line.getEndX() == line.getStartX()) {
			pane.getChildren().remove(line);
			return false;
		}
		return false;
	}
	////// Burdan itibaren at

	// disappearance Button3
	public boolean disappearanceButton3(Button button, Circle circle, Line line12) {
		pane.getChildren().remove(button);

		if (line12.getStartY() >= 460) {
			circle.setRadius(circle.getRadius() - 1);
		}

		if(circle.getRadius() == 0){
			onSuccess();
		}
		return true;
	}

	public void decrLine20(Line line) {
		line.setStartY(line.getStartY() + 1);
		if (line.getEndY() == line.getStartY())
			pane.getChildren().remove(line);
	}

	// Created a method for disappearance of line21
	public boolean continueloopLine21(Line line) {
		if (line.getStartY() != 340 && line.getEndY() != 340) {
			line.setStartY(line.getStartY() + 1);
			line.setEndY(line.getEndY() + 1);
			return false;
		} else if (line.getEndY() == 340 && line.getStartY() != 340) {
			line.setStartY(line.getStartY() + 1);
			return false;
		} else if (line.getStartY() == 340 && line.getEndY() == 390) {

			return false;
		}
		pane.getChildren().remove(line);
		return true;
	}

	// Created a method for disappearance of arc
	public boolean continueloopArc2(Arc arc) {

		if (arc.getCenterY() <= 315) {
			arc.setCenterY(arc.getCenterY() + 1);
			return true;
		} else if (arc.getCenterY() > 315 && arc.getCenterY() < 358) {
			arc.setLength(arc.getLength() - 4);
			arc.setCenterY(arc.getCenterY() + 1);
			return true;
		} else if (arc.getCenterY() == 358 && arcControl <= 7) {
			arc.setLength(arc.getLength() - 4);
			arcControl++;
			return true;
		}
		return true;
	}

	public boolean disappearanceButton6(Button button, Circle circle, Line line) {
		pane.getChildren().remove(button);

		if (line.getStartY() >= 340) {
			circle.setRadius(circle.getRadius() - 1);
		}

		return true;
	}

	public void decrOpacity() {
		pane.setOpacity(pane.getOpacity() - 0.1);
		if (secondsPassed == 2) {
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