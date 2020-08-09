
//import Vehicle;
public class CompFuel {
	
	public static void main(String srgs[]) throws Exception {
		
		String filePath="E:\\java\\car.txt";
		ReadFromFile r1 = new ReadFromFile(filePath);
		
		r1.readFile().forEach(elem -> {
           // System.out.println(elem);
            String[] arrOfStr = elem.split(":");
            //System.out.println(arrOfStr[1]);
            Vehicle v  = new Vehicle((Integer.parseInt(arrOfStr[0])),(Integer.parseInt(arrOfStr[1])));
            System.out.println("Fuel COnsumed -->"+ 
            v.fuelConsumed());
            
        });
		
		
		//v1.numofPassengers = 4;
		//v1.mpg = 20;
		
			
	}

}
