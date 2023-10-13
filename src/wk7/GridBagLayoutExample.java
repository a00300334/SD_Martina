package wk7;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutExample extends JFrame {
	JButton btn1 = new JButton("Button1");
	JButton btn2= new JButton("B2");
	JButton btn3 = new JButton("B");
	JButton btn4 = new JButton("Butto66565n4");
	JButton btn5 = new JButton("Bd");
	
	public GridBagLayoutExample(){
		super();
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		getContentPane().setLayout(gridbag);
	
		c.fill = GridBagConstraints.VERTICAL;
		
		c.gridx = 0;
		c.gridy = 0;
		gridbag.setConstraints(btn1, c);
		this.getContentPane().add(btn1);
		
		
		c.gridx = 1;
		c.gridy = 1;
		gridbag.setConstraints(btn2, c);
		this.getContentPane().add(btn2);
	
		c.gridx = 2;
		c.gridy = 2;
		gridbag.setConstraints(btn2, c);
		this.getContentPane().add(btn3);
	
		c.gridx = 3;
		c.gridy = 3;
		gridbag.setConstraints(btn4, c);
		this.getContentPane().add(btn4);
		
		c.gridx = 4;
		c.gridy = 4;
		gridbag.setConstraints(btn5, c);
		this.getContentPane().add(btn5);
		
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridBagLayoutExample a = new GridBagLayoutExample();
			
	}

}
