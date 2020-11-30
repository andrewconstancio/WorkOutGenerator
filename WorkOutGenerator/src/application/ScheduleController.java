package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Model.GetSchedule;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ScheduleController implements Initializable  {
	
    @FXML
    private TextArea sundayText;

    @FXML
    private TextArea fridayText;

    @FXML
    private TextArea tuesdayText;

    @FXML
    private TextArea wednesdayText;

    @FXML
    private TextArea mondayText;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private TextArea thursdayText;

    @FXML
    private TextArea saturdayText;
	//restarts the program and when it does reset everything where user can enter brand new information
	@FXML
	public void Restart(ActionEvent event) throws IOException{
		User.weight = 0;
		User.height = null;
		User.gender = "male";
		User.calories = 0;
		User.lean = false;
		User.buff = false;
		User.workoutSchedule = new UserWorkOutSchedule[7];
		int i;
		for(i = 0; i < 7; ++i) {
			User.days[i] = 0;
		}
		mainPane = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	//generates the schedule depending on what user entered and picked
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		mondayText.clear();
		tuesdayText.clear();
		wednesdayText.clear();
		thursdayText.clear();
		fridayText.clear();
		saturdayText.clear();
		sundayText.clear();
		GetSchedule.get_schedule(mondayText, tuesdayText, wednesdayText, thursdayText, fridayText, saturdayText, sundayText);
	}
}
