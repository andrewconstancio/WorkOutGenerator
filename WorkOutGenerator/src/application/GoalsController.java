package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GoalsController {
	
	@FXML
	private AnchorPane mainPane;
	@FXML
	private MenuButton LeanOrBuff;
	@FXML
	private MenuButton Weight;
	@FXML
	private MenuButton Nutritions;
	@FXML
	private MenuItem lean;
	@FXML
	private MenuItem buff;
	
	@FXML
	public void chooseTheType(ActionEvent event) throws IOException{
		
	}
	@FXML
	public void NextBtn(ActionEvent event) throws IOException {
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