package classeMethods;

class Singleton{
	
	//private static final Singleton singleton = new Singleton();
	
	private static Singleton singleton = null;
	
   private String p;
	 
	private Singleton() {
		
	};
	
	public void setPath(String p) {
		this.p = p;
	}
	
	public String getPath() {
		return this.p;
	}
	
	public static Singleton getInstance() {
		
		if (singleton == null) {
			
			singleton =  new Singleton();
		}
		return singleton;
	}
	
	public void demo() {
		System.out.println("demo");
	}
	
}

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		s1.setPath("abc.xyz");
		System.out.println(s1.getPath());
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.getPath());
		
		

	}

}
