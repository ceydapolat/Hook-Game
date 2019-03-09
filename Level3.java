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

public class Level3 implements LevelDrawer {

	private int secondsPassed = 0;//Game duration

	Text t = new Text("3");
 	int count = Integer.parseInt(t.getText());
 	
	Timer timer = new Timer();
	TimerTask task = new TimerTask(){
		public void run(){
			secondsPassed++;
		}
	};

    private int buttonClicked, arcControl = 0;
    private Stage stage;

    Button b1 = new Button();
    Button b2 = new Button();
    Button b3 = new Button();
    Line line1 = new Line(495, 120, 575, 120);
    Line line2 = new Line(330, 120, 455, 120);
    Line line3 = new Line(330, 110, 330, 130);
    Line line4 = new Line(330, 120, 320, 120);
    Line line5 = new Line(320, 120, 320, 535);
    Line line6 = new Line(220, 475, 370, 475);
    Line line7 = new Line(370, 475, 370, 240);
    Line line8 = new Line(370, 240, 380, 240);
    Line line9 = new Line(380, 230, 380, 250);
    Line line10 = new Line(380, 240, 485, 240);
    Line line11 = new Line(475, 110, 475, 220);
    Line line12 = new Line(475, 260, 475, 370);
    Line line13 = new Line(465, 370, 485, 370);
    Line line14 = new Line(475, 370, 475, 380);
    Line line15 = new Line(150, 380, 475, 380);
    Arc arc1 = new Arc(475, 120, 20, 20, 0, 180);
    Arc arc2 = new Arc(475, 240, 20, 20, 90, -180);

    // Create a pane to hold the nodes
    Pane pane = new Pane();

    public Level3(Stage stage) {//Level3 contstructor
        this.stage = stage;
    }

    @Override
    public void drawLevel() {

    	 StackPane stack = new StackPane();
		 t.setFont(Font.font(75));
		 stack.getChildren().add(t);

    	timer.scheduleAtFixedRate(task, 1000, 1000);

        Circle circle1 = new Circle();
        circle1.setCenterX(130);
        circle1.setCenterY(380);
        circle1.setRadius(20);
        circle1.setStroke(Color.DARKCYAN);
        circle1.setFill(Color.DARKCYAN);

        Circle circle2 = new Circle();
        circle2.setCenterX(200);
        circle2.setCenterY(475);
        circle2.setRadius(20);
        circle2.setStroke(Color.DARKCYAN);
        circle2.setFill(Color.DARKCYAN);

        Circle circle3 = new Circle();
        circle3.setCenterX(320);
        circle3.setCenterY(555);
        circle3.setRadius(20);
        circle3.setStroke(Color.DARKCYAN);
        circle3.setFill(Color.DARKCYAN);

        // Created a button 1
        b1.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
                + "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
        b1.setLayoutX(110);
        b1.setLayoutY(360);

        // Created a button 2
        b2.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
                + "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
        b2.setLayoutX(180);
        b2.setLayoutY(455);

        // Created a button 3
        b3.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
                + "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
        b3.setLayoutX(300);
        b3.setLayoutY(535);

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

        line1.setStrokeWidth(3);
        line2.setStrokeWidth(3);
        line3.setStrokeWidth(3);
        line9.setStrokeWidth(3);
        line10.setStrokeWidth(3);
        line11.setStrokeWidth(3);
        line12.setStrokeWidth(3);
        line13.setStrokeWidth(3);

        EventHandler<ActionEvent> eventHandler1 = e -> {
            circleActions(circle1);
        };

        EventHandler<ActionEvent> eventHandler2 = e -> {
            circleActions(circle2);
        };

        EventHandler<ActionEvent> eventHandler3 = e -> {
            circleActions(circle3);
        };

        EventHandler<ActionEvent> eventHandlerDecrLine12 = e -> {
            decrLine12(line12);
        };

        EventHandler<ActionEvent> eventHandlerLine11 = e -> {
            disLine11(line11);
        };

        EventHandler<ActionEvent> eventHandlerArc2 = e -> {
            DisArc2(arc2);
        };

        EventHandler<ActionEvent> eventHandlerEnlargeLine13 = e -> {
            EnlargeLine13(line13);
        };

        EventHandler<ActionEvent> eventHandlerShrinkLine13 = e -> {
            ShrinkLine13(line13, line11);
        };

        EventHandler<ActionEvent> eventHandlerDisButton1 = e -> {
        	disButton1(b1, circle1, line11);
        };

        EventHandler<ActionEvent> eventHandlerDecrLine10 = e -> {
            decrLine10_2(line10);
        };

        EventHandler<ActionEvent> eventHandlerEnlargeLine9 = e -> {
            EnlargeLine9_3(line9);
        };

        EventHandler<ActionEvent> eventHandlerShrinkLine9 = e -> {
            ShrinkLine9_3(line9, line10);
        };

        EventHandler<ActionEvent> eventHandlerDisButton2 = e -> {
        	disButton2(b2, circle2, line9);
        };

        EventHandler<ActionEvent> eventHandlerDecrLine2 = e -> {
            decrLine10_2(line2);
        };

        EventHandler<ActionEvent> eventHandlerLine2 = e -> {
            continueloopLine2(line2);
        };

        EventHandler<ActionEvent> eventHandlerArc1 = e -> {
            DisArc1(arc1);
        };

        EventHandler<ActionEvent> eventHandlerLine1 = e -> {
            continueloopLine1(line1);
        };

        EventHandler<ActionEvent> eventHandlerEnlargeLine3 = e -> {
            EnlargeLine3(line3);
        };

        EventHandler<ActionEvent> eventHandlerShrinkLine3 = e -> {
            ShrinkLine3(line3, line1);
        };

        EventHandler<ActionEvent> eventHandlerDisButton3 = e -> {
        	disButton3(b3, circle3, line1);
        };

        EventHandler<ActionEvent> eventHandlerdecrOpacity = e -> {
        	decrOpacity();
        };

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {
            	buttonClicked = 1;
            	count();
                // Animation for enlarge and shrink of line1
                Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler1));
                animationButton.setCycleCount(2);
                animationButton.play();

