package wk_6;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyLabelButton extends JFrame{

	JPanel panel = new JPanel();
	JButton button = new JButton("Click me");
	
	public MyLabelButton() {
		super("The main window");
		
		button.setPreferredSize(new Dimension(300,200));
		
		panel.add(button);
		this.getContentPane().add(panel);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
