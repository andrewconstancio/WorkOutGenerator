package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.MainModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GoalsController implements Initializable {
	public boolean isLean = false;
	public boolean isBuff = false;
	@FXML
	private AnchorPane mainPane;
	@FXML
	public TextArea calories;
	@FXML
	public CheckBox box;
	@FXML
	public CheckBox box2;
	//to make sure if user press back button all the information is still there instead of resetting
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(String.valueOf(User.lean) == "true") {
			isLean = true;
			box.setSelected(true);
		}
		//else {
		//	box.setSelected(false);
		//}
		if(String.valueOf(User.buff) == "true")
		{
			isBuff = true;
			box2.setSelected(true);
		}
		//else {
		//	box2.setSelected(false);
		//}
	}
	//button for if user wants to be lean instead of buff 
	@FXML
	public void Lean(ActionEvent event) throws IOException{
		//isBuff = false;
		if(isLean == true) {
			isLean = false;
			User.lean = false;
			box.setSelected(false);
			//User.buff = true;
		}
		else {
			isLean = true;
			User.lean = true;
			box.setSelected(true);
			//User.buff = false;
		}
	}
	//button for if user wants to be buff instead of lean
	@FXML
	public void Buff(ActionEvent event) throws IOException{
		//isLean = false;
		if(isBuff == true) {
			isBuff = false;
			User.buff = false;
			box2.setSelected(false);
			//ser.lean = true;
		}
		else {
			isBuff = true;
			User.buff = true;
			box2.setSelected(true);
			//User.lean = false;
		}
		
	}
	//checks if the string is in numbers
	public static boolean isInteger(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	}
	//moves to the next scene but if there are certain inputs that arent allowed it will print out the error message
	@FXML
	public void NextBtn(ActionEvent event) throws IOException {
		if(calories.getText().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("There arent any calories entered!!!");
			alert.show();
		}
		else if(isInteger(calories.getText()) == false) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("Calories has to be number!!!");
			alert.show();
		}
		else if(isLean == false && isBuff == false) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("you havent chose the goal of the body type!!!");
			alert.show();
		}
		else if(isLean == true && isBuff == true) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("you can only pick one body type!!!");
			alert.show();
		}
		else {
		mainPane = FXMLLoader.load(getClass().getResource("Days.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
		}
	}
	//back button to go back to the previous scene 
	@FXML
	public void BackBtn(ActionEvent event) throws IOException {
		mainPane = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	
}