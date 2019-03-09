//150116504 Zehra Zeynep PEHLIVAN  
//150117065 Hümeyra Ceyda POLAT

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
import java.util.Timer;
import java.util.TimerTask;

public class Level1 implements LevelDrawer {

	int secondsPassed = 0;//Game duration

	Text t = new Text("2");
 	int count = Integer.parseInt(t.getText());

	Timer timer = new Timer();
	TimerTask task = new TimerTask(){
		public void run(){
			secondsPassed++;
		}
	};

    private int buttonClicked,arcControl = 0;

    Button b1 = new Button();
    Button b2 = new Button();
    Line line1 = new Line(420, 100, 500, 100);
    Line line2 = new Line(110, 100, 350, 100);
    Line line3 = new Line(110, 90, 110, 110);
    Line line4 = new Line(100, 100, 110, 100);
    Line line5 = new Line(100, 100, 100, 400);
    Line line6 = new Line(100, 400, 480, 400);
    Line line7 = new Line(400, 480, 400, 380);
    Line line8 = new Line(390, 380, 410, 380);
    Line line9 = new Line(400, 95, 400, 380);
    Line line2_1 = new Line(350, 100, 380, 100);
    Arc arc = new Arc(400, 100, 20, 20, 360, 180);
    Pane pane = new Pane();

    Scene scene = new Scene(pane, 600, 600, Color.AZURE);
    private Stage stage;

    public Level1(Stage stage) {//Level1 contstructor
    	this.stage = stage;
    }

    @Override
    public void drawLevel() {
    	 StackPane stack = new StackPane();
		 t.setFont(Font.font(75));
		 stack.getChildren().add(t);

    	timer.scheduleAtFixedRate(task, 1000, 1000);

        Circle circle1 = new Circle();
        circle1.setCenterX(400);
        circle1.setCenterY(500);
        circle1.setRadius(20);
        circle1.setStroke(Color.DARKCYAN);
        circle1.setFill(Color.DARKCYAN);

        Circle circle2 = new Circle();
        circle2.setCenterX(500);
        circle2.setCenterY(400);
        circle2.setRadius(20);
        circle2.setStroke(Color.DARKCYAN);
        circle2.setFill(Color.DARKCYAN);

        EventHandler<ActionEvent> eventHandlerLine9 = e -> {
            continueloopLine9(line9);
        };

        EventHandler<ActionEvent> eventHandlerLine1 = e -> {
            continueloopLine1(line1);
        };

        EventHandler<ActionEvent> eventHandlerLine2 = e -> {
            continueloopLine2(line2);
        };

        EventHandler<ActionEvent> eventHandler1 = e -> {
            circleActions(circle1);
        };

        EventHandler<ActionEvent> eventHandler2 = e -> {
            circleActions(circle2);
        };

        EventHandler<ActionEvent> eventHandlerArc = e -> {
            continueloopArc(arc);
        };

        EventHandler<ActionEvent> eventHandlerEnlargeLine8 = e -> {
            EnlargeLine8(line8);
        };

        EventHandler<ActionEvent> eventHandlerShrinkLine8 = e -> {
            ShrinkLine8(line8, line9);
        };

        EventHandler<ActionEvent> eventHandlerDisButton1 = e -> {
            disappearanceButton1(b1, circle1, line9);
        };

        EventHandler<ActionEvent> eventHandlerEnlargeLine3 = e -> {
            EnlargeLine3(line3);
        };

        EventHandler<ActionEvent> eventHandlerShrinkLine3 = e -> {
            ShrinkLine3(line3, line1);
        };

        EventHandler<ActionEvent> eventHandlerDisButton2 = e -> disappearanceButton2(b2, circle2, line1);

        EventHandler<ActionEvent> eventHandlerDisLine2 = e -> {
            disLine2(line2);
        };

        EventHandler<ActionEvent> eventHandlerLine2_1 = e -> {
            continueloopLine1(line2_1);
        };

        EventHandler<ActionEvent> eventHandlerdecrOpacity = e -> {
        	decrOpacity();
        };

        line1.setStrokeWidth(3);
        line2.setStrokeWidth(3);
        line2_1.setStrokeWidth(3);
        line3.setStrokeWidth(3);
        line8.setStrokeWidth(3);
        line9.setStrokeWidth(3);

        // Created a button 1
        b1.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
                + "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
        b1.setLayoutX(380);
        b1.setLayoutY(480);

        // Set on action to b1
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {
            	buttonClicked = 1;

            	count();
                // Animation for enlarge and shrink
                Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler1));
                animationButton.setCycleCount(2);
                animationButton.play();

                // Animation for line9
                Timeline animationLine9 = new Timeline(new KeyFrame(Duration.millis(2), eventHandlerLine9));
                animationLine9.setCycleCount(450);
                animationLine9.play();

