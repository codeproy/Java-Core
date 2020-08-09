class A{
	int i;
	
}

class B extends A{
	int i;
	B(int a,int b){
		super.i = a;
		this.i = b;			
	}
	
	void show() {
		System.out.println("Superclass variable is " + super.i);
		System.out.println("Subclass variable is " + this.i);
	}
}
public class UseSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1 = new B(10,20);
		b1.show();

	}

}
