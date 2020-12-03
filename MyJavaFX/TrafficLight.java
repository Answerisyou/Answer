import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TrafficLight extends Application {

	protected BorderPane getPane() {
		HBox hb1=new HBox(20);
		hb1.setPadding(new Insets(5,5,5,5));
		hb1.setStyle("-fx-border-color:black");
		RadioButton rb1=new RadioButton("Red");
		RadioButton rb2=new RadioButton("Green");
		RadioButton rb3=new RadioButton("Yellow");
		hb1.getChildren().addAll(rb1,rb2,rb3);
		hb1.setAlignment(Pos.CENTER);
		ToggleGroup group=new ToggleGroup();
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb3.setToggleGroup(group);
		
		VBox vb=new VBox(20);
		 vb.setPadding(new Insets(15,15,15,15));
//		 vb.setSpacing(10);
//		 vb.setMaxSize(10, 15);
		 vb.setStyle("-fx-border-color:black");
		 Circle circle1=new Circle(20);
		 Circle circle2=new Circle(20);
		 Circle circle3=new Circle(20);
		 circle1.setStroke(Color.BLACK);
		 circle1.setFill(Color.WHITE);
		 circle2.setStroke(Color.BLACK);
		 circle2.setFill(Color.WHITE);
		 circle3.setStroke(Color.BLACK);
		 circle3.setFill(Color.WHITE);
		 vb.setSpacing(8);
		 vb.setMaxSize(15, 20);
		 vb.getChildren().addAll(circle1,circle2,circle3);
		 vb.setAlignment(Pos.CENTER);
		 BorderPane pane=new  BorderPane();
		 pane.setBottom(hb1);
		 pane.setCenter(vb);
		rb1.setOnAction(e->{
			if(rb1.isSelected()) {
				circle1.setFill(Color.RED);
				circle2.setFill(Color.WHITE);
				circle3.setFill(Color.WHITE);
			}
		});
		rb2.setOnAction(e->{
			if(rb2.isSelected()) {
				circle2.setFill(Color.GREEN);
				circle1.setFill(Color.WHITE);
				circle3.setFill(Color.WHITE);
			}
		});
		rb3.setOnAction(e->{
			if(rb3.isSelected()) {
				circle3.setFill(Color.YELLOW);
				circle1.setFill(Color.WHITE);
				circle2.setFill(Color.WHITE);
			}
		});
		return pane;
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene=new Scene(getPane(),500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
