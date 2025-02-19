package Collections_and_Map;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add("Java");
		arr.add(25.00);
		arr.add(true);
		arr.add("[1,2,3,4]");
		arr.add('n');
		arr.add(false);
		System.out.println(arr);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(1);
		a2.add(234);
		a2.addAll(1,arr);
		System.out.println(a2);
		System.out.println(a2.get(2));
		System.out.println(arr.contains("Java"));
		System.out.println(arr.containsAll(a2));
		a2.retainAll(arr);
		System.out.println(a2);
		a2.removeAll(arr);
		System.out.println(a2);
		
		
		
	}
}
