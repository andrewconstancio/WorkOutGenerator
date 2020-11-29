package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DaysController{

	ObservableList<Integer> list = FXCollections.observableArrayList(1,2,3,4,5,6,7);
	
	CurrentUser user;
	public boolean monday = false;
	public boolean tuesday = false;
	public boolean wednesday = false;
	public boolean thursday = false;
	public boolean friday = false;
	public boolean saturday = false;
	public boolean sunday = false;
    @FXML
    private AnchorPane main_view;

    @FXML
    private Button next_main_button;

    @FXML
    private Button back_main_button;

    @FXML
    private ComboBox<Integer> days_combobox;

    // add no_of_days to combobox
    
	public void start(CurrentUser user) {
    	days_combobox.getItems().addAll(list);
    	days_combobox.getSelectionModel().select(0);
    	
    	this.user = user; // current user information
	}
	  
    @FXML
    void setDays(ActionEvent event) {
    	user.days = days_combobox.getSelectionModel().getSelectedItem();
    }
    
    @FXML
    void show_main_view(ActionEvent event) {
    	
    	try {
    		
    		//Load the main.fxml file and replace pane children
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Goal.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			
			main_view.getChildren().setAll(root);

		} catch (Exception exception) {
			exception.printStackTrace();
		}
    	
    }
    @FXML
	public void Monday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(monday == true) {
			monday = false;
		}
		else {
			monday = true;
		}
	}
    @FXML
	public void Tuesday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(tuesday == true) {
			tuesday = false;
		}
		else {
			tuesday = true;
		}
	}
    @FXML
	public void Wednesday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(wednesday == true) {
			wednesday = false;
		}
		else {
			wednesday = true;
		}
	}
    @FXML
	public void Thursday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(thursday == true) {
			thursday = false;
		}
		else {
			thursday = true;
		}
	}
    @FXML
	public void Friday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(friday == true) {
			friday = false;
		}
		else {
			friday = true;
		}
	}
    @FXML
	public void Saturday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(saturday == true) {
			saturday = false;
		}
		else {
			saturday = true;
		}
	}
    @FXML
	public void Sunday(ActionEvent event) throws IOException{
		//isBuff = false;
		if(sunday == true) {
			sunday = false;
		}
		else {
			sunday = true;
		}
	}

    @FXML
    void show_next_view(ActionEvent event) throws IOException{
    	main_view = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
		Scene scene = new Scene(main_view);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
    }
    
}
   

