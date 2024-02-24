package innerclasses;

public class RegularInnerDemo {

	public static void main(String[] args) {
//			new Outer().out();
			Outer out = new Outer();
			Outer.Inner in = out.new Inner();
			in.met();
	}

}
class Outer{
	int value;
	class Inner{
		int value; //instance variables can have default value
		void met() {
			int value=5;//local variables dont have default value we should declare it
			System.out.println("Inside inner");
			System.out.println("Local value:"+value);
			System.out.println("Instnace value: "+this.value); //accessing instance variables
			System.out.println("Outer instance value: "+Outer.this.value);
		}
	}
	void out() {
		Inner ref = new Inner();
		ref.met();
	}
}