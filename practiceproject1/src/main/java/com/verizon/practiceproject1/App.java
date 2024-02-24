package com.verizon.practiceproject1;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

@Configuration
public class App {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		ComputerEngineer engineer = context.getBean("computerEngineer", ComputerEngineer.class);
//		ComputerEngineer engineer2 = context.getBean("computersEngineers", ComputerEngineer.class);
//		engineer.workForWages();
//		engineer2.workForWages();
//
//		Engineer engineers = context.getBean("civilEngineer", CivilEngineer.class);
//		engineers.workForWages();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig.xml");

//		MechanicalEngineer eng1 = context.getBean("mech", MechanicalEngineer.class);
//		eng1.workForWages();
		
//		EceEngineer eng2 = context.getBean("ece", EceEngineer.class);
//		eng2.workForWages();
//		
//		MechanicalEngineer  mech= context.getBean("mech", MechanicalEngineer.class);
//		mech.workForWages();
		
		ItEngineer it = context.getBean("itEngineer", ItEngineer.class);
		it.workForWages();
	}
	@Bean
	public List<String> getNames(){
		return Arrays.asList("sharusha", "Sivadhanush");
	}
}
