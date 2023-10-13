package wk7;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample extends JFrame{

	JButton buttonNorth = new JButton("North");
	JButton buttonSouth= new JButton("south");
	JButton buttonEast = new JButton("east");
	JButton buttonWest = new JButton("west");
	JButton buttonCentre = new JButton("centre");
	

	public BorderLayoutExample() {
		super("Border layout Example..");
		
		// JFrame uses border layout by default
		// So we do not need to writhe this line
		// this.getContentPane().setLayout(new BorderLayout());   
		
		this.getContentPane().add(buttonNorth, BorderLayout.NORTH);
		this.getContentPane().add(buttonSouth, BorderLayout.SOUTH);
		this.getContentPane().add(buttonEast, BorderLayout.EAST);
		this.getContentPane().add(buttonWest, BorderLayout.WEST);
		this.getContentPane().add(buttonCentre, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	
	public static void main(String[] args) {
		BorderLayoutExample a = new BorderLayoutExample();
	}
}
