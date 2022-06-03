package TrainReservationSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---ZOHO Train Booking System---");
		Signing sg = new Signing();
		boolean bk = false;
		do {
			System.out.println("\n1. Sign Up(New User)\n2. Sign in\n3. Exit");
			String no = sc.next();
			switch (no) {
			case "1":
				sg.newUser();
				break;
			case "2":
				sg.login();
				break;
			case "3":
				bk = true;
				break;
			default:
				System.err.println("Please choose the correct option(1-3):");
			}
			if (bk)
				break;
		} while (true);
	}
	

}
