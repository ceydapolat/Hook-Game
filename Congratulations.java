import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Congratulations implements LevelDrawer {

	Text finish = new Text("CONGRATULATIONS :)");

	private final Stage stage;

	// Create a pane to hold the nodes
		Pane pane = new Pane();
	    Scene scene = new Scene(pane, 600, 600, Color.AZURE);


	public Congratulations(Stage stage) {
		this.stage = stage;
	}

	@Override
	public void moveFail() {
		// TODO Auto-generated method stub

	}


	@Override
	public void onSuccess() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFail() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drawLevel() {
		
			StackPane stackfinish = new StackPane();
			 finish.setFont(Font.font(75));
			 stackfinish.getChildren().add(finish);

			 pane.getChildren().add(stackfinish);

	// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 600, 600, Color.AZURE);
        stage.setScene(scene); // Placed the scene in the stage
        stage.setResizable(false);// Set stage resizable
        stage.show(); // Displayed the stage

	}
}