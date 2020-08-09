package classeMethods;

public class TestStatic {
	
	static int x;
	
	int assign() {
		return 20;
	}

	void display() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TestStatic t1 = new TestStatic();
			x= t1.assign();
			t1.display();
	}
	
	System.out.println("Program COmpleted");

}
