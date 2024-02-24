package records;

public class Main {
	public static void main(String[] args) {
		Shirts shirt1 = new Shirts(20, "T-shirt", 32);
		Shirts shirt2 = new Shirts(23, "T-shirt", 32);
		if(shirt1.equals(shirt2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("different");
		}
		
		
	}
	
	}

