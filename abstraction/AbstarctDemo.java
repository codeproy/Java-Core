package abstraction;

public class AbstarctDemo {
	
	public static void main(String[] args) {
		
		AbstarctDemo ad = new AbstarctDemo();
		Mobile ip = new Iphone();
		ad.showConfig(ip);
		Mobile sp = new Samsung();
		ad.showConfig(sp);
		
	}
	
	public void showConfig(Mobile mb) {
		mb.show();
	}
	
	public static void showConfig(Samsung sp) {
		sp.show();
	}

}

// Abstract class can have normal and abstarct methods
// Abstract methods can not have body defined
// Objects of abstarct classes can not be created

abstract class Mobile{	
	 abstract void show() ;
	 
	 int add(int a, int b) {
		return a + b ;
		 
	 }
}

class Iphone extends Mobile{
	
	void show() {
		System.out.println("IOS");
	}
}

class Samsung extends Mobile{
		
		void show() {
			System.out.println("Andriod");
}
}	

