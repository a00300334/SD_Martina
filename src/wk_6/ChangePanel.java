package wk_6;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;

public class ChangePanel {
	
	JFrame window = new JFrame("Aaaaa aaa");
	JPanel panel = new JPanel();
	
	JButton btn = new JButton("bnt11");
	JButton btn_1 = new JButton("btn22");
	JButton btn_2 = new JButton("Btn33");
	JLabel label = new JLabel("label");
	
	public ChangePanel() {
		btn.setPreferredSize(new Dimension(300,30));
		btn_1.setPreferredSize(new Dimension(300,30));
		btn_2.setPreferredSize(new Dimension(300,30));
	
		btn.addActionListener((e) -> {
			label.setText("btn");
			btn.setBackground(Color.RED);
		});
		
		btn_1.addActionListener((e) ->{
			label.setText("btn22");
			btn_1.setBackground(Color.GREEN);
		});
		
		btn_2.addActionListener((e) ->{
			label.setText("btn33");
			btn_2.setBackground(Color.BLUE);
		});
	
		
		panel.add(btn);
		panel.add(btn_1);
		panel.add(btn_2);
		panel.add(label);
		
		window.getContentPane().add(panel);
		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

