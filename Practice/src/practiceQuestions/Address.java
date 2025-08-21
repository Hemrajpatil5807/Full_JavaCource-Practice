package practiceQuestions;

public class Address implements Cloneable {
	 private String city;
	 private String taluka;
	 private String dist;
	 private String state;
	 private int pin;
	 
	public Address(String city, String taluka, String dist, String state, int pin) {
		
		this.city = city;
		this.taluka = taluka;
		this.dist = dist;
		this.state = state;
		this.pin = pin;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return " city=" + city + "  taluka=" + taluka + "  dist=" + dist + "  state=" + state + "  pin=" + pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	 
	 

}
