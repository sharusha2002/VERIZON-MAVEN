package com.verizon.practiceproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ece")
public class EceEngineer implements Engineer{

	@Autowired
	@Qualifier("address")
	private Address address;

	@Autowired
	@Qualifier("name")
	private String name;
	
	@Autowired
	@Qualifier("id")
	private Integer id;
	
	



	@Override
	public String toString() {
		return "EceEngineer [address=" + address + ", name=" + name + ", id=" + id + "]";
	}





	@Override
	public void workForWages() {
System.out.println(this);		
	}

	
	
	
	
	
	
	

}
