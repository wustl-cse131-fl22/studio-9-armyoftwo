package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	
	
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Map <String, Integer> NtH=new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		NtH.put("Aidian",77);
		NtH.put("Tyrus",74);
		boolean Stop=false;
		while (Stop==false){
			System.out.println("Please Enter A Name of the Group");
			String Key=in.next();
		if(NtH.containsKey(Key)) {
			System.out.println(NtH.get(Key));
		}
		else if (Key.equals("quit")||Key.equals("Quit")) {
		Stop=true;	
		}
		else {
			System.out.println("Sorry, "+Key+" is not a member of the group or their name is not capitalized.");
		}
			
		

	}
	}
}
