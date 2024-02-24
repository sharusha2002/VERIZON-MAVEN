package com.verizon.practiceproject1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("mech")
@PropertySource("classpath:application.properties")
public class MechanicalEngineer implements Engineer {

	@Value("${eng.name}")
	private String name;
	
	@Value("${eng.loc}")
	private String location;
	
	@Autowired
	Address address;
	
	@Autowired
List<String> getNames;
	@Override
	public void workForWages() {
		System.out.println(this);
		
	}

	public MechanicalEngineer() {
		
	}

	@Override
	public String toString() {
		return "MechanicalEngineer [name=" + name + ", location=" + location + ", address=" + address + ", getNames="
				+ getNames + "]";
	}

}