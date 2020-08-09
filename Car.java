public class Car {
	
	int f;
	int p ;
	
	Car (){
		
		this.p= 4 ;
		this.f = 50;
	}
	
	Car (int p, int f){
		this.p = p;
		this.f = f;
						
	}
	public double setWeight(double weight) {
		
		return weight;
	}
	
	public double setFuelConsumed(Vehicle v) {
		
		return v.fuelConsumed();
	}
	
	public float getFuelToWeight(double fuelConsumed, double weight ) {
		
		return (float) (fuelConsumed / weight);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car(4,30);
		Vehicle v1 = new Vehicle(c1.p,c1.f);
		
		//c1.setWeight(75);
		System.out.println(c1.getFuelToWeight(c1.setFuelConsumed(v1),c1.setWeight(75)))	;
	}

}
