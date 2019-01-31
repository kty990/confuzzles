package gui; //CUSTOMIZATION MANDATORY FOR PROPER WORKING (ish)

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Results_GUI { //Source not included, Maximum number of questions per quiz: 15 (QUESTIONS CAN HAVE MAX CHARS OF 45)
	
	//source will come from the questions and/or answers from Initial.GUI
	
	/**
	 * Information:
	 * 		In the "NEW" section, replace "author" with the results for the question (4 being question 1, and 19 being question 15) 
	 */
	
	public static String author = "Ty Kutcher";
	public static String version = "v0.5.1";
	
	static JFrame frame;
	public JPanel panel; //took static out for test
	public static JLabel L1;
	
	
	
	public Results_GUI() {
		
		frame = new JFrame();
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		panel.setLayout(null);
		
		L1 = new JLabel("RESULTS"); //keep
		L1.setForeground(Color.WHITE);
		L1.setSize(1000, 20);
		L1.setLocation(245, 10);
		
		JLabel L2 = new JLabel("Author: " + author); //keep
		L2.setForeground(Color.GRAY);
		L2.setLocation(380, 950);
		L2.setSize(200, 20);
		
		JLabel L3 = new JLabel(version); //keep
		L3.setForeground(Color.GRAY);
		L3.setLocation(5, 950);
		L3.setSize(200, 20);
		
		
		/**              NEW STARTS HERE                      **/ /**              NEW STARTS HERE                      **/	/**              NEW STARTS HERE                      **/
		
		
		JLabel L4 = new JLabel(author); //NEW
		L4.setForeground(Color.WHITE);
		L4.setLocation(5, 40);
		L4.setSize(2000, 20);
		
		JLabel L5 = new JLabel(author); //NEW
		L5.setForeground(Color.WHITE);
		L5.setLocation(5, 103);
		L5.setSize(2000, 20);
		
		JLabel L6 = new JLabel(author); //NEW
		L6.setForeground(Color.WHITE);
		L6.setLocation(5, 166);  //completed
		L6.setSize(2000, 20);
		
		JLabel L7 = new JLabel(author); //NEW
		L7.setForeground(Color.WHITE);
		L7.setLocation(5, 229);
		L7.setSize(2000, 20);
		
		JLabel L8 = new JLabel(author); //NEW
		L8.setForeground(Color.WHITE);
		L8.setLocation(5, 292); 
		L8.setSize(2000, 20);
		
		JLabel L9 = new JLabel(author); //NEW
		L9.setForeground(Color.WHITE);
		L9.setLocation(5, 355);
		L9.setSize(2000, 20);
		
		JLabel L10 = new JLabel(author); //NEW
		L10.setForeground(Color.WHITE);
		L10.setLocation(5, 418); //completed
		L10.setSize(2000, 20);
		
		JLabel L11 = new JLabel(author); //NEW
		L11.setForeground(Color.WHITE);
		L11.setLocation(5, 481);
		L11.setSize(2000, 20);
		
		JLabel L12 = new JLabel(author); //NEW
		L12.setForeground(Color.WHITE);
		L12.setLocation(5, 544);
		L12.setSize(20000, 20);
		
		JLabel L13 = new JLabel(author); //NEW
		L13.setForeground(Color.WHITE);
		L13.setLocation(5, 607);
		L13.setSize(2000, 20);
		
		JLabel L14 = new JLabel(author); //NEW
		L14.setForeground(Color.WHITE);
		L14.setLocation(5, 670);
		L14.setSize(2000, 20);
		
		JLabel L15 = new JLabel(author); //NEW
		L15.setForeground(Color.WHITE);
		L15.setLocation(5, 733);
		L15.setSize(2000, 20);

		JLabel L16 = new JLabel(author); //NEW
		L16.setForeground(Color.WHITE);
		L16.setLocation(5, 796);
		L16.setSize(2000, 20);

		JLabel L17 = new JLabel(author); //NEW
		L17.setForeground(Color.WHITE);
		L17.setLocation(5, 859);
		L17.setSize(2000, 20);

		JLabel L18 = new JLabel(author); //NEW
		L18.setForeground(Color.WHITE);
		L18.setLocation(5, 922);
		L18.setSize(2000, 20);

		JLabel L19 = new JLabel(author); //NEW
		L19.setForeground(Color.WHITE);
		L19.setLocation(5, 980);
		L19.setSize(2000, 20);
		
		/**              NEW ENDS HERE                      **/ /**              NEW ENDS HERE                      **/ /**              NEW ENDS HERE                      **/
		
		panel.add(L1); //keep
		panel.add(L2); //keep
		panel.add(L3); //keep
		panel.add(L4); //keep
		panel.add(L5); //keep
		panel.add(L6); //keep
		panel.add(L7); //keep
		panel.add(L8); //keep
		panel.add(L9); //keep
		panel.add(L10); //keep
		panel.add(L11); //keep
		panel.add(L12); //keep
		panel.add(L13); //keep
		panel.add(L14); //keep
		panel.add(L15); //keep
		panel.add(L16); //keep
		panel.add(L17); //keep
		panel.add(L18); //keep
		panel.add(L19); //keep
		
		panel.setVisible(true); //keep
		
		frame.setVisible(true); //keep
		frame.setSize(new Dimension(500, 1000)); //keep
		frame.setResizable(false); //keep
		frame.setTitle("Quiz Generator (Alpha)"); //keep
		
		frame.getContentPane().add(panel);} //keep
	
	
	@SuppressWarnings("unused")
	private static void showResultsCalled() { //keep
		//show results
		//fix by changing what panel is displayed + changing the size of the JFrame
	}
		
	}
	

