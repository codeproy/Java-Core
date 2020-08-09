package classeMethods;

class ConsDemo {
	
//	ConsDemo(){};
	static {
	System.out.println(" First sentence in class");
	}
    static int x = 100;
	int y = 200;
	//y = 80;
	//x = 70;
	
	ConsDemo(){
		
		System.out.println("Object Getting Created");
		y = 100;
		x = 50;
		
	}
	
	 
	
	void assign_val() {
		int y = 20;
		System.out.println("local y is " + y);
		System.out.println("instance y is " + this.y);
	}
	
	void generate_obj(int i) {
		
		while (i > 0) {
			InstanceLocalVar obj = new InstanceLocalVar();
			i--;
			
		}
		
	}

}

public class InstanceLocalVar {

	public static void main(String arags[]) {
		
		System.out.println("Main");

		ConsDemo cd = new ConsDemo();
		System.out.println("ConsDemo.x " + ConsDemo.x);
		System.out.println("cd.x " + cd.x);
		ConsDemo.x = 30;
		System.out.println("cd.x " + cd.x);
		System.out.println("ConsDemo.x " + ConsDemo.x);
		cd.x = 20;
		cd.y = 999;
		System.out.println("cd.x " + cd.x);
		System.out.println("ConsDemo.x " + ConsDemo.x);
		ConsDemo cd1 = new ConsDemo();
		System.out.println("ConsDemo.x " + ConsDemo.x);
		System.out.println("cd1.x " + cd1.x);
		System.out.println("cd1.y " + cd1.y);
		cd1.assign_val();
		System.out.println(cd1.y);
		//cd1.generate_obj(20);
	}
	
	static {
		System.out.println("Even Before Main");
	}
}

