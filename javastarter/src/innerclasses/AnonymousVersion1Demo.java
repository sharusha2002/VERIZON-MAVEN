package innerclasses;

public class AnonymousVersion1Demo {
	public static void main(String[] args) {
//		Ronaldo ro = new Ronaldo();
//		new Ronaldo().play();
//		ro.play();
		//Anonymous inner class
//		Footballer footballer = new Footballer() {
//			
//			@Override
//			public void play() {
//				System.out.println("MAgical this....");
//			}
//		};
//		
//		footballer.play();
		
		new Footballer() {
			
			@Override
			public void play() {
				System.out.println("magical");
				
			}
		}.play();
	}
}

@FunctionalInterface
interface Footballer{
	void play();
}


//class Ronaldo implements Footballer{
//
//	@Override
//	public void play() {
//			System.out.println("Ronaldo plays footabll");
//	}
//	
//}