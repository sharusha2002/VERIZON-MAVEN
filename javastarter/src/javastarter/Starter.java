package javastarter;

public class Starter {

	public static void main(String[] args) {
//		System.out.println("Hello world");
		School school = new School();
		
		School stu2 = new School(1002, "Meha", "HTML, CSS, JAVA");
		school.setId(1001);
		school.setName("Sharusha");
		school.setSkills("C, Java, HTML");
		
		System.out.println("Student Details: ");
		System.out.println(school);
		System.out.println(stu2);
		
		Employee emp1 = new Employee(78, "sharusha", "chennai", "xyz street", "Java FSD");
		System.out.println(emp1);		
	}
	
}


