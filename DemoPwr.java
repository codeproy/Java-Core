
class Pwr{
	
	double b;
	double e;
	
	Pwr(double b, double e){
		this.b = b;
		this.e = e;
	
		
	}
	
	
	double getPwr() {
		double x = 1;
		do {
			x = x * this.b;
			e -=1;
		} while (e > 0);
		return x;
	}
	
}

public class DemoPwr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pwr p1 = new Pwr(5,3);
		System.out.println(p1.getPwr());
		
	}

}
