package entity;

public class Employee {
	
	private String fname, midname,lname,mobile,email, bdate, gender, adr;
	private String name;
	private int id;
	
	public Employee(String fname, String midname, String lname, String mobile, String email, String bdate,
			String gender, String adr) {
		super();
		this.fname = fname;
		this.midname = midname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.bdate = bdate;
		this.gender = gender;
		this.adr = adr;
	}

   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

public Employee(int id,String name, String mobile, String email, String gender, String bdate, String adr) {
	    this.id=id;
	    this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.bdate = bdate;
		this.gender = gender;
		this.adr = adr;
   }
	
   public String getName() {
	   return name;
   }
   

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMidname() {
		return midname;
	}

	public void setMidname(String midname) {
		this.midname = midname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}
	
	@Override
   public String toString() {
	
	return name+"   "+mobile+"  "+email+"  "+bdate+"  "+gender+"  "+adr;
}


}
