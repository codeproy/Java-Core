package CollectionsAPI;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> a = new HashSet<String>();
		a.add("Vihaan");
		a.add("Roy");
		a.add("Suman");
		System.out.println(a);
		
	     for (String num : a) { 		      
	           System.out.println(num); 		
	     }
	     
	     Iterator<String> i =  a.iterator();
	     
	     while (i.hasNext()) {
	    	 System.out.println(i.next());
	     }
	      
	}

}
