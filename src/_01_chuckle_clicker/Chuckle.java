package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle implements ActionListener {

	JFrame frame = new JFrame();
	JButton joke = new JButton();
	JPanel panel = new JPanel();
	JButton punchline = new JButton();
	
	
	
	public void makeButtons()
	{
	
		frame.add(panel);
		
		panel.add(joke);
		panel.add(punchline);
		

		
		
		joke.setText("joke");
		punchline.setText("punchline");
		
		frame.setVisible(true);
		
	joke.addActionListener(this);
	punchline.addActionListener(this);
	
	JOptionPane.showMessageDialog(null, "hi");
	
	
	frame.pack();

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	
	}
	
	static public void main(String[] args) {
		
		Chuckle chuckle = new Chuckle();
		
		chuckle.makeButtons();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == joke)
		{
			JOptionPane.showMessageDialog(null, "Why did the bicycle fall over");
		}
		
		if(e.getSource() == punchline)
		{
			
			JOptionPane.showMessageDialog(null, "Because it was two tired");
		}
		// TODO Auto-generated method stub
		
	}
	}
	
	
