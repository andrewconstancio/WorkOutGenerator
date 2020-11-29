package Model;

import java.util.Arrays;
import Model.MainModel;

import application.User;

public class ProccesingData {

	public static void make_user_schedule() {
<<<<<<< HEAD
=======
		
		
		UserWorkOutSchedule sched = new UserWorkOutSchedule();
		
		ArrayList<WorkOut> muscleArray = MainModel.getMuscleWorkouts();
		ArrayList<WorkOut> cardioArray = MainModel.getCardioWorkouts();
		
		WorkOut test = muscleArray.get(1);
		
		System.out.println(test.name);
		
>>>>>>> bf2fdd38114a77817601b2c1559aacfd195026f8
		int i;
		for(i = 0; i < 7; ++i) {
			if(User.days[i] == 1) {
				if(User.gender == "male") {
<<<<<<< HEAD
					
				}
				else if(User.gender == "female") {
					
				}
				else {
					
				}
			}
			else {
				
=======
					sched.mondayWorkouts[0] = (WorkOut) muscleArray.get(3);
				}
>>>>>>> bf2fdd38114a77817601b2c1559aacfd195026f8
			}
		}
	}
	
}
