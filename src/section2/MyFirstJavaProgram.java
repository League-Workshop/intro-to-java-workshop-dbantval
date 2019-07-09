package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot tIEreIbleSTUFF = new Robot();
	tIEreIbleSTUFF.penDown();
	tIEreIbleSTUFF.setSpeed(99);	
	tIEreIbleSTUFF.move(150);
	tIEreIbleSTUFF.turn(90);
	tIEreIbleSTUFF.move(150);
	tIEreIbleSTUFF.turn(90);
	tIEreIbleSTUFF.move(150);
	tIEreIbleSTUFF.turn(90);
	tIEreIbleSTUFF.move(150);
	for(int i = 0; i<4; i++) {
		tIEreIbleSTUFF.move(150);
		tIEreIbleSTUFF.turn(90);
	}
	}
}