                // Animation for enlarge of line13
                Timeline animationEnlargeLine13 = new Timeline(
                        new KeyFrame(Duration.millis(80), eventHandlerEnlargeLine13));
                animationEnlargeLine13.setCycleCount(5);
                animationEnlargeLine13.play();

                if (line10.getEndX() == 485) { // button2 is not clicked, if collisio appears
                	secondsPassed = 0;

                    PathTransition pt = new PathTransition(Duration.millis(500), new Line(475, 165, 475, 180), line11);
                    pt.play();

                    PathTransition pta1 = new PathTransition(Duration.millis(500), new Line(485, 240, 485, 255), arc2);
                    pta1.play();

                    //Animation for line12 when collision appears
                    Timeline animationDecrLine12 = new Timeline(
                            new KeyFrame(Duration.millis(30), eventHandlerDecrLine12));
                    animationDecrLine12.setCycleCount(15);
                    animationDecrLine12.play();

                    //Animation for decrement pane opacity
                    Timeline animationPaneOpacity = new Timeline(
                            new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
                    animationPaneOpacity.setCycleCount(15);
                    animationPaneOpacity.play();

                } else if (line10.getEndX() < 485){ // button2 is clicked, when collision does not appear

                    // Animation for line11
                    Timeline animationLine11 = new Timeline(new KeyFrame(Duration.millis(8), eventHandlerLine11));
                    animationLine11.setCycleCount(400);
                    animationLine11.play();

                    // Animation for arc2
                    Timeline animationArc2 = new Timeline(new KeyFrame(Duration.millis(8), eventHandlerArc2));
                    animationArc2.setCycleCount(152);
                    animationArc2.play();

                    //Animation for line12 when collision appears
                    Timeline animationDecrLine12 = new Timeline(
                            new KeyFrame(Duration.millis(8), eventHandlerDecrLine12));
                    animationDecrLine12.setCycleCount(110);
                    animationDecrLine12.play();

                    // Animation for shrink line13
                    Timeline animationShrinkLine13 = new Timeline(
                            new KeyFrame(Duration.millis(45), eventHandlerShrinkLine13));
                    animationShrinkLine13.setCycleCount(100);
                    animationShrinkLine13.play();

                    //line14 is disappearing
                    FadeTransition ft14 = new FadeTransition(Duration.millis(1850), line14);
                    ft14.setFromValue(5.0);
                    ft14.setToValue(0);
                    ft14.play();

                    //line15 is disappearing
                    FadeTransition ft15 = new FadeTransition(Duration.millis(1850), line15);
                    ft15.setFromValue(5.0);
                    ft15.setToValue(0);
                    ft15.play();

                    //Animation for decrement pane opacity
                    Timeline animationDisButton1 = new Timeline(
                            new KeyFrame(Duration.millis(40), eventHandlerDisButton1));
                    animationDisButton1.setCycleCount(80);
                    animationDisButton1.play();

                }

            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {
            	buttonClicked = 2;
            	count();
                // Animation for enlarge and shrink of line2
                Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler2));
                animationButton.setCycleCount(2);
                animationButton.play();

