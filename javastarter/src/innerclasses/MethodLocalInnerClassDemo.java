package innerclasses;

public class MethodLocalInnerClassDemo {
	public static void main(String[] args) {
		new Other().func();
//		new Other().new Inner().met();
	}

}


class Other{
	void func() {
		boolean flag = false;
		class Inner{
//			 flag = true; // throws error
			void met() {
				System.out.println("Inside inner");
				System.out.println(flag);
			}
		}
		new Inner().met();
	}
		
}
