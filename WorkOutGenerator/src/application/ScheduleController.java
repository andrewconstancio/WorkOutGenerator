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
	
	@FXML
	public void Restart(ActionEvent event) throws IOException{
		mainPane = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		GetSchedule.get_schedule(mondayText, tuesdayText, wednesdayText, thursdayText, fridayText, saturdayText, sundayText);
	}
}
