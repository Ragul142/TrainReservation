package TrainReservationSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class AfterLogin {
	public static Scanner sc = new Scanner(System.in);

	public void menu(String username) {
		Booking.displayseats();
		System.out.println("\nHello! " + username);
		LinkedList<Passenger> pss = new LinkedList<Passenger>();
		System.out.println("No. of Seats: ");
		int seats = sc.nextInt();
		for (int i = 1; i <= seats; i++) {
			System.out.println("Enter Passenger Name: ");
			String name = sc.next();
			System.out.println("Enter Gender:\n 1. Male\n 2. Female\n ");
			int gen = sc.nextInt();
			String gender = null;
			switch (gen) {
			case 1:
				gender = "Male";
				break;
			case 2:
				gender = "Female";
				break;
			default:
				System.err.println("Enter Valid Input...");
			}
			System.out.println("Enter Coach Type:\n 1. AC\n 2. Non-AC\n");
			int c = sc.nextInt();
			String cType = null;
			switch (c) {
			case 1:
				cType = "AC";
				break;
			case 2:
				cType = "Non-AC";
				break;
			default:
				System.err.println("Enter Valid Input...");
			}
			pss.add(new Passenger(i,name,gender,cType));
			Booking.booking(cType);
			Booking.displayseats();
			Booking.billing(cType);
		}
	}
	
}
