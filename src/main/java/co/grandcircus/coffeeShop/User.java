package co.grandcircus.coffeeShop;

public class User {
	public String fname;
	public String lname;
	public String email;
	public String number;
	public String password;
	
	public User() {
		
	}

	public User(String fname, String lname, String email, String number, String password) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.number = number;
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
