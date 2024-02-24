//package javastarter;
//import java.util.Scanner;
//
//public class Display {
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Engineer[] engineer=new Engineer[1];
//		
//		
//
//		for(int i=0;i<engineer.length;i++) {
//			
//			System.out.println("Enter your id: ");
//
//			Integer id= sc.nextInt();
//			sc.nextLine();
//			System.out.println("Enter your name: ");
//
//			String name=sc.next();
//			
//			System.out.println("Enter your salary: ");
//			Integer salary = sc.nextInt();
//			sc.nextLine();
//			
//			System.out.println("Enter your location: ");
//			String location = sc.next();
//			
//			
//			engineer[i] = new Engineer(id, name, salary, location);
//
//		}
//
//		for(Engineer engineers: engineer) {
////			System.out.println("Engineer id: "+" "+engineers.getId()
////			+" "+"Engineer Name: "+engineers.getName()
////			+" "+"Engineer salary: "+engineers.getSalary()+" "
////			+"Engineer Location: "+engineers.getLocation());
//			System.out.println(engineers);
//		}
//		
//
//		sc.close();	
//		
//	}
//}
