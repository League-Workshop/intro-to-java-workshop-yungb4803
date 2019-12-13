package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Bob=new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		Bob.setSpeed(100);

		// 5. Set the pen width to 5
		Bob.setPenWidth(5);

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			
		

			// 7. Set the pen color to random
			Bob.setRandomPenColor();
	
			// 1. Call the drawSquare() method
			drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
			Bob.turn(90);
	}

	}

	
	void drawSquare() {
		/* 3. Fill in the code to draw a square inside the method below. */
		Bob.penDown();
		int sides=4;
		for (int i = 0; i < sides ; i++) {
		Bob.move(50);
		Bob.turn(360/sides);
		Bob.hide();
		}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



