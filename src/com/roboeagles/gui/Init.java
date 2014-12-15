package com.roboeagles.gui;

import javax.swing.JFrame;



public class Init {
	

	public static void main(String[] args) {
		Frame frame = new Frame(new User());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
