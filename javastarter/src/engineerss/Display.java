package engineerss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Engineer> engineer = new ArrayList<>();
		String wantToRun;
		System.out.println("Please enter your choice to perform operations:");
		do {
			System.out.println("Enter your choice of operation: ");
			String choice=sc.next();
			switch(choice) {
			case "add":
				System.out.println("Please enter the engineer details");
				engineer.add(new Engineer(sc.nextInt(), sc.next(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
				System.out.println(engineer);
				break;
				
			case "delete":
				System.out.println("Please enter engineer name to delete:");
				String name=sc.next();
				sc.nextLine();
				engineer.remove(name);
				System.out.println(engineer);
				break;
			
			case "display":
				System.out.println("Displaying all engineer details:");
//				while()
				break;
			
			default:
				System.out.println("Enter valid choice:");
				break;
		}
			wantToRun=sc.next();
			
		}while(wantToRun.equalsIgnoreCase("yes"));
		
	}
}
