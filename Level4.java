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

public class Level4 implements LevelDrawer {

	private int secondsPassed = 0;//Game duration

	Text t = new Text("4");
 	int count = Integer.parseInt(t.getText());
 	
	Timer timer = new Timer();
	TimerTask task = new TimerTask(){
		public void run(){
			secondsPassed++;
		}
	};
    private Stage stage;
    private int buttonClicked, arcControl, connectorControl= 0;

    Button b1 = new Button();
    Button b2 = new Button();
    Button b3 = new Button();

    // Create a pane to hold the nodes
    Pane pane = new Pane();

    public Level4(Stage stage) {//Level4 contstructor
        this.stage = stage;
    }

    @Override
    public void drawLevel() {

    	StackPane stack = new StackPane();
		 t.setFont(Font.font(75));
		 stack.getChildren().add(t);
		 
    	timer.scheduleAtFixedRate(task, 1000, 1000);

        Circle circle1 = new Circle();
        circle1.setCenterX(110);
        circle1.setCenterY(350);
        circle1.setRadius(20);
        circle1.setStroke(Color.DARKCYAN);
        circle1.setFill(Color.DARKCYAN);

        Circle circle2 = new Circle();
        circle2.setCenterX(310);
        circle2.setCenterY(530);
        circle2.setRadius(20);
        circle2.setStroke(Color.DARKCYAN);
        circle2.setFill(Color.DARKCYAN);

        Circle circle3 = new Circle();
        circle3.setCenterX(310);
        circle3.setCenterY(350);
        circle3.setRadius(20);
        circle3.setStroke(Color.DARKCYAN);
        circle3.setFill(Color.DARKCYAN);
        circle3.setStrokeWidth(3);

        // Created a button 1
        b1.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
                + "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
        b1.setLayoutX(90);
        b1.setLayoutY(330);

        // Created a button 2
        b2.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 40px; " + "-fx-min-height: 40px; "
                + "-fx-max-width: 40px; " + "-fx-max-height: 40px;" + "-fx-background-color: darkcyan;");
        b2.setLayoutX(290);
        b2.setLayoutY(510);

