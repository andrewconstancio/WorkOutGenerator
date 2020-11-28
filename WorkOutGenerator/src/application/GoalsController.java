package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GoalsController {
	public boolean isLean = false;
	public boolean isBuff = false;
	@FXML
	private AnchorPane mainPane;
	@FXML
	public TextArea calories;
	
	@FXML
	public void Lean(ActionEvent event) throws IOException{
		isLean = true;
		isBuff = false;
	}
	@FXML
	public void Buff(ActionEvent event) throws IOException{
		isBuff = true;
		isLean = false;
	}
	@FXML
	public void NextBtn(ActionEvent event) throws IOException {
		if(calories.getText().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("There arent any calories entered!!!");
			alert.show();
		}
		mainPane = FXMLLoader.load(getClass().getResource("Days.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	@FXML
	public void BackBtn(ActionEvent event) throws IOException {
		mainPane = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	
}