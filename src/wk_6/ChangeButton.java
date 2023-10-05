package wk_6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeButton implements ActionListener{
	JFrame window = new JFrame("Da ta da");
	JPanel panel = new JPanel();
	
	JButton btn = new JButton("bnt11");
	JButton btn_1 = new JButton("btn22");
	JButton btn_2 = new JButton("Btn33");
	
	public ChangeButton() {
		btn.setPreferredSize(new Dimension(300,30));
		btn_1.setPreferredSize(new Dimension(300,30));
		btn_2.setPreferredSize(new Dimension(300,30));
		
		btn.addActionListener(this);
		btn_1.addActionListener(this);
		btn_2.addActionListener(this);
		
		panel.add(btn);
		panel.add(btn_1);
		panel.add(btn_2);
		
		window.getContentPane().add(panel);
		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)) {
			btn.setBackground(Color.RED);
		}
		
		if(e.getSource().equals(btn_1)) {
			btn_1.setBackground(Color.GREEN);
		}
		
		if(e.getSource().equals(btn_2)) {
			btn_2.setBackground(Color.BLUE);
		}
	}
	

	
}

