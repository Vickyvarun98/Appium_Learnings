package appiumpack1;


	import com.google.common.collect.ImmutableMap;
	import java.util.HashMap;
	import java.util.Map;
	 
	public class immutableMap {	 
	    // Function to create ImmutableMap from Map
	    public static <K, T> void iMap(Map<K, T> map)
	    {
	        // Create ImmutableMap from Map using copyOf()
	        ImmutableMap<K, T> immutableMap = ImmutableMap.copyOf(map);
	       // immutableMap.put(5, "test");
	        // Print the ImmutableMap
	        System.out.println(immutableMap);
	    }
	    public static void createImmutableMap()
	    {
	        // Create ImmutableMap using of()
	        ImmutableMap<Integer, String> immutableMap = ImmutableMap.of(
	            1, "Geeks",
	            2, "For",
	            3, "Geeks");
	 
	        // Print the ImmutableMap
	        System.out.println(immutableMap);
	    }
	 
	    public static void main(String[] args)
	    {
	        Map<Integer, String> map = new HashMap<Integer, String>();
	        map.put(1, "Sam");
	        map.put(2, "Rodg");
	        map.put(3, "rivan");
	       // iMap(map);
	        map.put(4, "niva");
	       // iMap(map);
	      
	     // non-empty immutable set
	        Map<Integer, String> map1 = Map.of(
	            1, "G",
	            2, "F",
	            3, "K");
	 //map1.put(4, "R");// java.lang.UnsupportedOperationException
	        // Let's print the set
	        System.out.println(map1);
	    }
	}
