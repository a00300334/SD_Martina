package wk5_gui;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
	
	public static void main(String args[]) {
		// Container - contains components
		JFrame window = new JFrame("Hello world");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create a panel
		JPanel panel = new JPanel();
		
		JButton button = new JButton("Button text");
		button.setPreferredSize(new Dimension(150,28));
		
		JLabel label = new JLabel("I am a Swing label");
		panel.add(label);
		panel.add(button);
		
		window.getContentPane().add(panel);
		window.pack();
		window.setSize(300,250);
		window.setVisible(true);
		
		
	}

	
}
