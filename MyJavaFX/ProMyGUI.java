import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class ProMyGUI extends MyGUI {

	@Override
	protected BorderPane getPane() {
		BorderPane pane=super.getPane();
		Font fontBoldItalic=Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20);
		Font fontBold=Font.font("Times New Roman",FontWeight.BOLD,FontPosture.REGULAR,20);
		Font fontItalic=Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.ITALIC,20);
		Font fontNormal=Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.REGULAR,20);
		text.setFont(fontNormal);
		VBox vb=new VBox(20);
		vb.setPadding(new Insets(5,5,5,5));
		vb.setStyle("-fx-border-color:green");
		CheckBox chkBold=new CheckBox("Bold");
		CheckBox chkItalic=new CheckBox("Italic");
		vb.getChildren().addAll(chkBold,chkItalic);
		pane.setRight(vb);
		
		EventHandler<ActionEvent>handler=e->{
			if(chkBold.isSelected()&&chkItalic.isSelected()) {
				text.setFont(fontBoldItalic);
			}
			else if(chkBold.isSelected()) {
				text.setFont(fontBold);
			}
			else if(chkItalic.isSelected()) {
				text.setFont(fontItalic);
			}
			else {
				text.setFont(fontNormal);
			}
		};
		chkBold.setOnAction(handler);
		chkItalic.setOnAction(handler);
		return pane;
		
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
