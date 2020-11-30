package application;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.ProccesingData;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DaysController {

	ObservableList<Integer> list = FXCollections.observableArrayList(1,2,3,4,5,6,7);
	
	User user;
	public boolean monday = false;
	public boolean tuesday = false;
	public boolean wednesday = false;
	public boolean thursday = false;
	public boolean friday = false;
	public boolean saturday = false;
	public boolean sunday = false;
    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button next_main_button;

    @FXML
    private Button back_main_button;

    @FXML
    private CheckBox mon;
    @FXML
    private CheckBox tues;
    @FXML
    private CheckBox wed;
    @FXML
    private CheckBox thur;
    @FXML
    private CheckBox fri;
    @FXML
    private CheckBox sat;
    @FXML
    private CheckBox sun;
    // add no_of_days to combobox
    //back button to go back to the scene before the current scene which is Goal.fxml
    @FXML
    void show_main_view(ActionEvent event) throws IOException{
    	mainPane = FXMLLoader.load(getClass().getResource("Goal.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
    }
    //marking the days user chose to work out and if the button has been clicked then it will unclick it if clicked again through monday to sunday
    @FXML
	public void Monday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(monday == true) {
			monday = false;
			User.days[0] = 0;
		}
		else {
			monday = true;
			User.days[0] = 1;
		}
	}
    @FXML
	public void Tuesday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(tuesday == true) {
			tuesday = false;
			User.days[1] = 0;
		}
		else {
			tuesday = true;
			User.days[1] = 1;
		}
	}
    @FXML
	public void Wednesday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(wednesday == true) {
			wednesday = false;
			User.days[2] = 0;
		}
		else {
			wednesday = true;
			User.days[2] = 1;
		}
	}
    @FXML
	public void Thursday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(thursday == true) {
			thursday = false;
			User.days[3] = 0;
		}
		else {
			thursday = true;
			User.days[3] = 1;
		}
	}
    @FXML
	public void Friday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(friday == true) {
			friday = false;
			User.days[4] = 0;
		}
		else {
			friday = true;
			User.days[4] = 1;
		}
	}
    @FXML
	public void Saturday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(saturday == true) {
			saturday = false;
			User.days[5] = 0;
		}
		else {
			saturday = true;
			User.days[5] = 1;
		}
	}
    @FXML
	public void Sunday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(sunday == true) {
			sunday = false;
			User.days[6] = 0;
		}
		else {
			sunday = true;
			User.days[6] = 1;
		}
	}
    //show_next_view moves to the next scene which is Schedule.fxml
    @FXML
    void show_next_view(ActionEvent event) throws IOException{
    	
    	mainPane = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
    }
    
}
   

