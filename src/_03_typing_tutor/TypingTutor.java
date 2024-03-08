package _03_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {

	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;

	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
		
		
		
		
		char generateRandomLetter() {
		    Random r = new Random();
		    return (char) (r.nextInt(26) + 'a');
		}
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		panel.setBackground(Color.GREEN);
		
		
		
		void KeyReleased()
		
		{
			String val.equals(generateRandomLetter);
			
			if(keyPressed)
			{
				generateRandomLetter()
				
				label.setText(r);
			}
		}
		
		Date timeAtStart = new Date();
	     
		private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		    Date timeAtEnd = new Date();
		    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		    long gameInSeconds = (gameDuration / 1000) % 60;
		    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		    int charactersPerMinute = (int) (charactersPerSecond * 60);
		    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
		} 
		
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	

