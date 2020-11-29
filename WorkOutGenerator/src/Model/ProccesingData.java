package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Model.MainModel;

import application.User;
import application.UserWorkOutSchedule;
import application.WorkOut;

public class ProccesingData {

	public static void make_user_schedule() {

		UserWorkOutSchedule sched = new UserWorkOutSchedule();
		
		ArrayList<WorkOut> muscleArray = MainModel.getMuscleWorkouts();
		ArrayList<WorkOut> cardioArray = MainModel.getCardioWorkouts();
		Random rand = new Random(); 
		int upperbound1 = muscleArray.size();
		int upperbound2 = cardioArray.size();
		
		int height = Integer.parseInt(User.height.replaceAll("\\D+",""));

		int i;
		for(i = 0; i < 7; ++i) {
			if(User.days[i] == 1) {
				if(User.gender == "male" && User.lean == true && height < 70) {
					int int_random = rand.nextInt(upperbound1); 
					User.workoutSchedule[i].dayWorkouts[0] = muscleArray.get(int_random);
					int int_random1 = rand.nextInt(upperbound1); 
					User.workoutSchedule[i].dayWorkouts[1] = muscleArray.get(int_random1);
					int int_random2 = rand.nextInt(upperbound1); 
					User.workoutSchedule[i].dayWorkouts[2] = muscleArray.get(int_random2);
					int int_random3 = rand.nextInt(upperbound1); 
					User.workoutSchedule[i].dayWorkouts[3] = muscleArray.get(int_random3);
					int int_random4 = rand.nextInt(upperbound1); 
					User.workoutSchedule[i].dayWorkouts[4] = muscleArray.get(int_random4);	
				}
			}
		}
	}
	
	
	
}
