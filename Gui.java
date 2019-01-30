package gui;

import javax.swing.*;
import java.awt.*;

public class Gui {
	
	public static void main(String args[]) {
		
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		JLabel L1 = new JLabel("Format the GUI properly"); //finish
		L1.setForeground(Color.WHITE);
		
		JButton B1 = new JButton("Submit");
		B1.setSize(10, 10);
		
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(200, 25)); //size confirmed
		
		
		panel.add(L1);
		panel.add(textField);
		textField.setLocation(500, 200);
		
		
		
		panel.add(B1);
		panel.setVisible(true);
		
		frame.setVisible(true);
		frame.setSize(new Dimension(1000, 400));
		frame.setResizable(false);
		frame.setTitle("Quiz v0.1.5");
		
		
		
		
		frame.getContentPane().add(panel);
		System.out.println(textField.getLocationOnScreen());
	}
	
}
