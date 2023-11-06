package wk7;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample extends JFrame {
	JButton btn1 = new JButton("Button1");
	JButton btn2= new JButton("B2");
	JButton btn3 = new JButton("B");
	JButton btn4 = new JButton("Butto66565n4");
	JButton btn5 = new JButton("Bd");
	
	public GridLayoutExample(){
		
		this.getContentPane().setLayout(new GridLayout(2,3));;;;;;;;;;;;;;;
		this.getContentPane().add(btn1);
		
		this.getContentPane().add(btn2);
	
		this.getContentPane().add(btn3);
	
		this.getContentPane().add(btn4);
		
		this.getContentPane().add(btn5);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayoutExample a = new GridLayoutExample();
		
			
	}

}
