package application;

import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import Model.MainModel;

public class MainController {

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

    @FXML
    void show_goals_view(ActionEvent event) throws IOException {
    	String weight = weight_field.getText();
    	String height = height_field.getText();
    	
    	MainModel.validate_weight_height(weight, height);
    	
    	main_view = FXMLLoader.load(getClass().getResource("Goal.fxml"));
		Scene scene = new Scene(main_view);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
    }
    
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
