package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import application.CurrentUser;
import application.WorkOut;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ToggleButton;

public class MainModel {
	
	static CurrentUser userNew = new CurrentUser();
	static ArrayList<WorkOut> muscleWorkouts = new ArrayList();
	
	public static void toggle_gender_buttons(ToggleButton M, ToggleButton F, ToggleButton O, String type) {
		if(type == "male") {
			M.getStyleClass().clear();
			M.getStyleClass().add("input-field-select");
			
			F.getStyleClass().clear();
			F.getStyleClass().add("input-field");
			
			O.getStyleClass().clear();
			O.getStyleClass().add("input-field");
		} else if(type == "female") {
			F.getStyleClass().clear();
			F.getStyleClass().add("input-field-select");

			M.getStyleClass().clear();
			M.getStyleClass().add("input-field");
			
			O.getStyleClass().clear();
			O.getStyleClass().add("input-field");
		} else if(type == "other") {
			O.getStyleClass().clear();
			O.getStyleClass().add("input-field-select");
			
			F.getStyleClass().clear();
			F.getStyleClass().add("input-field");
			
			M.getStyleClass().clear();
			M.getStyleClass().add("input-field");
		}
		
		CurrentUser.gender = type;
	}
	
	private static boolean is_numeric(String str) {
		  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
	private static boolean vald_height(String str) {
		  return str.matches("^\\d\\'\\d");  //match a number with optional '-' and decimal.
	}
	
	
	public static boolean validate_weight_height(String weight, String height) {
		boolean checkWeight = is_numeric(weight);
		boolean validHeight = vald_height(height);
		
		if (checkWeight == false) {
			Alert a = new Alert(AlertType.NONE);
			a.setAlertType(AlertType.ERROR);
			a.setContentText("Weight Field is not a number. ");
			a.show();
			return false;
		}

		if (validHeight == false) {
			Alert a = new Alert(AlertType.NONE);
			a.setAlertType(AlertType.ERROR);
			a.setContentText("Height Field is not valid. ");
			a.show();
			return false;
		}
		int iWeight = Integer.parseInt(weight);
		CurrentUser.weight = iWeight;
		
		return true;
		
	}
	
		
	public static void init_main_data() throws IOException {
        String csvFile = "src/buildmuscle.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        WorkOut workout = new WorkOut();
        
        br = new BufferedReader(new FileReader(csvFile));
        while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        workout.workout(values[0], values[1], values[2]);
		        muscleWorkouts.add(workout);
		}
	}
}
