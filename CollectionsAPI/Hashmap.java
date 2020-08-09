package CollectionsAPI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> a = new HashMap<Integer,String>();	
		a.put(0, "Vihaan");
		a.put(1, "Roy");
		System.out.println(a);
		System.out.println(a.get(1));
		
        //FOR LOOP
        System.out.println("For Loop:");
        for (Map.Entry me : a.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
        
        System.out.println("Entry set" + a.entrySet());
        
        //WHILE LOOP & ITERATOR
        System.out.println("While Loop:");
        Iterator iterator = a.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator.next();
          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        } 
		
	}

}
