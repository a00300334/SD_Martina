package wk5_gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonExample implements ActionListener{
	
	JFrame window = new JFrame("Hello world");
	JPanel panel = new JPanel();
	
	JButton button0 = new JButton("Button text0");
	JButton button1 = new JButton("Button text1");
	JButton button2 = new JButton("Button text2");
	JLabel label = new JLabel("I am a Swing label");
	
	public ButtonExample() {
		button0.setPreferredSize(new Dimension(300,30));
		button1.setPreferredSize(new Dimension(300,30));
		button2.setPreferredSize(new Dimension(300,30));
		
		panel.add(button0);
		panel.add(button1);
		panel.add(button2);
		panel.add(label);
		
		window.getContentPane().add(panel);
		
		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Button 0 pressed");
			}
		});
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button1)) {
			label.setText("Button 1 Pressed");
		}
		
		if(e.getSource().equals(button2)) {
			label.setText("Button 2 pressed");
		}
	}
}