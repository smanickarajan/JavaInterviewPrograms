package CollectionsConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		Map<Integer, String> names = new HashMap<>();

		names.put(1, "Jon");
		names.put(2, "Graham");
		names.put(3, "Andrew");

		/*
		 * Iterator<Entry<Integer, String>> itr = names.entrySet().iterator();
		 * 
		 * while (itr.hasNext()) { System.out.println(itr.next()); }
		 * 
		 * Iterator<Integer> itr1 = names.keySet().iterator();
		 * 
		 * while (itr1.hasNext()) { Integer key = itr1.next();
		 * 
		 * String value = names.get(key); System.out.println(value); }
		 * 
		 * Iterator<String> itr2 = names.values().iterator(); while (itr2.hasNext()) {
		 * System.out.println(itr2.next()); }
		 */
		
		Set<Integer> keys = names.keySet();
		
		for (Integer i:keys) {
			System.out.println(names.get(i));
		}

	}

}
