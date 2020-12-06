import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Kilometer extends Application {
	private TextField Mile=new TextField();
    private TextField Kilometer=new TextField();
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 GridPane gridPane=new GridPane();
	        gridPane.setHgap(5);
	        gridPane.setVgap(5);
	        gridPane.add(new Label("Mile"), 0, 0);
	        gridPane.add(Mile,1,0);
	        gridPane.add(new Label("Kilometer"), 0, 1);
	        gridPane.add(Kilometer,1,1);
	        Scene scene=new Scene(gridPane,400,100);
	        primaryStage.setTitle("¼ÆËãÆ÷");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	         
	         
	
	Mile.setOnKeyPressed(new EventHandler<KeyEvent>()
	{
	public void handle(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		if(keyEvent.getCode()==KeyCode.ENTER) {
	       	double x=Double.parseDouble(Mile.getText());

	        String a=String.valueOf(x*1.602307322544464);
	        Kilometer.setText(a);
	        }
	}});  
	Kilometer.setOnKeyPressed(new EventHandler<KeyEvent>()
	{
		public void handle(KeyEvent keyEvent) {
		if(keyEvent.getCode()==KeyCode.ENTER) {
	        double y=Double.parseDouble(Kilometer.getText());
	        String b=String.valueOf(y/1.602307322544464);
	        Mile.setText(b);
		}
	}});
	
	
		
	}
		
}
