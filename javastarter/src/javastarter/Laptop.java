//package javastarter;
//
//public class Laptop {
//
//	
//	public static void main(String[] args) {
//
//		Engineers []engineers = new Engineers[5];
//		System.out.println("Enter your details");
//		for(int i=0;i<engineers.length;i++) {
//			System.out.println("Enter your engineer details:");
//			engineers[i] = new VerizonEmployee(101,"Sh");
//		}
//	}
//
//}
//
//
//interface Engineers{
//	
//}
//
//
//class VerizonEmployee implements Engineers{
//	private Integer id;
//	private String name;
//	public VerizonEmployee(Integer id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "VerizonEmloyee [id=" + id + ", name=" + name + "]";
//	}
//	
//
//	
//	
//}


package javastarter;
import java.util.ArrayList;
public class Laptop{
	public static void main(String[] args) {
		ArrayList<VerizonEmployee> emp1 = new ArrayList<>();
		
	}
}

class VerizonEmployee{
	private Integer id;
	private String name;
	public VerizonEmployee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "VerizonEmloyee [id=" + id + ", name=" + name + "]";
	}
	

	
}