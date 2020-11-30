import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyGUI extends Application {
	protected Text text=new Text(50,50,"Write something");
	protected BorderPane getPane() {
		HBox hb=new HBox(20);
		Button bt1=new Button("left");
		Button bt2=new Button("right");
		hb.getChildren().addAll(bt1,bt2);
		hb.setAlignment(Pos.CENTER);
		hb.setStyle("-fx-border-color:green");
		
		BorderPane pane=new BorderPane();
		pane.setBottom(hb);
		Pane p1=new Pane();
		p1.getChildren().add(text);
		pane.setCenter(p1);
		bt1.setOnAction(e->text.setX(text.getX()-2));
		bt2.setOnAction(e->text.setX(text.getX()+2));
		return pane;
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene =new Scene(getPane(),450,200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