                // line7 is disappearing
                FadeTransition ft = new FadeTransition(Duration.millis(1500), line7);
                ft.setFromValue(5.0);
                ft.setToValue(0);
                ft.play();

                // Animation for enlarge of line8
                Timeline animationEnlargeLine8 = new Timeline(
                        new KeyFrame(Duration.millis(90), eventHandlerEnlargeLine8));
                animationEnlargeLine8.setCycleCount(5);
                animationEnlargeLine8.play();

                // Animation for shrink line8
                Timeline animationShrinkLine8 = new Timeline(
                        new KeyFrame(Duration.millis(40), eventHandlerShrinkLine8));
                animationShrinkLine8.setCycleCount(40);
                animationShrinkLine8.play();

                //Animation for decrement pane opacity
                Timeline animationDisButton1 = new Timeline(new KeyFrame(Duration.millis(40), eventHandlerDisButton1));
                animationDisButton1.setCycleCount(42);
                animationDisButton1.play();
            }

        });

        // Created a button2
        b2.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
                + "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
        b2.setLayoutX(480);
        b2.setLayoutY(380);

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

                if (buttonClicked == 0) {// if collision appears

                    // Animation for enlarge of line3
                    Timeline animationEnlargeLine3 = new Timeline(
                            new KeyFrame(Duration.millis(90), eventHandlerEnlargeLine3));
                    animationEnlargeLine3.setCycleCount(5);
                    animationEnlargeLine3.play();

                    PathTransition pt = new PathTransition(Duration.millis(500), new Line(460, 100, 445, 100), line1);
                    pt.play();

                    PathTransition pt1 = new PathTransition(Duration.millis(500), new Line(400, 90, 385, 90), arc);
                    pt1.play();

                    PathTransition pt2 = new PathTransition(Duration.millis(500), new Line(365, 100, 350, 100),
                            line2_1);
                    pt2.play();

                    // Line 2 is sliding
                    Timeline animationDisLine2 = new Timeline(new KeyFrame(Duration.millis(250), eventHandlerDisLine2));
                    animationDisLine2.setCycleCount(15);
                    animationDisLine2.play();

                    //Animation for decrement pane opacity
                    Timeline animationPaneOpacity = new Timeline(
                            new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
                    animationPaneOpacity.setCycleCount(15);
                    animationPaneOpacity.play();
                } else if (buttonClicked == 1) {// if there is no collision

                    // Animation for enlarge of line3
                    Timeline animationEnlargeLine3 = new Timeline(
                            new KeyFrame(Duration.millis(100), eventHandlerEnlargeLine3));
                    animationEnlargeLine3.setCycleCount(5);
                    animationEnlargeLine3.play();

                    // Animation for line1
                    Timeline animationLine1 = new Timeline(new KeyFrame(Duration.millis(5), eventHandlerLine1));
                    animationLine1.setCycleCount(400);
                    animationLine1.play();

                    // Animation for line2
                    Timeline animationLine2 = new Timeline(new KeyFrame(Duration.millis(5), eventHandlerLine2));
                    animationLine2.setCycleCount(300);
                    animationLine2.play();

                    // Animation for line2_1
                    Timeline animationLine2_1 = new Timeline(new KeyFrame(Duration.millis(5), eventHandlerLine2_1));
                    animationLine2_1.setCycleCount(300);
                    animationLine2_1.play();

                    // Animation for arc
                    Timeline animationArc = new Timeline(new KeyFrame(Duration.millis(5), eventHandlerArc));
                    animationArc.setCycleCount(455);
                    animationArc.play();

                    // Animation for shrink line3
                    Timeline animationShrinkLine3 = new Timeline(
                            new KeyFrame(Duration.millis(40), eventHandlerShrinkLine3));
                    animationShrinkLine3.setCycleCount(90);
                    animationShrinkLine3.play();

                    //Animation for disappear button2
                    Timeline animationDisButton2 = new Timeline(
                            new KeyFrame(Duration.millis(40), eventHandlerDisButton2));
                    animationDisButton2.setCycleCount(80);
                    animationDisButton2.play();

                    // line4 is disappearing
                    FadeTransition ftLine4 = new FadeTransition(Duration.millis(3000), line4);
                    ftLine4.setFromValue(5.0);
                    ftLine4.setToValue(0);
                    ftLine4.play();

                    // line5 is disappearing
                    FadeTransition ftLine5 = new FadeTransition(Duration.millis(3000), line5);
                    ftLine5.setFromValue(5.0);
                    ftLine5.setToValue(0);
                    ftLine5.play();

                    // line6 is disappearing
                    FadeTransition ftLine6 = new FadeTransition(Duration.millis(3000), line6);
                    ftLine6.setFromValue(5.0);
                    ftLine6.setToValue(0);
                    ftLine6.play();

                }
            }
        });

        arc.setType(ArcType.OPEN);
        arc.setStroke(Color.BLACK);
        arc.setFill(Color.AZURE);
        arc.setStrokeWidth(3);

        // Added nodes to the pane
        pane.getChildren().addAll(line2, line1, line3, arc, line8, line9, line4, line5, line6, line7, circle1, circle2,
                b1, b2, line2_1, stack);

        pane.setStyle("-fx-background-color: azure;");//Set pane color

        // Created a scene and place it in the stage
        stage.setTitle("GAME"); // Set the stage title
        stage.setScene(scene); // Placed the scene in the stage
        stage.setResizable(false);// Set stage resizable
        stage.show(); // Displayed the stage

    }

    @Override
    public void onSuccess() {//When collision does not appear show next level
        new Level2(stage).drawLevel();
    }

    @Override
    public void onFail() {//When collision appears show same level
        new Level1(stage).drawLevel();
    }

    @Override
	public void moveFail() {
		new Level1(stage).drawLevel();
	}
    // Created a method for disappearance of line9
    public boolean continueloopLine9(Line line) {

        if (line.getStartY() == line.getEndY()) {
            pane.getChildren().remove(line);
            return false;
        } else if (line.getStartY() != line.getEndY()) {
            line.setStartY(line.getStartY() + 1);
        }
        return true;
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

    // Created a method for disappearance of line1
    public boolean continueloopLine1(Line line) {
    	if (line.getStartX() != 110 && line.getEndX() != 110) {
            line.setStartX(line.getStartX() - 1);
            line.setEndX(line.getEndX() - 1);
        } else if (line.getStartX() == 110 && line.getEndX() != 110)
            line.setEndX(line.getEndX() - 1);

        else if (line.getStartX() == 110 && line.getEndX() == 110) {
            pane.getChildren().remove(line);
            return true;
        }
        return false;
    }

    // Created a method for disappearance of line2
    public boolean continueloopLine2(Line line) {

        if (line.getEndX() == 110) {
            pane.getChildren().remove(line);
            return false;
        } else if (line.getEndX() != 110) {
            line.setEndX(line.getEndX() - 1);
        }

        return true;
    }

    // Created a method for disappearance of arc
    public boolean continueloopArc(Arc arc) {

        if (arc.getCenterX() >= 145) {
            arc.setCenterX(arc.getCenterX() - 1);
        } else if (arc.getCenterX() < 145 && arc.getCenterX() > 90) {
            arc.setLength(arc.getLength() - 3);
            arc.setCenterX(arc.getCenterX() - 1);
        } else if (arc.getCenterX() == 90 && arcControl <= 9) {
            arc.setLength(arc.getLength() - 3);
            arcControl++;
            if (arc.getLength() == 0)
                pane.getChildren().remove(arc);
        }
        return true;
    }

    // Enlarge line8
    public boolean EnlargeLine8(Line line) {
        line.setEndX(line.getEndX() + 2);
        line.setStartX(line.getStartX() - 2);
        return true;
    }

    //Shrink line8
    public boolean ShrinkLine8(Line line, Line line9) {
        if (line9.getStartY() == line9.getEndY()) {
            line.setEndX(line.getEndX() - 1);
            line.setStartX(line.getStartX() + 1);
        }

        if (line.getStartX() == line.getEndX()) {
            pane.getChildren().remove(line);
            return false;
        }
        return true;
    }

    //Method for dissappearance of button1
    public boolean disappearanceButton1(Button button, Circle circle, Line line) {
        pane.getChildren().remove(button);

        if (line.getStartY() == line.getEndY()) {
            circle.setRadius(circle.getRadius() - 1);
        }

        return true;
    }

    //Method for dissappearance of button1

    public boolean disappearanceButton2(Button button, Circle circle, Line line) {
        pane.getChildren().remove(button);

        if (line.getStartX() == line.getEndX()) {
            circle.setRadius(circle.getRadius() - 1);
            if (circle.getRadius() == 0) {
                onSuccess();
            }
        }
        return true;
    }

    // Enlarge line3
    public boolean EnlargeLine3(Line line) {
        line.setEndY(line.getEndY() + 2);
        line.setStartY(line.getStartY() - 2);
        return true;
    }

    //Shrink line3
    public boolean ShrinkLine3(Line line, Line line1) {
        if (line1.getStartX() <= 110) {
            line.setEndY(line.getEndY() - 1);
            line.setStartY(line.getStartY() + 1);
        }

        if (line.getStartY() == line.getEndY()) {
            pane.getChildren().remove(line);
            return false;
        }
        return true;
    }

    // When collision occures action of line2
    public boolean disLine2(Line line) {
    	line.setEndX(line.getEndX() - 1);
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