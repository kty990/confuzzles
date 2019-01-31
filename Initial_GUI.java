package gui; //CUSTOMIZATION MANDATORY FOR PROPER WORKING (ish)

//THIS is a package client. You NEED both classes inside this package for it to work. If you do not have Results_GUI, then you need the code from Results_GUI and have to work it into this class

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Initial_GUI { //gives questions (source not included, keylistener included (currently not working), actionlistener included)
	
	private static String input;
	private static String author = "Ty Kutcher";
	private static String version = "v0.5.1";
	
	static JFrame frame;
	static JTextField textField;
	static JLabel L1;
	
	public static int i = 0;
	
	public static void main(String args[]) {
		
		
		
		frame = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		panel.setLayout(null);
		
		L1 = new JLabel("This is going to be replaced"); //max chars is 45
		L1.setForeground(Color.WHITE);
		L1.setSize(1000, 20);
		L1.setLocation(50, 10);
		
		JLabel L2 = new JLabel("Author: " + author);
		L2.setForeground(Color.GRAY);
		L2.setLocation(280, 100);
		L2.setSize(200, 20);
		
		JLabel L3 = new JLabel(version);
		L3.setForeground(Color.GRAY);
		L3.setLocation(5, 100);
		L3.setSize(200, 20);
		
		JButton B1 = new JButton("Submit");
		B1.setSize(75, 25);
		B1.setLocation(260, 45);
		//add action listener
		
		B1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  getReply(); //part of example
				  L1.setText(input); //example end.
				  i += 1;
				  if(i == 5) { //change 5 to your_list_of_questions.size()
					  Results_GUI gui = new Results_GUI();
					  frame.setVisible(false);
				  }
				  
				  //This is where to put the method(s) that will be called when the button is pressed
				  //I advise to put a KeyListener in this class as well that listens for "enter" as another way to submit the answer
			  } 
			} );
		
		
		
		textField = new JTextField(); //make show
		textField.setSize(200, 25); //size confirmed
		textField.setLocation(60, 45);
		textField.setVisible(true);
		
		
		panel.add(L1);
		panel.add(textField);
		panel.add(L2);
		panel.add(L3);
		panel.add(B1);
		panel.setVisible(true);
		
		frame.setVisible(true);
		frame.setSize(new Dimension(400, 150));
		frame.setResizable(false);
		frame.setTitle("Quiz Generator (Alpha)");
		
		frame.getContentPane().add(panel);
		panel.setFocusable(true);
		System.out.println(panel.isFocusable() + "panel");
		System.out.println(frame.isFocusable() + "frame");
		System.out.println(textField.getLocationOnScreen());
	}
	
	private boolean pressed = false;
	public void keyPressed(KeyEvent e) { //this needs to work to move on

	    int key = e.getKeyCode();

	    if (key == KeyEvent.VK_ENTER && pressed == false) {
	        //enter the same code here as you have in your "actionPerformed" method
	    	getReply();
	    	L1.setText(input);
	    	pressed = true;
	    }
	}
	
	public void keyReleased(KeyEvent e) {

	    int key = e.getKeyCode();

	    if (key == KeyEvent.VK_ENTER) {
	        pressed = false;
	    }
	}
	
	private static void getReply() {
		input = textField.getText();
		textField.setText(null); //working
	}
	
}
