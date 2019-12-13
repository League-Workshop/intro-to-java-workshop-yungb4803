package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Bob=new Robot();
	Bob.setSpeed(100);
	Bob.penDown();
	int sides=10;
	for (int i = 0; i < sides ; i++) {
	Bob.move(50);
	Bob.turn(360/sides);
	Bob.hide();
	}
	}
}
