package application;
/**
* Saves workout object fields such as name, reps, ands sets
* 
*
* @author  Andrew Constancio
* @version 1.0
* @since   2020-11-29 
*/
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
