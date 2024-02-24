package collections;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
public class DisplayEngineerDetails {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		ArrayList<Engineers> engineer = new ArrayList<>();
//		
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
////				System.out.println("Enter engineer details:");
////				for(Engineers eng: engineer) {
//				System.out.println("Enter engineer id, name, location, salary: ");
//				engineer.add(new Engineers(sc.nextInt(), sc.next(), sc.next(), sc.nextInt()));
//				sc.nextLine();
//				
//				System.out.println(engineer);
////				}
//		}
		PriorityQueue<Integer> pque = new PriorityQueue<Integer>();
		pque.add(3);
		pque.add(1);
		pque.add(10);
		pque.remove();
		System.out.println(pque);
	}
}
