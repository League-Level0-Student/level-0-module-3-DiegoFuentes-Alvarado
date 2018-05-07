
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		int birthday = JOptionPane.showOptionDialog(null, "Who's birthday?", "Tittle", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Mom", "Dad", "Me" }, null);
		System.out.println();
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birthday == 0){
			System.out.println("Mom " + momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if(birthday == 1){
			
			System.out.println("Dad " + dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		if(birthday == 2){
			System.out.println("Me " + myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
