package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Model.MainModel;

import application.User;
import application.UserWorkOutSchedule;
import application.WorkOut;

public class ProccesingData {

	@SuppressWarnings("static-access")
	public static void make_user_schedule() {

		UserWorkOutSchedule sched = new UserWorkOutSchedule();
		
		ArrayList<WorkOut> muscleArray = MainModel.getMuscleWorkouts();
		ArrayList<WorkOut> cardioArray = MainModel.getCardioWorkouts();
		
        WorkOut blankWorkout = new WorkOut();
        blankWorkout.workout("None", "None", "None");
		Random rand = new Random(); 
		
		
		int muscleUpperBound = muscleArray.size();
		int cardioUpperBound = cardioArray.size();
		
		int height = Integer.parseInt(User.height.replaceAll("\\D+",""));
		
		int i;
		for(i = 0; i < 7; ++i) {
			if(User.days[i] == 1) {
				if(User.gender == "male" && User.buff == true && height < 70 && User.weight >= 120 && User.weight <= 150 ) {
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
					
				} 
				else if(User.gender == "male" && User.buff == true && height < 70 && User.weight > 150 && User.weight <= 200 ) {
					
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
					
				} else if(User.gender == "male" && User.buff == true && height > 70 && User.weight > 200 && User.weight <= 300 ) {
					
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
					
				} else if(User.gender == "male" && User.buff == true && height < 70 && User.weight > 300) {
					
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
				} else if(User.gender == "male" && User.lean == true && height < 70 && User.weight >= 120 && User.weight <= 150 ) {
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
					
				} else if(User.gender == "male" && User.lean == true && height < 70 && User.weight > 150 && User.weight <= 200 ) {
					
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
					
				} else if(User.gender == "male" && User.lean == true && height > 70 && User.weight > 200 && User.weight <= 300 ) {
					
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
					
				} else if(User.gender == "male" && User.lean == true && height < 70 && User.weight > 300) {
					
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
				} else if(User.gender == "female" && User.buff == true && height < 70 && User.weight >= 120 && User.weight <= 150 ) {
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
					
				} else if(User.gender == "female" && User.buff == true && height < 70 && User.weight > 150 && User.weight <= 200 ) {
					
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
					
				} else if(User.gender == "female" && User.buff == true && height > 70 && User.weight > 200 && User.weight <= 300 ) {
					
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
					
				} else if(User.gender == "female" && User.buff == true && height < 70 && User.weight > 300) {
					
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
				} else if(User.gender == "female" && User.lean == true && height < 70 && User.weight >= 120 && User.weight <= 150 ) {
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
					
				} else if(User.gender == "female" && User.lean == true && height < 70 && User.weight > 150 && User.weight <= 200 ) {
					
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
					
				} else if(User.gender == "female" && User.lean == true && height > 70 && User.weight > 200 && User.weight <= 300 ) {
					
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
					
				} else if(User.gender == "female" && User.lean == true && height < 70 && User.weight > 300) {
					
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
				} else if(User.gender == "other" && User.lean == true) {
					// other
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
				
				} else if(User.gender == "other" && User.buff == true) {
						
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
				
				} else {
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
				}
			} else {
				User.workoutSchedule[i].dayWorkouts[0] = blankWorkout;
				User.workoutSchedule[i].dayWorkouts[1] = blankWorkout;
				User.workoutSchedule[i].dayWorkouts[2] = blankWorkout; 
				User.workoutSchedule[i].dayWorkouts[3] = blankWorkout;
				User.workoutSchedule[i].dayWorkouts[4] = blankWorkout;	
			}
			
			System.out.println(User.workoutSchedule[i].dayWorkouts[0].name + " " + User.workoutSchedule[i].dayWorkouts[0].sets + " " + User.workoutSchedule[i].dayWorkouts[0].reps );
			System.out.println(User.workoutSchedule[i].dayWorkouts[1].name + " " + User.workoutSchedule[i].dayWorkouts[1].sets + " " + User.workoutSchedule[i].dayWorkouts[1].reps );
			System.out.println(User.workoutSchedule[i].dayWorkouts[2].name + " " + User.workoutSchedule[i].dayWorkouts[2].sets + " " + User.workoutSchedule[i].dayWorkouts[2].reps );
			System.out.println(User.workoutSchedule[i].dayWorkouts[3].name + " " + User.workoutSchedule[i].dayWorkouts[3].sets + " " + User.workoutSchedule[i].dayWorkouts[3].reps );
			System.out.println(User.workoutSchedule[i].dayWorkouts[4].name + " " + User.workoutSchedule[i].dayWorkouts[4].sets + " " + User.workoutSchedule[i].dayWorkouts[4].reps );
		
			System.out.println();
		}
	}
}
