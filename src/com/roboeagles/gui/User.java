package com.roboeagles.gui;

public class User {
	
	private boolean loggedIn;
	private String username;
	private String password;
	
	private static boolean checkUser(String username, String password) {
		return true;
	}
	
	private static boolean recheckUser(String username, String password) {
		return true;
	}
	
	public void setLoggedIn(String username, String password) {
		if (checkUser(username,password)) loggedIn = true; else loggedIn = false;
	}
	
	public boolean isLoggedIn() {
		return loggedIn;
	}
	
	User() {
		if (loggedIn) {
			recheckUser(username, password);
		}
	}
}
