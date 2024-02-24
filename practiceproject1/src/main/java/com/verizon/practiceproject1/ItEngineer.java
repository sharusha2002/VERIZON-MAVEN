package com.verizon.practiceproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:application.properties")
public class ItEngineer implements Engineer{

	
	@Value("${it.name}")
	private String name;
	
	@Value("${it.id}")
	private String id;
	@Autowired
	private Address address;
	
	
	@Override
	public String toString() {
		return "ItEngineer [name=" + name + ", id=" + id + ", address=" + address + "]";
	}


	@Override
	public void workForWages() {
      		System.out.println(this);
	}

}