                //Animation for line10 when collision appears
                Timeline animationDecrLine10 = new Timeline(new KeyFrame(Duration.millis(8), eventHandlerDecrLine10));
                animationDecrLine10.setCycleCount(110);
                animationDecrLine10.play();

                // Animation for enlarge of line9
                Timeline animationEnlargeLine9 = new Timeline(
                        new KeyFrame(Duration.millis(80), eventHandlerEnlargeLine9));
                animationEnlargeLine9.setCycleCount(6);
                animationEnlargeLine9.play();

                // Animation for shrink line9
                Timeline animationShrinkLine9 = new Timeline(
                        new KeyFrame(Duration.millis(130), eventHandlerShrinkLine9));
                animationShrinkLine9.setCycleCount(100);
                animationShrinkLine9.play();

                //line6 is disappearing
                FadeTransition ft6 = new FadeTransition(Duration.millis(1850), line6);
                ft6.setFromValue(5.0);
                ft6.setToValue(0);
                ft6.play();

                // line7 is disappearing
                FadeTransition ft7 = new FadeTransition(Duration.millis(1850), line7);
                ft7.setFromValue(5.0);
                ft7.setToValue(0);
                ft7.play();

                // line15 is disappearing
                FadeTransition ft8 = new FadeTransition(Duration.millis(1850), line8);
                ft8.setFromValue(5.0);
                ft8.setToValue(0);
                ft8.play();

