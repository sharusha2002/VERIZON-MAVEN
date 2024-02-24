package enums;

enum CoolDrinks {
	MAAZA("PET"), SPRITE("MEDIUM"), THUMBSUP("LARGE");

	String size;

	private CoolDrinks(String size) {
		this.size = size;
	}

	public String getSize() {
		return size;
	}

}

public class EnumCooldrinks {

	public static void main(String[] args) {
			new DisplayDetails().display();
	}
}


class DisplayDetails{
	void display() {
		System.out.println("Menu Detais:");
		CoolDrinks[] drink = CoolDrinks.values();
		for(CoolDrinks drinks: drink) {
			System.out.println(drinks+" is of size "+drinks.getSize());
		}
	}
}
