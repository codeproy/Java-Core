class TwoDShapes{
	
	private double width;
	
	private double height;
	
	TwoDShapes(){
		width  = 0;
		height = 0;	
	}
	
	TwoDShapes(double x){
		width  = x;
		height = x;	
	}
	
	TwoDShapes(double w, double h){
		width  = w;
		height = h;
	}
	
	
	void showDim(){
		System.out.println("Width and Height are " + width + " and " + height);
	}
	
	
	double getHeight() {return height;}
	
	double getWidth() { return width;}
	
	void setWidth(double w) {width = w;}
	
	void setHeight(double h) {height = h;}	
	
}

class Triangles extends TwoDShapes{
	
	String style;
	
	Triangles(String s){
		
		super();
		style = s;
		
	}
	
	Triangles(String s,double x){
		
		super(x);
		style = s;
		
	}
	
	
	Triangles(String s,double w, double h){
		
		super(w,h);
		style = s;
		
	}
	
	double area() {
		return getHeight() * getWidth() * 1/2;
		
	}
	
	void showStyle(){	
		System.out.println("Style is  " + style);
	}
	
	
	
	
}
public class Shapes4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangles t1 = new Triangles("Filled");
		
		Triangles t2 = new Triangles("Colored",20);
		
		Triangles t3 = new Triangles("Non-Colored",20,10);
		
		t1.showDim();
		System.out.println("Area is " + t1.area());
		t1.showStyle();
		
		t2.showDim();
		System.out.println("Area is " + t2.area());
		t2.showStyle();
		
		t3.showDim();
		System.out.println("Area is " + t3.area());
		t3.showStyle();
		

	}

}
