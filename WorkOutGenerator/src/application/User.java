package application;
/**
* Stores values for User object
* 
*
* @author  Andrew Constancio
* @version 1.0
* @since   2020-11-29 
*/
public class User {
	
	public static int weight;
	public static String height;
	public static String gender;
	public static int[] days = new int[7];
	public static Boolean lean = false;
	public static Boolean buff = false;
	public static int calories;
	
	
	public static UserWorkOutSchedule[] workoutSchedule = new UserWorkOutSchedule[7];
	
}
