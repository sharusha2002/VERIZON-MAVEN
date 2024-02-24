package records;


import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class Employee {

	private Integer empId;
	private String empName;
	private String empDesg;
	Scanner sc = new Scanner(System.in);

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesg=" + empDesg + "]";
	}

	Employee() {

	}

	public Employee(Integer empId, String empName, String empDesg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
	}

	ArrayList<Employee> arrayList = new ArrayList<Employee>();

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public void addEmployee(Employee empobj) {
		arrayList.add(empobj);
	}

	public void display() {
		for (Employee employee : arrayList) {
			System.out.println(employee);
		}
	}

	public void delete(String delbyName) {
		try {
		for (Employee employee : arrayList) {
			
			if (employee.empName.equalsIgnoreCase(delbyName)) {
				System.out.println("Succesfully removed");
				
					arrayList.remove(employee);
				} 
			}
		}
			catch (ConcurrentModificationException e) {
//					System.out.println(e.getMessage());
				}
			} 
		
		
	

	public void search(String searchbyName) {
		for (Employee employee : arrayList) {

			if (employee.empName.equalsIgnoreCase(searchbyName)) {
				System.out.println(employee);
			}
		}

	}

	public void update(String updatebyName)  {
		String choiceofUpdate = "";
		for (Employee employee : arrayList) {
			
			System.out.println("What you want me to update ");
			choiceofUpdate = sc.next();
			try {
				if (employee.empName.equalsIgnoreCase(updatebyName)) {

				
				
				if (choiceofUpdate.equalsIgnoreCase("empId")) {
					System.out.println("enter the Id");
					employee.empId = sc.nextInt();
				}
//				if (choiceofUpdate.equalsIgnoreCase("empDesg")) {
//					System.out.println("Enter the new Designation");
//
//					employee.empDesg = sc.next();
//				}
//				if (choiceofUpdate.equalsIgnoreCase("empName")) {
//					System.out.println("Enter the newName");
//					employee.empName = sc.next();
//				}
				}
			}
					
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			

			
			System.out.println("Updated employee details" + employee);
			
		}

	}

}
