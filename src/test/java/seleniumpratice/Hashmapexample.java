package seleniumpratice;

import java.util.HashMap;
import java.util.Map;

public class Hashmapexample {
	
	public static void main(String[] args) {
		 // create a HashMap
		  HashMap<Integer, String> languages = new HashMap<>();
	    //LinkedHashMap<Integer, String> languages = new LinkedHashMap<>();
		//TreeMap<Integer, String> languages = new TreeMap<>();
	    languages.put(1, "Java");
	    languages.put(5, "Python");
	    languages.put(8, "JavaScript");
	    languages.put(null, "ABC");
	    languages.put(null, "xyz");
	    languages.put(4, null);
	    languages.put(6, null);
	    
	    System.out.println(languages.get(4)); // o/p-null
	 
	    System.out.println(languages.keySet()); //ll get the key details [null, 1, 4, 5, 6, 8]
	    System.out.println(languages.values()); //will get the values [xyz, Java, null, Python, null, JavaScript]
	    System.out.println(languages.entrySet()); //o/p--[null=xyz, 1=Java, 4=null, 5=Python, 6=null, 8=JavaScript]
	    System.out.println(languages.remove(6)); //o/p--null
	    System.out.println(languages.containsKey(5)); //o/p--true
	    System.out.println(languages.containsKey(10)); //o/p:- false
	    System.out.println(languages.containsValue("xyz")); //o/p--true
	    System.out.println(languages.containsKey("xyzz")); 
	    
	    
        for(Map.Entry<Integer,String>entry : languages.entrySet()) {
       	 System.out.println(entry.getKey() + " is present " + entry.getValue());
        }
	}

}
