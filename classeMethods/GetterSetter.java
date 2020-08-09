package classeMethods;

class MyClass {
	
	private int alpha;
	public int beta;
	int gamma;
	
	public void setAlpha(int al) {
		alpha = al;
	}
	
	public int getAlpha() {
		return alpha;
	}

	public void setGamma() {
		gamma = alpha;
	}
}

public class GetterSetter{
	
	public static void main(String args[]) {
		
		MyClass mc = new MyClass();
		mc.setAlpha(20);
		mc.beta = 30;
		mc.gamma = 40;
		System.out.println(mc.getAlpha() + " "  + mc.beta + " "+ mc.gamma);
		mc.setGamma();
		System.out.println(mc.getAlpha() + " "  + mc.beta + " "+ mc.gamma);
		
	}
}
