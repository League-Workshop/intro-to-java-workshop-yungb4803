package section4;

import javax.swing.JOptionPane;

import section3.SpeakAndSpell;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;

		// 2. Ask the user a question
		String answer = JOptionPane.showInputDialog("What is the fitness gram pacer test?");

		// 3. Use an if statement to check if their answer is correct
		if (answer.equals(
				"The FitnessGram Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues. The 20 meter pacer test will begin in 30 seconds. Line up at the start. The running speed starts slowly but gets faster each minute after you hear this signal bodeboop")) {
			JOptionPane.showMessageDialog(null, "correct");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null,
					"The FitnessGram Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues. The 20 meter pacer test will begin in 30 seconds. Line up at the start. The running speed starts slowly but gets faster each minute after you hear this signal bodeboop.");
		}

		// 4. if the user's answer was correct, add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String Bob = JOptionPane.showInputDialog("What is 9+10?");
		if (Bob.equals("21")) {
			JOptionPane.showMessageDialog(null, "correct");
			score +=1;
			
			
		}
		else {
		JOptionPane.showMessageDialog(null, 21);	
		
		}

		// 6. After all the questions have been asked, print the user's score

	}
}
