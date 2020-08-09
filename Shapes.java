class TwoDShape{
	
	private double height;
	private double width;
	
	void showDim(){
		
		System.out.println("Width and Height are " + width + " and " + height);
	}
	
	
	double getHeight() {return height;}
	
	double getWidth() { return width;}
	
	void setWidth(double w) {width = w;}
	
	void setHeight(double h) {height = h;}	
	
}

class Triangle extends TwoDShape{
	
	String style;
	
	double area() {
		return getHeight() * getWidth() * 1/2;
		
	}
	
	void showStyle(){
		
		System.out.println("Style is  " + style);
	}
	
}


class Rectangle extends TwoDShape{
	
	boolean isSquare() {
		
		if (getHeight() == getWidth()) return true;
		return false;
		
	}
	
	double area() {
		return getHeight() * getWidth();
		
	}
	
}
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle();
		
		Triangle t2 = new Triangle();
		
		t1.setHeight(4);
		t1.setWidth(10); 
		t1.style = "filled";
		
		t2.setHeight(10);
		t2.setWidth(20); 
		t2.style = "Colored";
		
		t1.showDim();
		System.out.println("Area is " + t1.area());
		t1.showStyle();
		
		t2.showDim();
		System.out.println("Area is " + t2.area());
		t2.showStyle();
		
		Rectangle r1 = new Rectangle();
		
		r1.setHeight(16);
		r1.setWidth(20);
		System.out.println("Rectangle is square " + r1.isSquare());
		System.out.println("Area is " + r1.area());

	}

}
