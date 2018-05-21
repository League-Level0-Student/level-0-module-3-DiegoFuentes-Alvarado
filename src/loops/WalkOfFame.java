
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		// 1. Set the X position of the robot so that it starts on the left.
		int x = 100;
		int m = 30;
		// You also need to show the robot to see the result of this line.
		for (int i = 0; i < 1;) {
			rob.setX(x);
			// 2. Make the robot draw a star shape. Hint: 144.
			rob.setSpeed(100);
			rob.penDown();
			for (int c = 0; c < 5; c++) {
				rob.move(m);
				rob.turn(144);
			}
			x += 100 + m;
			m += 20;
			rob.setRandomPenColor();
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
