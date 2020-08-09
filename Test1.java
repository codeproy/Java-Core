class Test2{
	
	int x;
	
	int assign() {
		x = 20;
		return x;
	}
	void show() {
		System.out.println(x);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 t = new Test2();
		t.assign();
		t.show();
	}

}
