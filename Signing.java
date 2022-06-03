package TrainReservationSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class Signing {
	Scanner sc = new Scanner(System.in);
	String name, userName, pwd1;
	LinkedList<User> users = new LinkedList<User>();
	AfterLogin aftlogin = new AfterLogin();
	
	public void newUser() {
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter UserName: ");
		userName = sc.next();
		System.out.println("Enter password: ");
		pwd1 = sc.next();
		pwd1 = encrypt(pwd1.toCharArray());
		users.add(new User(name, userName, pwd1));
		System.out.println("Successfully created...");
	}

	public String encrypt(char[] pwd12) {
		StringBuffer str = new StringBuffer();
		for (char c : pwd12) {
			str.append(++c);
		}
		return str.toString();
	}

	public void login() {
		System.out.println("Enter UserName: ");
		userName = sc.next();
		System.out.println("Enter Password: ");
		pwd1 = sc.next();
		pwd1 = encrypt(pwd1.toCharArray());
		if (pwd1.equals(getPassword(userName))) {
			System.out.println("Successfully logged in...");
			aftlogin.menu(userName);
		} else {
			System.out.println("Invalid input...");
		}
	}

	public String getPassword(String userName2) {
		String pwd = " ";
		for (User u : users) {
			if (u.getUserName().equals(userName2)) {
				pwd = u.getPwd();
				name = u.getName();
			} else {
				System.out.println("Username not exists...");
			}
		}
		return pwd;
	}

}
