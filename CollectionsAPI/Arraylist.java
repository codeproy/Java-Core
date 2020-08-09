package CollectionsAPI;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Vihaan");
		a.add("Roy");
		a.add("Suman");
		a.add("Sharma");
		System.out.println(a);
		a.add(3, "Partha");
		System.out.println(a);
		System.out.println(a.indexOf("Sharma"));
		System.out.println(a.indexOf("Xarma"));
		a.set(3, "Roy");
		System.out.println(a);
		
		System.out.println(" For Loop for iterating ArrayList");
		
		 /* For Loop for iterating ArrayList */
	      System.out.println("For Loop");
	      for (int counter = 0; counter < a.size(); counter++) { 		      
	          System.out.println(a.get(counter)); 		
	      }   	
	      
	      /* Advanced For Loop*/ 		
	      System.out.println("Advanced For Loop"); 		
	      for (String num : a) { 		      
	           System.out.println(num); 		
	      }
	      
	      System.out.println(a.get(2));
	}

}
