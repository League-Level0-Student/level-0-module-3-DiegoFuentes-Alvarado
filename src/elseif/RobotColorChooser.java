//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot R2D2 = new Robot();
		R2D2.setSpeed(1000);
		for (int i = 0; i < 1;) {
			// 3. Ask the user what color they would like the robot to draw
			int color = JOptionPane.showOptionDialog(null, "What color do you want?", "Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Red", "Blue", "Black" }, null);

			// 5. Use an if/else statement to set the pen color that the user
			// requested
			if (color == 0) {
				R2D2.setPenColor(Color.red);
			}
			if (color == 1) {
				R2D2.setPenColor(Color.blue);
			}

			// 6. If the user doesn’t enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user
			// for
			// more colors & drawing them

			// 4. Set the pen width to 10
			R2D2.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line
			// of
			// code)
			R2D2.penDown();
			for (int c = 0; c < 5; c++) {
				R2D2.move(25);
				R2D2.turn(360 / 5);
			}
		}
	}
}
