package records;

import java.util.*;
public class Starters {
	
	public static void main(String[] args) {
		
		Scanner theScan = new Scanner(System.in);
		
		ArrayList<VerizonEmployee> employees = new ArrayList<>();
		
		boolean userChoice = true;
		
		while(userChoice) {
			System.out.println(
					"1.Enter Engineer Details \n 2.View All \n 3.Delete Engineer by name \n 4.Search for Engineer by name \n 5.Update Engineer details by id \n 6.Exit");
			System.out.println("Enter your Choice");
			int choice=theScan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Engineer details");
				System.out.println("Enter name, domain,id");
				
				employees.add(new VerizonEmployee(theScan.next(),theScan.next(),theScan.nextInt()));
				
				theScan.nextLine();
				
				System.out.println("Employee added successfully");
				break;
				
			case 2:
				System.out.println("Registered employees:");
				
				for(VerizonEmployee employee : employees) {
			System.out.println(employee);
			}
				break;
				
			case 3:
			System.out.println("Enter the name of the person to remove:");
			String nameToRemove = theScan.next();
			
			for(VerizonEmployee employee : employees) {
				if(employee.name().equalsIgnoreCase(nameToRemove)) {
					employees.remove(employee);
					System.out.println("Employee removed:"+ employee);
					System.out.println("Successfully removed");
					break;
				}
			}
					
			case 4:
			System.out.println("Enter the name of the person to search:");
			String nameToSearch=theScan.next();
			
			VerizonEmployee foundEmployee = null;
			for(VerizonEmployee employee : employees) {
				if(employee.name().equalsIgnoreCase(nameToSearch)) {
					foundEmployee = employee;
					break;
				}
			}
			
			if(foundEmployee != null) {
				System.out.println("Employee found:"+foundEmployee);
			}else {
				System.out.println("Employee with name "+ nameToSearch +"not found");
			}
			break;
			
			case 5:
				System.out.println("Enter the ID of the employee to update:");
				int idToUpdate = theScan.nextInt();
				
				for(VerizonEmployee employee : employees) {
					if(employee.id()==idToUpdate) {
						int index= employees.indexOf(employee);
						System.out.println("Enter new name");
						String updatedName = theScan.next();
						System.out.println("Enter new Domain");
						String updatedDomain = theScan.next();
						
						VerizonEmployee updatedObject= new VerizonEmployee(updatedName, updatedDomain, employee.id());
						employees.set(index,updatedObject);
						
//						employee.ame(updatedName);
//						employee.setDomain(updatedDomain);
						
						System.out.println("Employee Updated:"+updatedObject);
					}else {
						System.out.println("Enter valid id:");
					}
				}break;
				
			case 6:
				userChoice = false;
				break;
				
				default:
					System.out.println("Enter valid choice");
				}
			}
		}
		
}
//interface Engineers {
//	
//}
//record VerizonEmployee(String name, String domain, Integer id) implements Engineers {
//	
//}
//
//class VerizonEmployee implements Engineers{
//	
//	private Integer id;
//	
//	private String name;
//	
//	private String domain;
//	
//	public VerizonEmployee() {
//		
//	}
//
//	@Override
//	public String toString() {
//		return "VerizonEmployee [id=" + id + ", name=" + name + ", domain=" + domain + "]";
//	}
//
//	public VerizonEmployee(String name, String domain,Integer id) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.domain = domain;
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
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDomain() {
//		return domain;
//	}
//
//	public void setDomain(String domain) {
//		this.domain = domain;
//	}
//	
//	
//}
