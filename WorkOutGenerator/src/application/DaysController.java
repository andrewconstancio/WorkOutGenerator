package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

public class DaysController{

	ObservableList<Integer> list = FXCollections.observableArrayList(1,2,3,4,5,6,7);
	
	CurrentUser user;
	
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
    void show_next_view(ActionEvent event) {

    }
    
}
   

