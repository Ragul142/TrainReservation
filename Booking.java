package TrainReservationSystem;

import java.util.LinkedList;

public class Booking {
	
	public static LinkedList<Compartment> comp = new LinkedList<Compartment>();
	static {
		comp.add(new Compartment(1,"AC",1,500));
		comp.add(new Compartment(2,"AC",1,500));
		comp.add(new Compartment(3,"Non-AC",1,250));
		comp.add(new Compartment(4,"Non-AC",60,250));
		comp.add(new Compartment(5,"Non-AC",60,250));
	}
		
	public static void displayseats() {
		System.out.println("======================================================================");
		System.out.printf(" %-2s %-8s %-8s %-8s\n","Coach No.", "Type","Seats","Price");
		System.out.println("======================================================================");
		for(Compartment c: comp) {
			System.out.printf(" %-10d %-8s %-8s %-8s\n", c.getCoachNo(),c.getCoachType(),c.getSeats(),c.getPrice());
	}
		System.out.println("======================================================================");
	}
	static int Price=0;
	public static int booking(String ctype) {
		for(Compartment c: comp) {
			if(c.getCoachType().equals(ctype)) {
				if(ctype.equals("AC")) {
				if(c.getSeats()>0) {
					c.setSeats(c.getSeats()-1);
					Price += 500;
				}
				else
					continue;
			}else if(ctype.equals("Non-AC")) {
				if(c.getSeats()>0) {
					c.setSeats(c.getSeats()-1);
					Price += 250;
				}
				else
					continue;
			}
			}
		}
		return 0;
	}
	public static void billing(String ctype) {
		System.out.println("Total Fare: " + Price );
	}
	
}
