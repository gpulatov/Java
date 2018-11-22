package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		// We will use HashMap on Automation
		// HashMap - fast,unsynchronized, works with single thread, allows one null key
		// HashTable - slow, synchronized, works with multiple thread, does not allow one null key
		// LinkedHashMap - preserves the insertion order
		
		Map map1 = new HashMap();
		
		map1.put("Honda1", "Civic");
		map1.put("Honda2", "Accord");
		map1.put("Honda3", "CR-V");
		map1.put("Honda4", "Odyssey");
		
		System.out.println(map1);
		System.out.println(map1.get("Honda3"));

		Set<String> keys = map1.keySet(); // -> It collects all keys
		for(String key: keys) {
			System.out.println(key +" " +map1.get(key));
		}
	}

}
