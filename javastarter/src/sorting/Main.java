package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Teachers> teachers = new ArrayList<>();
		teachers.add(new Teachers(21, "shalini", "Ece", "Chennai"));
		teachers.add(new Teachers(93, "Keerthika", "IT", "Banglore"));
		teachers.add(new Teachers(34, "Kailash", "EEE", "Hyderabad"));
		teachers.add(new Teachers(45, "Meha", "IT", "Coimbatore"));
		
		System.out.println("Unsorted order:");
		Iterator<Teachers> i = teachers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Collections.sort(teachers, new SortTeachersById());
		System.out.println("Sorted order:");
		Iterator<Teachers> is = teachers.iterator();
		while(i.hasNext()) {
			System.out.println(is.next());
		}
		System.out.println(teachers);
	}
}


class SortTeachersById implements Comparator<Teachers> {

	@Override
	public int compare(Teachers o1, Teachers o2) {
		return o1.getTeacher_id().compareTo(o2.getTeacher_id());
	}
	
}