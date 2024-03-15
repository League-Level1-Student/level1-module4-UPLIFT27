package _03_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{

	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
	
	int characters;

	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
	
		frame.addKeyListener(this);
		
		
		currentLetter = generateRandomLetter();
		label.setText(currentLetter+"");
	
		
		frame.add(panel);
		panel.add(label);
		
		frame.pack();
	
	}
		
		
		
		
		
		char generateRandomLetter() {
		    Random r = new Random();
		    return (char) (r.nextInt(26) + 'a');
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


                                                


		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}





		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
			char keyPressed = e.getKeyChar();
			if(keyPressed == currentLetter )
			{
				
				
				
				panel.setBackground(Color.GREEN);
				JOptionPane.showMessageDialog(null, "correct");
				
		
				
				
			}
			else
			{
				
				
				panel.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, "incorrect");
			} 
				
			panel.setBackground(null);
			currentLetter = generateRandomLetter();
				label.setText(currentLetter+"");
				characters++;
			if(characters%5==0)
			{
				showTypingSpeed(characters);
			}
			
		}





		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		} 
		
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	

