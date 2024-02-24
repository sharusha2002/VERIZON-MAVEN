package com.verizon.practiceproject1;

public class CivilEngineer implements Engineer {

	private Address address;

	public CivilEngineer() {

	}

	
	public CivilEngineer(Address address) {
		super();
		this.address = address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "CivilEngineer [address=" + address + "]";
	}

	public void workForWages() {
		System.out.println("Civil engineers also work for wages...");
		System.out.println(this);
	}

}
