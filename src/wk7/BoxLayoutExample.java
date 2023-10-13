package wk7;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutExample extends JFrame{

	JButton btn1 = new JButton("Button1");
	JButton btn2= new JButton("Button2");
	JButton btn3 = new JButton("Button3");
	JButton btn4 = new JButton("Button4");
	JButton btn5 = new JButton("Button 5 Long nammemd");
	

	public BoxLayoutExample() {
		super("Box layout Example..");
		
		// JFrame uses border layout by default
		// So we do not need to writhe this line
		 this.getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));   
		
		 btn1.setAlignmentY(Component.TOP_ALIGNMENT);
		this.getContentPane().add(btn1);
		btn2.setAlignmentY(Component.CENTER_ALIGNMENT);
		this.getContentPane().add(btn2);
		btn3.setAlignmentY(Component.RIGHT_ALIGNMENT);
		this.getContentPane().add(btn3);
		btn4.setAlignmentY(Component.CENTER_ALIGNMENT);
		this.getContentPane().add(btn4);
		btn5.setAlignmentY(Component.TOP_ALIGNMENT);
		this.getContentPane().add(btn5);
		
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	
	public static void main(String[] args) {
		BoxLayoutExample a = new BoxLayoutExample();
	}
}
