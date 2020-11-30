package application;
//saves name reps and sets from the csv file that has information about the workout
public class WorkOut {
	public String name;
	public String reps;
	public String sets;
	

	public void workout(String name, String reps, String sets) {
		this.name = name;
		this.reps = reps;
		this.sets = sets;
	}
}
