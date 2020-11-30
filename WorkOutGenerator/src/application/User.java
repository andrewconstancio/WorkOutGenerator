package application;
//keeps all the values and save it in here until the program restarts
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
