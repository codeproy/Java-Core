
public class ConsDemo2 {
	
//	ConsDemo(){};
	
	static int x = 70;
	int y = 80;
	static class MyClass {
		
		int d= 10;
				
			MyClass(int d) {
				this.d = d;
		}
			
			MyClass(){
				this.d = 20;
			}
	
		
	}
	
	void assign_val() {
		int y = 20;
		System.out.println("local y is " + y);
		System.out.println("instance y is " + this.y);
	}

			/*
	class InnerClass{
		
		int id;
		int var = 20 ;
		InnerClass(){
			this.id = x;
			
		}
		
		int showVar() {
			return var;
		}
		
	}
	*/

		
	
	
	public static void main(String arags[]) {
		/*
		MyClass c1 = new MyClass(30);
		System.out.println(c1.d);
		MyClass c2 = new MyClass();
		System.out.println(c2.d);
		ConsDemo out = new ConsDemo();
		*/
		//ConsDemo.InnerClass i1 = new ConsDemo().new InnerClass();
		ConsDemo2 cd = new ConsDemo2();
		System.out.println(cd.x);
		ConsDemo2.x = 30;
		System.out.println(cd.x);
		cd.x = 20;
		cd.y = 999;
		System.out.println(cd.x);
		ConsDemo2 cd1 = new ConsDemo2();
		System.out.println(cd1.x);
		System.out.println(cd1.y);
		cd1.assign_val();
		System.out.println(cd1.y);
	}

}
