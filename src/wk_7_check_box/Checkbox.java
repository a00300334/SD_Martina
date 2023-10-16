package wk_7_check_box;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Checkbox extends JFrame implements ActionListener{
	private JCheckBox c = new JCheckBox("one", true);
	private JCheckBox c1 = new JCheckBox("two",false);
	
	JPanel p = new JPanel();
	
	public Checkbox() {
		super("hi");
	
		c.addActionListener(this);
		c1.addActionListener(this);
		
		p.add(c);
		p.add(c1);
		this.getContentPane().add(p);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		Checkbox a = new Checkbox();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(c)) {
			if(c.isSelected()) {
				c1.setSelected(false);
			}else {
				p.setBackground(Color.green);
			}
		}
	}
	
}
