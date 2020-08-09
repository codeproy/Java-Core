package CollectionsAPI;

import java.util.HashMap;
import java.util.Map;

class arrayMap{
	
	int a[] = new int[10];
	HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
	
	arrayMap(int a[]){
		this.a = a;
		}
	
	public  void loopHashMap() {
        System.out.println("For Loop:");
        for (Map.Entry me : hm.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
		
	}
	
	public void loadMap() {
		
	    for (int num : a) { 		      
	         if (hm.containsKey(num))
	         {
	      	   hm.put(num,hm.get(num)+1);
	         }
	         else
	      	   hm.put(num,1);
	    } 
	    
		
	}
	

    
}
public class countOccurences {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int a[] = {5,4,4,1,1,1,1,2};
		arrayMap am = new arrayMap(a);
		am.loadMap();
		am.loopHashMap();

	      
	}

}
