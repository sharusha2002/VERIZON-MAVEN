package enums;

enum PizzaSize {
	REGULAR(2), MEDIUM(4), LARGE(6), XLARGE(8);

	int serving;

	private PizzaSize(int serving) {
		this.serving = serving;
	}

	public int getServing() {
		return serving;
	}

}

public class EnumDemo {
	public static void main(String[] args) {
		new DisplayMenu().display();
	}
}

class DisplayMenu {
	void display() {
		System.out.println("Dear Customer... These are the sizes of pizzas available");
		PizzaSize[] size = PizzaSize.values();
		for (PizzaSize sizes : size) {
			System.out.println(sizes + " serves " + sizes.getServing() + " people....");
		}
	}
}
