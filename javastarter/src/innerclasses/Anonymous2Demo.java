package innerclasses;

public class Anonymous2Demo {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.met(new Remote() {
			@Override
			public void workFromHome() {
				System.out.println("Truly magical");
			}
		});
	}
}


interface Remote{
	void workFromHome();
}


class Sub{
	void met(Remote ref) {
		ref.workFromHome();
	}
}