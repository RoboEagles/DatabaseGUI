package com.roboeagles.gui;

import java.awt.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame {
	
	private static final long serialVersionUID = 5589221398565370957L;

	private static Map<String,String> constantStrings  = new HashMap<String,String>();
	private int[] dimensions = {512, 212};
	
	// Fields
	
	private static JTextField usernameField;
	private static JPasswordField passwordField;
	private static JLabel usernameLabel,
							passwordLabel;
	private static JButton submitLoginButton;
	
	//	End Fields
	
	
	private static void setMap() {
		constantStrings.put("Title", "RoboEagles");
		constantStrings.put("USERNAME_FIELD", "Username: ");
		constantStrings.put("PASSWORD_FIELD", "Password: ");
		constantStrings.put("LOGIN_SUBMIT_LABEL", "Login");
		constantStrings.put("LOGIN_TITLE", "Login to View RoboEagles");
	}
	
	private void setupFrame(User user) {
		setLayout(new FlowLayout());

		if (!user.isLoggedIn()) {	
			//GUI
			JPanel GUI = new JPanel(new BorderLayout(3,3));
			GUI.setBorder(new EmptyBorder(5,5,5,5));
			setContentPane(GUI);
			
			//LABELS
			JPanel LABELS = new JPanel(new GridLayout(0,1));
			
			//CONTROLS
			JPanel CONTROLS = new JPanel(new GridLayout(0,1));
			
			GUI.add(LABELS, BorderLayout.WEST);
			GUI.add(CONTROLS, BorderLayout.CENTER);
			
			usernameLabel = new JLabel(constantStrings.get("USERNAME_FIELD"));
			passwordLabel = new JLabel(constantStrings.get("PASSWORD_FIELD"));
			
			usernameField = new JTextField(20);
			passwordField = new JPasswordField(20);
			
			submitLoginButton = new JButton(constantStrings.get("LOGIN_SUBMIT_LABEL"));
			
			LABELS.add(usernameLabel);
			LABELS.add(passwordLabel);
			
			CONTROLS.add(usernameField);
			CONTROLS.add(passwordField);
			
			GUI.add(submitLoginButton, BorderLayout.SOUTH);
			
		}
	}
	
	public int getWidth() {
		return dimensions[0];
	}
	
	public int getHeight() {
		return dimensions[1];
	}
	
	Frame(User user) {
		super("RoboEagles");
		setMap();
		setupFrame(user);
	}
}