        // Created a button 3
        b3.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 36px; " + "-fx-min-height: 36px; "
                + "-fx-max-width: 36px; " + "-fx-max-height: 36px;" + "-fx-background-color: azure;");
        b3.setLayoutX(292);
        b3.setLayoutY(332);

        Arc arc1 = new Arc(482, 120, 20, 20, 0, 180);
        arc1.setFill(Color.WHITE);
        arc1.setType(ArcType.OPEN);
        arc1.setStroke(Color.BLACK);
        arc1.setFill(Color.AZURE);
        arc1.setStrokeWidth(3);

        Line line1 = new Line(330, 350, 482, 350);
        Line line2 = new Line(482, 350, 482, 340);
        Line line3 = new Line(320, 110, 320, 130);
        line3.setStrokeWidth(3);
        Line line4 = new Line(310, 120, 320, 120);
        Line line5 = new Line(310, 120, 310, 330);
        Line line6 = new Line(130, 350, 290, 350);
        Line line7 = new Line(310, 370, 310, 510);
        Line line8 = new Line(502, 120, 522, 120);
        line8.setStrokeWidth(3);
        Line line9 = new Line(310, 330, 310, 370);
        Line line10 = new Line(320, 120, 462, 120);
        line10.setStrokeWidth(3);
        Line line11 = new Line(472, 340, 492, 340);
        line11.setStrokeWidth(3);
        Line line12 = new Line(482, 110, 482, 340);
        line12.setStrokeWidth(3);

        // Create a pane to hold the nodes
        Pane pane = new Pane();

        EventHandler<ActionEvent> eventHandler1 = e -> {
            circleActions(circle1);
        };

        EventHandler<ActionEvent> eventHandler2 = e -> {
            circleActions(circle2);
        };

        EventHandler<ActionEvent> eventHandlerEnlargeLine3 = e -> {
            EnlargeLine3(line3);
        };

        EventHandler<ActionEvent> eventHandlerEnlargeLine11 = e -> {
            EnlargeLine11(line11);
        };

        EventHandler<ActionEvent> eventHandlerDecrLine12 = e -> {
            decrLine12(line12);
        };

        EventHandler<ActionEvent> eventHandlerShrinkLine11 = e -> {
            ShrinkLine11(line11, line12);
        };

        EventHandler<ActionEvent> eventHandlerDisButton1 = e -> {
        	disButton1(b1, circle1, line11);
        };

        EventHandler<ActionEvent> eventHandlerDecrLine10 = e -> {
            DecrLine10(line10);
        };

        EventHandler<ActionEvent> eventHandlerArc = e -> {
            continueloopArc(arc1);
        };

        EventHandler<ActionEvent> eventHandlerLine8 = e -> {
            continueloopLine8(line8);
        };

        EventHandler<ActionEvent> eventHandlerShrinkLine3 = e -> {
            ShrinkLine3(line3, line10);
        };

        EventHandler<ActionEvent> eventHandlerDisButton2 = e -> {
        	disButton2(b2, circle2, line8);
        };

        EventHandler<ActionEvent> eventHandlerdecrOpacity = e -> {
	        decrOpacity();
	    };

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {
            	buttonClicked = 1;
            	count();
                if (connectorControl % 2 == 1) {
                	pane.getChildren().remove(b1);

                    // Animation for enlarge and shrink of line1
                    Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler1));
                    animationButton.setCycleCount(2);
                    animationButton.play();

                    // Animation for enlarge of line11
                    Timeline animationEnlargeLine11 = new Timeline(
                            new KeyFrame(Duration.millis(40), eventHandlerEnlargeLine11));
                    animationEnlargeLine11.setCycleCount(10);
                    animationEnlargeLine11.play();

                    // animation for line12 when collision appears
                    Timeline animationDecrLine12 = new Timeline(
                            new KeyFrame(Duration.millis(8), eventHandlerDecrLine12));
                    animationDecrLine12.setCycleCount(230);
                    animationDecrLine12.play();

                    // Animation for shrink line13
                    Timeline animationShrinkLine11 = new Timeline(
                            new KeyFrame(Duration.millis(45), eventHandlerShrinkLine11));
                    animationShrinkLine11.setCycleCount(70);
                    animationShrinkLine11.play();

                    // line1 is disappearing
                    FadeTransition ft1 = new FadeTransition(Duration.millis(3000), line1);
                    ft1.setFromValue(5.0);
                    ft1.setToValue(0);
                    ft1.play();

                    // line2 is disappearing
                    FadeTransition ft2 = new FadeTransition(Duration.millis(3000), line2);
                    ft2.setFromValue(5.0);
                    ft2.setToValue(0);
                    ft2.play();

                    // line6 is disappearing
                    FadeTransition ft6 = new FadeTransition(Duration.millis(3000), line6);
                    ft6.setFromValue(5.0);
                    ft6.setToValue(0);
                    ft6.play();

                    //Animation for disappearing of button1
                    Timeline animationDisButton1 = new Timeline(
                            new KeyFrame(Duration.millis(100), eventHandlerDisButton1));
                    animationDisButton1.setCycleCount(50);
                    animationDisButton1.play();
                }
            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {
            	buttonClicked = 2;
                secondsPassed=0;
                count();
                if (connectorControl % 2 == 0) {
                	pane.getChildren().remove(b2);

                    if (line12.getStartY() == 110) {// button1 is not clicked, when collision appears

                        // Animation for enlarge and shrink of line2
                        Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler2));
                        animationButton.setCycleCount(2);
                        animationButton.play();

                        // Animation for enlarge of line3
                        Timeline animationEnlargeLine3 = new Timeline(
                                new KeyFrame(Duration.millis(40), eventHandlerEnlargeLine3));
                        animationEnlargeLine3.setCycleCount(10);
                        animationEnlargeLine3.play();

                        PathTransition pt = new PathTransition(Duration.millis(500), new Line(512, 120, 497, 120),
                                line8);
                        pt.play();

                        PathTransition pt1 = new PathTransition(Duration.millis(500), new Line(482, 110, 467, 110),
                                arc1);
                        pt1.play();

                        //Animation for line10 when collision appears
                        Timeline animationDecrLine10 = new Timeline(
                                new KeyFrame(Duration.millis(25), eventHandlerDecrLine10));
                        animationDecrLine10.setCycleCount(15);
                        animationDecrLine10.play();

                        // line6 is disappearing
                        FadeTransition ftPane = new FadeTransition(Duration.millis(1100), pane);
                        ftPane.setFromValue(5.0);
                        ftPane.setToValue(0);
                        ftPane.play();

                        //Animation for decrement pane opacity
                        Timeline animationPaneOpacity = new Timeline(
                                new KeyFrame(Duration.millis(150), eventHandlerdecrOpacity));
                        animationPaneOpacity.setCycleCount(15);
                        animationPaneOpacity.play();

                    } else {// b1 is clicked, when collision does not appear

                        // Animation for enlarge and shrink of line2
                        Timeline animationButton = new Timeline(new KeyFrame(Duration.millis(100), eventHandler2));
                        animationButton.setCycleCount(2);
                        animationButton.play();

                        // Animation for enlarge of line3
                        Timeline animationEnlargeLine3 = new Timeline(
                                new KeyFrame(Duration.millis(40), eventHandlerEnlargeLine3));
                        animationEnlargeLine3.setCycleCount(10);
                        animationEnlargeLine3.play();

                        // Animation for line10
                        Timeline animationLine10 = new Timeline(
                                new KeyFrame(Duration.millis(6), eventHandlerDecrLine10));
                        animationLine10.setCycleCount(165);
                        animationLine10.play();

                        // Animation for line8
                        Timeline animationLine8 = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerLine8));
                        animationLine8.setCycleCount(400);
                        animationLine8.play();

                        // Animation for arc
                        Timeline animationArc = new Timeline(new KeyFrame(Duration.millis(6), eventHandlerArc));
                        animationArc.setCycleCount(191);
                        animationArc.play();

                        // Animation for shrink line3
                        Timeline animationShrinkLine3 = new Timeline(
                                new KeyFrame(Duration.millis(50), eventHandlerShrinkLine3));
                        animationShrinkLine3.setCycleCount(46);
                        animationShrinkLine3.play();

                        // Disapperance of button2
                        Timeline animationDisButton2 = new Timeline(
                                new KeyFrame(Duration.millis(100), eventHandlerDisButton2));
                        animationDisButton2.setCycleCount(50);
                        animationDisButton2.play();

                        // line4 is disappearing
                        FadeTransition ft4 = new FadeTransition(Duration.millis(3000), line4);
                        ft4.setFromValue(5.0);
                        ft4.setToValue(0);
                        ft4.play();

                        // line5 is disappearing
                        FadeTransition ft5 = new FadeTransition(Duration.millis(3000), line5);
                        ft5.setFromValue(5.0);
                        ft5.setToValue(0);
                        ft5.play();

                        // line7 is disappearing
                        FadeTransition ft7 = new FadeTransition(Duration.millis(3000), line7);
                        ft7.setFromValue(5.0);
                        ft7.setToValue(0);
                        ft7.play();

                        // line9 is disappearing
                        FadeTransition ft9 = new FadeTransition(Duration.millis(5000), line9);
                        ft9.setFromValue(5.0);
                        ft9.setToValue(0);
                        ft9.play();

                        // circle3 is disappearing
                        FadeTransition ftCircle3 = new FadeTransition(Duration.millis(4000), circle3);
                        ftCircle3.setFromValue(5.0);
                        ftCircle3.setToValue(0);
                        ftCircle3.play();

                        //Animation for disappear button3
                        FadeTransition ftButton3 = new FadeTransition(Duration.millis(5000), b3);
                        ftButton3.setFromValue(5.0);
                        ftButton3.setToValue(0);
                        ftButton3.play();
                    }
                }
            }
        });

        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {
            	buttonClicked = 3;
            	count();
                RotateTransition rt = new RotateTransition(Duration.millis(100), line9);//Rotates connector line
                rt.setByAngle(90);
                rt.setCycleCount(1);
                rt.setAutoReverse(false);
                rt.play();
                connectorControl++;
            }
        });

        // Added nodes to the pane
        pane.getChildren().addAll(circle1, circle2, circle3, b1, b2, b3, arc1,line1, line2, line3, line4, line5, line6,
                line7, line8, line9, line10, line11, line12, stack);

        pane.setStyle("-fx-background-color: azure;");//Set pane color

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 650, 650, Color.AZURE);
        stage.setTitle("GAME"); // Set the stage title
        stage.setResizable(false);// Set stage resizable
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @Override
    public void onSuccess() {//When collision does not appear show next level
        new Level5(stage).drawLevel();
    }

    @Override
    public void onFail() {//When collision appears show same level
      new Level4(stage).drawLevel();
    }

    @Override
	public void moveFail() {
		new Level1(stage).drawLevel();
	}
    
    // Button action method
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

    //Created a method for enlarge line3 when button is clicked
    public void EnlargeLine3(Line line) {
        line.setEndY(line.getEndY() + 2);
        line.setStartY(line.getStartY() - 2);
    }

    //Created a method for enlarge line11 when button is clicked
    public void EnlargeLine11(Line line) {
        line.setEndX(line.getEndX() + 2);
        line.setStartX(line.getStartX() - 2);
    }

    //Created a method for disappearance of line12
    public boolean decrLine12(Line line) {

    	if (line.getStartY() != line.getEndY()){
              line.setStartY(line.getStartY() + 1);
              return true;
    	}

    	pane.getChildren().remove(line);
    	return false;
    }

    //Created a method for disappearing line11 when collision does not appear
    public boolean ShrinkLine11(Line line, Line line12) {
        if (line12.getStartY() == line12.getEndY()) {
            line.setStartX(line.getStartX() + 1);
            line.setEndX(line.getEndX() - 1);
            return false;
        }

        if (line.getStartX() == line.getEndX()) {

            return false;
        }
        pane.getChildren().remove(line);
        return false;
    }

    // Disappearance of Button1
    // disappearance Button1
    public boolean disButton1(Button button, Circle circle, Line line11) {
        pane.getChildren().remove(button);

        if (line11.getEndX() < 492) {
            circle.setRadius(circle.getRadius() - 1);
        }

        return true;
    }

    //Created a method for disappearance of line10
    // Created a method for disappearance of line10
    public boolean DecrLine10(Line line) {

        if (line.getEndX() == 320) {
            pane.getChildren().remove(line);
            return false;
        } else if (line.getEndX() != 320) {
            line.setEndX(line.getEndX() - 1);
        }
        return true;
    }

    // Created a method for disappearance of arc
    // Created a method for disappearance of arc
    public boolean continueloopArc(Arc arc) {

        if (arc.getCenterX() >= 350) {
            arc.setCenterX(arc.getCenterX() - 1);
            return true;

        } else if (arc.getCenterX() < 350 && arc.getCenterX() > 295) {
            arc.setLength(arc.getLength() - 3);
            arc.setCenterX(arc.getCenterX() - 1);
            return true;

        } else if (arc.getCenterX() == 295 && arcControl <= 6) {
            arc.setLength(arc.getLength() - 5);
            arcControl++;
            return true;

        }
        pane.getChildren().remove(arc);
        return true;
    }

    // Created a method for disappearance of line8
    // Created a method for disappearance of line8
    public boolean continueloopLine8(Line line) {

        if (line.getStartX() != 320 && line.getEndX() != 320) {
            line.setStartX(line.getStartX() - 1);
            line.setEndX(line.getEndX() - 1);
        } else if (line.getStartX() == 320 && line.getEndX() != 320)
            line.setEndX(line.getEndX() - 1);

        else if (line.getStartX() == 320 && line.getEndX() == 320) {
            pane.getChildren().remove(line);
            return false;
        }

        return true;
    }

    //Created a method for disappearing line3 when collision does not appear
    public boolean ShrinkLine3(Line line, Line line8) {
        if (line8.getEndX() == line8.getStartX()) {
            line.setStartY(line.getStartY() + 1);
            line.setEndY(line.getEndY() - 1);

        }

        if (line.getEndY() == line.getStartY()) {
            pane.getChildren().remove(line);
            return false;
        }
        return false;
    }

    // Disappearance of Button2
    // disappearance Button2
    public boolean disButton2(Button button, Circle circle, Line line8) {
        pane.getChildren().remove(button);

        if (line8.getEndX() <= 320) {
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
    	if(secondsPassed == 2 && count >=0){
    		onFail();
    	}
    	else if(secondsPassed == 2 && count <0){
    		moveFail();
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