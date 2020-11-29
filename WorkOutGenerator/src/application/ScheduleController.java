package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ScheduleController {
	
	@FXML
	private AnchorPane mainPane;
	@FXML
	public TextArea mondayText;
	@FXML
	public TextArea tuesdayText;
	@FXML
	public TextArea wedText;
	@FXML
	public TextArea thurText;
	@FXML
	public TextArea friText;
	@FXML
	public TextArea satText;
	@FXML
	public TextArea sunText;
	
	@FXML
	public void Restart(ActionEvent event) throws IOException{
		mainPane = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
}
