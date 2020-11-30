package application;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import Model.MainModel;

public class MainController implements Initializable {

    @FXML
    private AnchorPane main_view;

    @FXML
    private ToggleButton female_button;

    @FXML
    private ToggleButton other_button;

    @FXML
    private Button next_main_button;

    @FXML
    private TextField height_field;

    @FXML
    private TextField weight_field;

    @FXML
    private ToggleButton male_button;
    
    //if the button has been clicked already then when user press back button from next scene it will still be clicked instead of resetting the buttons and TextField
    //if no buttons were clicked then set the gender to male since male button is clicked from the beginning also prints out the input user entered without resetting while
    //changing scene to scene
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(User.gender == "male") {
			MainModel.toggle_gender_buttons(male_button, female_button, other_button, "male");
		}
		else if(User.gender == "female") {
			MainModel.toggle_gender_buttons(male_button, female_button, other_button, "female");
		}
		else if(User.gender == "other") {
			MainModel.toggle_gender_buttons(male_button, female_button, other_button, "other");
		}
		else {
			User.gender = "male";
		}
		if(User.height != null) {
			height_field.appendText(User.height);
		}
		if(User.weight != 0) {
			weight_field.appendText(Integer.toString(User.weight));
		}
	}
	//gets the value of weight and the height of the user
    @FXML
    void show_goals_view(ActionEvent event) throws IOException {
    	String weight = weight_field.getText();
    	String height = height_field.getText();
    	
    	boolean result = false;
    	
    	result = MainModel.validate_weight_height(weight, height);
    	
    	if(result == false) {
    		return;
    	}
    	
    	main_view = FXMLLoader.load(getClass().getResource("Goal.fxml"));
		Scene scene = new Scene(main_view);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
    }
    //marks the button depending on which button user clicks
    @FXML
    void toggle_male_button() {
    	MainModel.toggle_gender_buttons(male_button, female_button, other_button, "male");
    }

    @FXML
    void toggle_female_button() {
    	MainModel.toggle_gender_buttons(male_button, female_button, other_button, "female");
    }

    @FXML
    void toggle_other_button() {
    	MainModel.toggle_gender_buttons(male_button, female_button, other_button, "other");
    }
}
