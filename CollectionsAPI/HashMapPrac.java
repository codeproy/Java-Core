package CollectionsAPI;
import java.util.HashMap;

public class HashMapPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String > cities = new HashMap<String,String>();
		cities.put("England", "London");
		cities.put("Germany", "Berlin");
		System.out.println(cities);
		System.out.println(cities.get("England"));
		System.out.println(cities.size());
		System.out.println(cities.keySet());
		
		//loop through hash-map
		for (String i: cities.keySet()) {
			
			System.out.println("Key is " + i + " and element is " + cities.get(i) );
		}

	}

}
