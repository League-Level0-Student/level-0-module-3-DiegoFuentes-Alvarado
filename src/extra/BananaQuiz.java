//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog("Do you like bananas?");

		// 2. if they say no,
		if (banana.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Ya CraZy");

		}
		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		else if (banana.equalsIgnoreCase("yes")) {
			String hobby = JOptionPane.showInputDialog("What's your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");

		}
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"
		else{
			JOptionPane.showMessageDialog(null, "YOu'rE BaNanAs");

		}
		// 4. OPTIONAL: if they say something other than â€œyesâ€? or â€œnoâ€?
		// show a pop up that says â€œYou are bananas!â€?

	}

}
