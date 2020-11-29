package Model;

import java.util.ArrayList;
import java.util.Arrays;
import Model.MainModel;

import application.User;
import application.UserWorkOutSchedule;
import application.WorkOut;

public class ProccesingData {

	public static void make_user_schedule() {
		
		
		UserWorkOutSchedule sched = new UserWorkOutSchedule();
		
		ArrayList<WorkOut> muscleArray = MainModel.getMuscleWorkouts();
		ArrayList<WorkOut> cardioArray = MainModel.getCardioWorkouts();
		
		WorkOut test = muscleArray.get(1);
		
		System.out.println(test.name);
		
		int i;
		for(i = 0; i < 7; ++i) {
			if(User.days[i] == 1) {
				if(User.gender == "male") {
					sched.mondayWorkouts[0] = (WorkOut) muscleArray.get(3);
				}
			}
		}
	}
	
}
