package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import application.User;
import application.WorkOut;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ToggleButton;

public class MainModel {
	
	static User currUser = new User();
	public static ArrayList<WorkOut> muscleWorkouts = new ArrayList<WorkOut>();
	public static ArrayList<WorkOut> cardioWorkouts = new ArrayList<WorkOut>();
	
	
	public static ArrayList<WorkOut>  getMuscleWorkouts() {
		return muscleWorkouts;
	}
	
	public static ArrayList<WorkOut>  getCardioWorkouts() {
		return cardioWorkouts;
	}
	
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
		
		User.gender = type;
	}
	
	private static boolean is_numeric(String str) {
		  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
	private static boolean vald_height(String str) {
		  return str.matches("^\\d\\'\\d+");  //match a number with optional '-' and decimal.
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
		
		User.weight = iWeight;
		User.height = height;
		
		return true;
		
	}
	
		
	public static void init_main_data() throws IOException {
        String csvFile1 = "src/buildmuscle.csv";
        String csvFile2 = "src/cardio.csv";
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        String line = "";
        String cvsSplitBy = ",";
        WorkOut workout = new WorkOut();
        
        br1 = new BufferedReader(new FileReader(csvFile1));
        while ((line = br1.readLine()) != null) {
		        String[] values = line.split(",");
		        workout.workout(values[0], values[1], values[2]);
		        muscleWorkouts.add(workout);
		}
        
        br1.close();
        
        br2 = new BufferedReader(new FileReader(csvFile2));
        while ((line = br2.readLine()) != null) {
		        String[] values = line.split(",");
		        workout.workout(values[0], values[1], values[2]);
		        cardioWorkouts.add(workout);
		}
        
        br2.close();
	}
}
