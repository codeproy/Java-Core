public class Vehicle {

	int numofPassengers = 0;
	int mpg;
	
	
	Vehicle(int n, int m){
		
		numofPassengers = n;
		mpg = m;
		
	}
	public double fuelConsumed() {
		
		return (mpg * numofPassengers);
	}
	

}
