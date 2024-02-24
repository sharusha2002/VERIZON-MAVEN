//package com.verizon.springstarter;
//
//public class Doctor {
//
//	private String name;
//	private Integer id;
//	private String specialist;
//	private Address address;
//
//	public Doctor() {
//
//	}
//
//	public Doctor(String name, Integer id, String specialist, Address address) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.specialist = specialist;
//		this.address = address;
//	}
//
//	@Override
//	public String toString() {
//		return "Doctor [name=" + name + ", id=" + id + ", specialist=" + specialist + ", address=" + address + "]";
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getSpecialist() {
//		return specialist;
//	}
//
//	public void setSpecialist(String specialist) {
//		this.specialist = specialist;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	void printDoctor() {
////		System.out.println("The doctor details are: ");
////		System.out.println("Doctor name: "+name+" ID: "+id+" Specialist in: "+specialist);
////		System.out.println("Address : "+address.getCity()+""+address.getPinCode());
//		System.out.println(this);
//	}
//
//}


package com.verizon.springstarter;

import java.util.List;

public class Doctor{
	private String name;
	private Integer id;
	private String specialist;
	
	private List<Address> address;
	
	public Doctor() {
		
	}

	
	
	
	public Doctor(String name, Integer id, String specialist, List<Address> address) {
		super();
		this.name = name;
		this.id = id;
		this.specialist = specialist;
		this.address = address;
	}

	


	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", specialist=" + specialist + ", address=" + address + "]";
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getSpecialist() {
		return specialist;
	}




	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}




	public List<Address> getAddress() {
		return address;
	}




	public void setAddress(List<Address> address) {
		this.address = address;
	}




	void printDoctor() {
		System.out.println(this);
	}
}