                //Animation for decrement pane opacity
                Timeline animationDisButton2 = new Timeline(new KeyFrame(Duration.millis(120), eventHandlerDisButton2));
                animationDisButton2.setCycleCount(50);
                animationDisButton2.play();
            }
        });

        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {
            	buttonClicked = 3;
            	count();
                // Animation for enlarge and shrink
                Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler3));
                animationButton.setCycleCount(2);
                animationButton.play();

                if (line11.getStartY() == 110) { // b1 is not clicked, if collision appears
                	secondsPassed = 0;

                    // Animation for enlarge of line3
                    Timeline animationEnlargeLine3 = new Timeline(
                            new KeyFrame(Duration.millis(100), eventHandlerEnlargeLine3));
                    animationEnlargeLine3.setCycleCount(5);
                    animationEnlargeLine3.play();

                    PathTransition pt = new PathTransition(Duration.millis(500), new Line(535, 120, 520, 120), line1);
                    pt.play();

                    PathTransition pt1 = new PathTransition(Duration.millis(500), new Line(475, 110, 460, 110), arc1);
                    pt1.play();

                    //Animation for line2 when collision appears
                    Timeline animationDecrLine2 = new Timeline(
                            new KeyFrame(Duration.millis(30), eventHandlerDecrLine2));
                    animationDecrLine2.setCycleCount(15);
                    animationDecrLine2.play();

                    //Animation for decrement pane opacity
                    Timeline animationPaneOpacity = new Timeline(
                            new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
                    animationPaneOpacity.setCycleCount(15);
                    animationPaneOpacity.play();

                } else {// b1 is clicked, when collision does not appear

                    // Animation for line2
                    Timeline animationLine2 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerLine2));
                    animationLine2.setCycleCount(165);
                    animationLine2.play();

                    // Animation for arc2
                    Timeline animationArc1 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerArc1));
                    animationArc1.setCycleCount(185);
                    animationArc1.play();

                    // Animation for line1
                    Timeline animationLine1 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerLine1));
                    animationLine1.setCycleCount(400);
                    animationLine1.play();

                    // Animation for enlarge of line3
                    Timeline animationEnlargeLine3 = new Timeline(
                            new KeyFrame(Duration.millis(100), eventHandlerEnlargeLine3));
                    animationEnlargeLine3.setCycleCount(5);
                    animationEnlargeLine3.play();

                    // Animation for shrink line3
                    Timeline animationShrinkLine3 = new Timeline(
                            new KeyFrame(Duration.millis(40), eventHandlerShrinkLine3));
                    animationShrinkLine3.setCycleCount(80);
                    animationShrinkLine3.play();

                    // Animation for disappearance of button3
                    Timeline animationDisButton3 = new Timeline(
                            new KeyFrame(Duration.millis(70), eventHandlerDisButton3));
                    animationDisButton3.setCycleCount(150);
                    animationDisButton3.play();

                    // line5 is disappearing
                    FadeTransition ft5 = new FadeTransition(Duration.millis(3000), line5);
                    ft5.setFromValue(5.0);
                    ft5.setToValue(0);
                    ft5.play();

                    // line4 is disappearing
                    FadeTransition ft4 = new FadeTransition(Duration.millis(3000), line4);
                    ft4.setFromValue(5.0);
                    ft4.setToValue(0);
                    ft4.play();

                }
            }
        });

        // Added nodes to the pane
        pane.getChildren().addAll(circle1, circle2, circle3, b1, b2, b3, arc1, arc2, line1, line2, line3, line4, line5,
                line6, line7, line8, line9, line10, line11, line12, line13, line14, line15, stack);

        pane.setStyle("-fx-background-color: azure;");//Set pane color

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 650, 650, Color.AZURE);
        stage.setTitle("GAME"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.setResizable(false);// Set stage resizable
        stage.show(); // Display the stage
    }

    @Override
    public void onSuccess() {//When collision does not appear show next level
        new Level4(stage).drawLevel();
    }

    @Override
    public void onFail() {//When collision appears show same level
        new Level3(stage).drawLevel();
    }
    
    @Override
	public void moveFail() {
		new Level1(stage).drawLevel();
	}
    // Button action method
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

    //Created a method for disappearance of line12
    public void decrLine12(Line line) {
        line.setStartY(line.getStartY() + 1);
        if (line.getEndY() == line.getStartY())
            pane.getChildren().remove(line);
    }

    // Created a method for disappearance of line11
    public void disLine11(Line line) {

        if (line.getStartY() != 370 && line.getEndY() != 370) {
            line.setStartY(line.getStartY() + 1);
            line.setEndY(line.getEndY() + 1);
        } else if (line.getStartY() != 370 && line.getEndY() == 370)
            line.setStartY(line.getStartY() + 1);

        else if (line.getStartY() == 370 && line.getEndY() == 370) {
            pane.getChildren().remove(line);
        }
    }

    // Created a method for disappearance of arc2
    public void DisArc2(Arc arc) {

        if (arc.getCenterY() <= 346) {
            arc.setCenterY(arc.getCenterY() + 1);
        } else if (arc.getCenterY() > 346 && arc.getCenterY() < 390) {
            arc.setLength(arc.getLength() + 4);
            arc.setCenterY(arc.getCenterY() + 1);
        } else if (arc.getCenterY() == 390 && arcControl <= 7) {
            arc.setLength(arc.getLength() + 4);
            arcControl++;

        }
    }

    //Created a method for enlarge line13 when button is clicked
    public void EnlargeLine13(Line line) {
        line.setEndX(line.getEndX() + 2);
        line.setStartX(line.getStartX() - 2);
    }

    //Created a method for disappearing line13 when collision does not appear
    public boolean ShrinkLine13(Line line, Line line11) {

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

    // Disappearance of Button1
    public boolean disButton1(Button button, Circle circle, Line line11) {
        pane.getChildren().remove(button);

        if (line11.getStartY() >= 260) {
            circle.setRadius(circle.getRadius() - 1);
        }

        return true;
    }

    //Created a method for disappearance of line2 and line10
    public void decrLine10_2(Line line) {
        line.setEndX(line.getEndX() - 1);
        if (line.getStartX() == line.getEndX())
            pane.getChildren().remove(line);
    }

    //Created a method for enlarge line3 and line9 when button is clicked
    public void EnlargeLine9_3(Line line) { // button is clicked
        line.setEndY(line.getEndY() + 2);
        line.setStartY(line.getStartY() - 2);
    }

    //Created a method for disappearing line3 and line9 when collision does not appear
    public boolean ShrinkLine9_3(Line line, Line line1) {
        if (line1.getEndY() == line1.getStartY()) {
            line.setStartY(line.getStartY() + 1);
            line.setEndY(line.getEndY() - 1);

        }

        if (line.getEndY() == line.getStartY()) {
            pane.getChildren().remove(line);
            return false;
        }
        return false;
    }

    // Disappearance Button2
    public boolean disButton2(Button button, Circle circle, Line line9) {
        pane.getChildren().remove(button);

        if (line9.getEndY() < 250) {
            circle.setRadius(circle.getRadius() - 2);
        }

        return true;
    }

    // Created a method for disappearance of line 2
    public boolean continueloopLine2(Line line) {

        if (line.getEndX() == 330) {
            pane.getChildren().remove(line);
            return false;
        } else if (line.getEndX() != 330) {
            line.setEndX(line.getEndX() - 1);
        }
        return true;
    }

    // Created a method for disappearance of arc1
    public boolean DisArc1(Arc arc) {

        if (arc.getCenterX() >= 351) {
            arc.setCenterX(arc.getCenterX() - 1);
        } else if (arc.getCenterX() < 375 && arc.getCenterX() > 305) {// 285
            arc.setLength(arc.getLength() - 4);
            arc.setCenterX(arc.getCenterX() - 1);
        } else if (arc.getCenterX() == 350 && arcControl <= 9) {
            arc.setLength(arc.getLength() - 3);
            arcControl++;
        }
        return true;
    }

    // Created a method for disappearance of line1
    public boolean continueloopLine1(Line line) {

        if (line.getStartX() != 330 && line.getEndX() != 330) {
            line.setStartX(line.getStartX() - 1);
            line.setEndX(line.getEndX() - 1);
        } else if (line.getStartX() == 330 && line.getEndX() != 330)
            line.setEndX(line.getEndX() - 1);

        else if (line.getStartX() == 330 && line.getEndX() == 330) {
            pane.getChildren().remove(line);
            return false;
        }

        return true;
    }

    // Enlarge line3
    public boolean EnlargeLine3(Line line) {
        line.setEndY(line.getEndY() + 2);
        line.setStartY(line.getStartY() - 2);
        return true;
    }

    // Shrink line3
    public boolean ShrinkLine3(Line line, Line line1) {
        if (line1.getEndX() == 330) {
            line.setEndY(line.getEndY() - 1);
            line.setStartY(line.getStartY() + 1);
        }

        if (line.getStartY() == line.getEndY()) {
            pane.getChildren().removeAll(line1, line);
            return false;
        }
        return true;
    }

    // Disappearance Button3
    public boolean disButton3(Button button, Circle circle, Line line1) {
        pane.getChildren().remove(button);

        if (line1.getStartX() == line1.getEndX()) {
            circle.setRadius(circle.getRadius() - 1);
            if (circle.getRadius() == 0) {
                onSuccess();
            }
        }

        return true;
    }

    //Decrement pane opacity
    public void decrOpacity(){
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