package com;

public class Contactdetails {

	private String ename;
	private String eemail;
	private long ephonenum;
	private String eaddress;

	public Contactdetails(String ename, String eemail, long ephonenum, String eaddress) {
		super();
		this.ename = ename;
		this.eemail = eemail;
		this.ephonenum = ephonenum;
		this.eaddress = eaddress;
	}

	public String getName() {
		return ename;
	}

	public void setName(String name) {
		this.ename = name;
	}

	public String getEmail() {
		return eemail;
	}

	public void setEmail(String email) {
		this.eemail = email;
	}

	public long getPhonenum() {
		return ephonenum;
	}

	public void setPhonenum(long phonenum) {
		this.ephonenum = phonenum;
	}

	public String getAddress() {
		return eaddress;
	}

	public void setAddress(String address) {
		this.eaddress = address;
	}

}
