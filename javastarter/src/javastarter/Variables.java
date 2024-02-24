package javastarter;

public class Variables {
	
	int b=11;
	static final int a;
	static {
		a=30;
		System.out.println("Hey staticBlock executng....");
	}
	{
		System.out.println("Instance Block");
	}
	static {
		    
		System.out.println("Hey staticBlock executng....");
	}
	
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);  //10
		System.out.println(a); //10
		System.out.println(Variables.a); //30
		new Variables();		 
	}
	
}
