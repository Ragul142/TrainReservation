package TrainReservationSystem;

public class User {
	private String name;
	private String userName;
	private String pwd;
	public User(String name, String userName, String pwd) {
		super();
		this.name = name;
		this.userName = userName;
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
