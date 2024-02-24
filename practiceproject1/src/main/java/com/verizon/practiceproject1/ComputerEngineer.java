package com.verizon.practiceproject1;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ComputerEngineer implements Engineer, InitializingBean, DisposableBean {
	private Integer id;
	private String name;
	private String skills;
	private List<Address> address;
	
	public ComputerEngineer() {
		
	}

	public ComputerEngineer(Integer id, String name, String skills, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ComputerEngineer [id=" + id + ", name=" + name + ", skills=" + skills + ", address=" + address + "]";
	}

	@Override
	public void workForWages() {
		System.out.println(this);
		System.out.println("Computer Engineers are the one who is specialist in software technologies");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Computer bean is about to be destroyed....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
System.out.println("BEan instantiated");		
	}
}
//	
//	
//	
//	
//}


//public class ComputerEngineer implements Engineer{
//
//	private Integer id;
//	private String name;
//	private String skills;
//	private Address address;
//	@Override
//	public void workForWages() {
//		// TODO Auto-generated method stub
//		System.out.println(this);
//	}
//	
//	public ComputerEngineer() {
//		
//	}
//	
//	
//	public ComputerEngineer(Integer id, String name, String skills, Address address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.skills = skills;
//		this.address = address;
//	}
////
////
//	@Override
//	public String toString() {
//		return "ComputerEngineer [id=" + id + ", name=" + name + ", skills=" + skills + ", address=" + address + "]";
//	}
//
//
//	public Integer getId() {
//		return id;
//	}
//
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
////
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
////
//	public String getSkills() {
//		return skills;
//	}
//
////
//	public void setSkills(String skills) {
//		this.skills = skills;
//	}
////
////
//	public Address getAddress() {
//		return address;
//	}
////
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	
//}