package TrainReservationSystem;

public class Compartment {
	private int coachNo;
	private String coachType;
	private int seats;
	private int price;
	
	public Compartment(int coachNo, String coachType, int seats, int price) {
		super();
		this.coachNo = coachNo;
		this.coachType = coachType;
		this.seats = seats;
		this.price = price;
	}
	public int getCoachNo() {
		return coachNo;
	}
	public void setCoachNo(int coachNo) {
		this.coachNo = coachNo;
	}
	public String getCoachType() {
		return coachType;
	}
	public void setCoachType(String coachType) {
		this.coachType = coachType;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
