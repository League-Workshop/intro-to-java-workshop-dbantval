package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer = JOptionPane.showInputDialog("what is the volume of a rectangle with the width of 6,hight of 16 and depth of 17");

		// 3. Use an if statement to check if their answer is correct
		if (answer.equals("1632")) {
			// 4. if the user's answer was correct, add one to their score
			score++;
		}

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String answer2 = JOptionPane.showInputDialog("what is the area of a rectangle with a width of 75 and a length of 37");

		if (answer2.equals("2775")) {
			score++;
			// 6. After all the questions have been asked, print the user's score
		}
		
	
String answer3 = JOptionPane.showInputDialog("what is 675 x (1670/5) -986 + 6482 x 974 / 746 / 2");

if (answer3.equals("228695.546917")) {
	score = score+3;
	
	
}
	JOptionPane.showMessageDialog(null, "your score is " + score);
}
}
