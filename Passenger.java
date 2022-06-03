package TrainReservationSystem;

public class Passenger {
	private int sno;
	private String name;
	private String gender;
	private String coachType;
	
	public Passenger(int sno, String name, String gender, String coachType) {
		super();
		this.sno = sno;
		this.name = name;
		this.gender = gender;
		this.coachType = coachType;
	}
	public int getSNo() {
		return sno;
	}
	public void setSNo(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCoachType() {
		return coachType;
	}
	public void setCoachType(String coachType) {
		this.coachType = coachType;
	}
	
	

}
