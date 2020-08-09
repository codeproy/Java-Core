class Parent{
	
	int z = 20;
	
	
}

class Child extends Parent{
	
	int z = 40;
}


public class InheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p1 = new Parent();
		System.out.println(p1.z);

		Child c1 = new Child();
		System.out.println(c1.z);
		
		Parent p2 = new Child();
		System.out.println(p2.z);
		
		
		
		
	}

}
