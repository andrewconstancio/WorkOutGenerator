package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class List {
	//creating the arraylists
	public static ArrayList<String> names = new ArrayList<String>(); //names of items
    public static ArrayList<String> qty = new ArrayList<String>(); //quantity of the items
    public static ArrayList<String> saveName = new ArrayList<String>();
    
	//this function read from the file and save the read line to the "line"
	public static void readFile() throws IOException {
		FileInputStream input = new FileInputStream("inventory.txt");
        BufferedReader buffered = new BufferedReader(new InputStreamReader(input));  
        String line = buffered.readLine();
        while(line != null) {
        	String temp[] = line.split(", ");
            names.add(temp[0]);
            qty.add(temp[1]);
            line = buffered.readLine();
        }
        buffered.close();
	}
	
	//this function saves to the list
	public static void Save() throws FileNotFoundException {
		//save to input file	
		@SuppressWarnings("resource")
		PrintStream data = new PrintStream("inventory.txt");
        int arraySize = names.size();
        for(int x=0; x< arraySize; x++) {
            data.println(names.get(x) +", "+ qty.get(x));
        }     
	}
	
	//Add to arraylist
	public static int addToList(String itemName, int itemAmount) {
		int temp;
		int count=0;
		for(int x=0; x<names.size(); x++){
			if(names.get(x).equals(itemName)){
				temp = Integer.parseInt(qty.get(x));
				temp += itemAmount;
				qty.set(x, Integer.toString(temp));
			}
			else
				count++;
		}
		if(count == names.size()) {
			return 1;
		}

		return 0;
		
	}
	
	//this function subtracts qty from the total number of the item
	public static int subFromList(String itemName, int itemAmount) {
		int temp;
		int count=0;
		for(int x=0; x<names.size(); x++){
			if(names.get(x).equals(itemName)){
				temp = Integer.parseInt(qty.get(x));
				temp -= itemAmount;
				qty.set(x, Integer.toString(temp));                        
			}
			else count++;
		}
		if(count == names.size()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	//this fuction is searching for the item if not found return error
	public static String searchList(String item){
		String found;
		for(int x=0; x<names.size(); x++){
			if(names.get(x).equals(item)){
				found = names.get(x) + ", " + qty.get(x);
				return found;
			}
		}
		return "Error";
	}
}