package Model;

import java.util.ArrayList;
import java.util.Random;

import application.User;
import application.WorkOut;
import javafx.scene.control.TextArea;
/**
* Generates workout program for user
* 
*
* @author  Andrew Constancio
* @version 1.0
* @since   2020-11-29 
*/
public class GetSchedule {
	
	@SuppressWarnings("static-access")
	public static void get_schedule(TextArea monday, TextArea tuesday, TextArea wednesday, TextArea thursday, TextArea friday, TextArea saturday, TextArea sunday) {
		
		ArrayList<WorkOut> muscleArray = MainModel.getMuscleWorkouts();
		ArrayList<WorkOut> cardioArray = MainModel.getCardioWorkouts();
		
        WorkOut blankWorkout = new WorkOut();
        blankWorkout.workout("None", "None", "None");
		Random rand = new Random(); 
		
		
		int muscleUpperBound = muscleArray.size();
		int cardioUpperBound = cardioArray.size();
		
		int height = Integer.parseInt(User.height.replaceAll("\\D+",""));
		
			
		if(User.lean == null) {
			User.lean = false;
		}
		
		
		if(User.buff == null) {
			User.buff = false;
		}
		
		
		int i;
		for(i = 0; i < 7; ++i) {
			if(User.days[i] == 1) {
				if(User.gender == "male" && User.buff == true && height < 70 && User.weight >= 120 && User.weight <= 150 && User.calories <= 2000 ) {
					//males buff
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = muscleArray.get(int_random3);
					int int_random4 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = muscleArray.get(int_random4);	
					
				} else if(User.gender == "male" && User.buff == true && height < 70 && User.weight > 150 && User.weight <= 200 && User.calories <= 2000  ) {
					
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = muscleArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);	
					
				} else if(User.gender == "male" && User.buff == true && height > 70 && User.weight > 200 && User.weight <= 300 && User.calories <= 2000  ) {
					
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);	
					
				} else if(User.gender == "male" && User.buff == true && height < 70 && User.weight > 300 && User.calories >= 2000 ) {
					
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = cardioArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);	
				} else if(User.gender == "male" && User.lean == true && height < 70 && User.weight >= 120 && User.weight <= 150  && User.calories <= 2000 ) {
					//males lean
					System.out.println("it got here");
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = cardioArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);	
					
				} else if(User.gender == "male" && User.lean == true && height < 70 && User.weight > 150 && User.weight <= 200  && User.calories <= 2000 ) {
					
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = cardioArray.get(int_random1);
					int int_random2 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = cardioArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);		
					
				} else if(User.gender == "male" && User.lean == true && height > 70 && User.weight > 200 && User.weight <= 300 && User.calories >= 2000 ) {
					
					int int_random = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = cardioArray.get(int_random);
					int int_random1 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = cardioArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = cardioArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);	
					
				} else if(User.gender == "male" && User.lean == true && height < 70 && User.weight > 300 && User.calories >= 2000 && User.calories >= 2000 ) {
					
					int int_random = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = cardioArray.get(int_random);
					int int_random1 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = cardioArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = cardioArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);
				} else if(User.gender == "female" && User.buff == true && height < 70 && User.weight >= 120 && User.weight <= 150 && User.calories <= 2000 ) {
					// female buff
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = muscleArray.get(int_random3);
					int int_random4 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = muscleArray.get(int_random4);	
					
				} else if(User.gender == "female" && User.buff == true && height < 70 && User.weight > 150 && User.weight <= 200 && User.calories <= 2000 ) {
					
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = muscleArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);	
					
				} else if(User.gender == "female" && User.buff == true && height > 70 && User.weight > 200 && User.weight <= 300 && User.calories <= 2000  ) {
					
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);	
					
				} else if(User.gender == "female" && User.buff == true && height < 70 && User.weight > 300 && User.calories >= 2000 ) {
					
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = cardioArray.get(int_random2);
					int int_random3 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = muscleArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);	
				} else if(User.gender == "female" && User.lean == true && height < 70 && User.weight >= 120 && User.weight <= 150 && User.calories >= 2000 ) {
					//males lean
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = cardioArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);	
					
				} else if(User.gender == "female" && User.lean == true && height < 70 && User.weight > 150 && User.weight <= 200 && User.calories >= 2000 ) {
					
					int int_random = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = cardioArray.get(int_random1);
					int int_random2 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = cardioArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);		
					
				} else if(User.gender == "female" && User.lean == true && height > 70 && User.weight > 200 && User.weight <= 300 && User.calories >= 2000 ) {
					
					int int_random = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = cardioArray.get(int_random);
					int int_random1 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = cardioArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);	
					
				} else if(User.gender == "female" && User.lean == true && height < 70 && User.weight > 300) {
					
					int int_random = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = cardioArray.get(int_random);
					int int_random1 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = cardioArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);
				} else if(User.gender == "other" && User.lean == true) {
					// other
					int int_random = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = cardioArray.get(int_random);
					int int_random1 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = cardioArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);
				
				} else if(User.gender == "other" && User.buff == true) {
						
					int int_random = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = cardioArray.get(int_random);
					int int_random1 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = cardioArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);
				
				} else {
					int int_random = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[0] = cardioArray.get(int_random);
					int int_random1 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(muscleUpperBound); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[3] = cardioArray.get(int_random3);
					int int_random4 = rand.nextInt(cardioUpperBound); 
					User.workoutSchedule[i].dayWorkouts[4] = cardioArray.get(int_random4);
				}
				
			} else {
				User.workoutSchedule[i].dayWorkouts[0] = blankWorkout;
				User.workoutSchedule[i].dayWorkouts[1] = blankWorkout;
				User.workoutSchedule[i].dayWorkouts[2] = blankWorkout; 
				User.workoutSchedule[i].dayWorkouts[3] = blankWorkout;
				User.workoutSchedule[i].dayWorkouts[4] = blankWorkout;	
			}
			
			if(i == 0) {
				if(User.workoutSchedule[i].dayWorkouts[0].name != "None") {
					String workStr =
					"Name  | Sets  | Reps\n"
					+ "----------------------\n" +
					User.workoutSchedule[i].dayWorkouts[0].name + " | " + User.workoutSchedule[i].dayWorkouts[0].sets + " | " + User.workoutSchedule[i].dayWorkouts[0].reps + "\n" 
					+ User.workoutSchedule[i].dayWorkouts[1].name + " | " + User.workoutSchedule[i].dayWorkouts[1].sets + " | " + User.workoutSchedule[i].dayWorkouts[1].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[2].name + " | " + User.workoutSchedule[i].dayWorkouts[2].sets + " | " + User.workoutSchedule[i].dayWorkouts[2].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[3].name + " | " + User.workoutSchedule[i].dayWorkouts[3].sets + " | " + User.workoutSchedule[i].dayWorkouts[3].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[4].name + " | " + User.workoutSchedule[i].dayWorkouts[4].sets + " | " + User.workoutSchedule[i].dayWorkouts[4].reps + "\n";
					monday.setText(workStr);
					User.workoutSchedule[i].dayWorkouts[0] = null;
					User.workoutSchedule[i].dayWorkouts[1] = null;
					User.workoutSchedule[i].dayWorkouts[2] = null;
					User.workoutSchedule[i].dayWorkouts[3] = null;
					User.workoutSchedule[i].dayWorkouts[4] = null;
					
				}
			} else if(i == 1) {
				if(User.workoutSchedule[i].dayWorkouts[0].name != "None") {
					String workStr = 
					"Name  | Sets  | Reps\n"
					+ "----------------------\n" +
					User.workoutSchedule[i].dayWorkouts[0].name + " | " + User.workoutSchedule[i].dayWorkouts[0].sets + " | " + User.workoutSchedule[i].dayWorkouts[0].reps + "\n" 
					+ User.workoutSchedule[i].dayWorkouts[1].name + " | " + User.workoutSchedule[i].dayWorkouts[1].sets + " | " + User.workoutSchedule[i].dayWorkouts[1].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[2].name + " | " + User.workoutSchedule[i].dayWorkouts[2].sets + " | " + User.workoutSchedule[i].dayWorkouts[2].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[3].name + " | " + User.workoutSchedule[i].dayWorkouts[3].sets + " | " + User.workoutSchedule[i].dayWorkouts[3].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[4].name + " | " + User.workoutSchedule[i].dayWorkouts[4].sets + " | " + User.workoutSchedule[i].dayWorkouts[4].reps + "\n";
					tuesday.setText(workStr);
				}
			} else if(i == 2) {
				if(User.workoutSchedule[i].dayWorkouts[0].name != "None") {
					String workStr = 
					"Name  | Sets  | Reps\n"
					+ "----------------------\n" +
					User.workoutSchedule[i].dayWorkouts[0].name + " | " + User.workoutSchedule[i].dayWorkouts[0].sets + " | " + User.workoutSchedule[i].dayWorkouts[0].reps + "\n" 
					+ User.workoutSchedule[i].dayWorkouts[1].name + " | " + User.workoutSchedule[i].dayWorkouts[1].sets + " | " + User.workoutSchedule[i].dayWorkouts[1].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[2].name + " | " + User.workoutSchedule[i].dayWorkouts[2].sets + " | " + User.workoutSchedule[i].dayWorkouts[2].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[3].name + " | " + User.workoutSchedule[i].dayWorkouts[3].sets + " | " + User.workoutSchedule[i].dayWorkouts[3].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[4].name + " | " + User.workoutSchedule[i].dayWorkouts[4].sets + " | " + User.workoutSchedule[i].dayWorkouts[4].reps + "\n";
					wednesday.setText(workStr);
				}
			} else if(i == 3) {
				if(User.workoutSchedule[i].dayWorkouts[0].name != "None") {
					String workStr =
					"Name  | Sets  | Reps\n"
					+ "----------------------\n" +
					User.workoutSchedule[i].dayWorkouts[0].name + " | " + User.workoutSchedule[i].dayWorkouts[0].sets + " | " + User.workoutSchedule[i].dayWorkouts[0].reps + "\n" 
					+ User.workoutSchedule[i].dayWorkouts[1].name + " | " + User.workoutSchedule[i].dayWorkouts[1].sets + " | " + User.workoutSchedule[i].dayWorkouts[1].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[2].name + " | " + User.workoutSchedule[i].dayWorkouts[2].sets + " | " + User.workoutSchedule[i].dayWorkouts[2].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[3].name + " | " + User.workoutSchedule[i].dayWorkouts[3].sets + " | " + User.workoutSchedule[i].dayWorkouts[3].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[4].name + " | " + User.workoutSchedule[i].dayWorkouts[4].sets + " | " + User.workoutSchedule[i].dayWorkouts[4].reps + "\n";
					thursday.setText(workStr);
				}
			} else if(i == 4) {
				if(User.workoutSchedule[i].dayWorkouts[0].name != "None") {
					String workStr = 
					"Name  | Sets  | Reps\n"
					+ "----------------------\n" +
					User.workoutSchedule[i].dayWorkouts[0].name + " | " + User.workoutSchedule[i].dayWorkouts[0].sets + " | " + User.workoutSchedule[i].dayWorkouts[0].reps + "\n" 
					+ User.workoutSchedule[i].dayWorkouts[1].name + " | " + User.workoutSchedule[i].dayWorkouts[1].sets + " | " + User.workoutSchedule[i].dayWorkouts[1].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[2].name + " | " + User.workoutSchedule[i].dayWorkouts[2].sets + " | " + User.workoutSchedule[i].dayWorkouts[2].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[3].name + " | " + User.workoutSchedule[i].dayWorkouts[3].sets + " | " + User.workoutSchedule[i].dayWorkouts[3].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[4].name + " | " + User.workoutSchedule[i].dayWorkouts[4].sets + " | " + User.workoutSchedule[i].dayWorkouts[4].reps + "\n";
					friday.setText(workStr);
				}
			} else if(i == 5) {
				if(User.workoutSchedule[i].dayWorkouts[0].name != "None") {
					String workStr = 
					"Name  | Sets  | Reps\n" 
					+ "----------------------\n" +
					User.workoutSchedule[i].dayWorkouts[0].name + " | " + User.workoutSchedule[i].dayWorkouts[0].sets + " | " + User.workoutSchedule[i].dayWorkouts[0].reps + "\n" 
					+ User.workoutSchedule[i].dayWorkouts[1].name + " | " + User.workoutSchedule[i].dayWorkouts[1].sets + " | " + User.workoutSchedule[i].dayWorkouts[1].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[2].name + " | " + User.workoutSchedule[i].dayWorkouts[2].sets + " | " + User.workoutSchedule[i].dayWorkouts[2].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[3].name + " | " + User.workoutSchedule[i].dayWorkouts[3].sets + " | " + User.workoutSchedule[i].dayWorkouts[3].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[4].name + " | " + User.workoutSchedule[i].dayWorkouts[4].sets + " | " + User.workoutSchedule[i].dayWorkouts[4].reps + "\n";
					saturday.setText(workStr);
				}
			} else if(i == 6) {
				if(User.workoutSchedule[i].dayWorkouts[0].name != "None") {
					String workStr = 
					"Name  | Sets  | Reps\n" 
					+ "----------------------\n" +
					User.workoutSchedule[i].dayWorkouts[0].name + " | " + User.workoutSchedule[i].dayWorkouts[0].sets + " | " + User.workoutSchedule[i].dayWorkouts[0].reps + "\n" 
					+ User.workoutSchedule[i].dayWorkouts[1].name + " | " + User.workoutSchedule[i].dayWorkouts[1].sets + " | " + User.workoutSchedule[i].dayWorkouts[1].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[2].name + " | " + User.workoutSchedule[i].dayWorkouts[2].sets + " | " + User.workoutSchedule[i].dayWorkouts[2].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[3].name + " | " + User.workoutSchedule[i].dayWorkouts[3].sets + " | " + User.workoutSchedule[i].dayWorkouts[3].reps + "\n"
					+ User.workoutSchedule[i].dayWorkouts[4].name + " | " + User.workoutSchedule[i].dayWorkouts[4].sets + " | " + User.workoutSchedule[i].dayWorkouts[4].reps + "\n";
					sunday.setText(workStr);
				}
			}
			
		}

	}

}
