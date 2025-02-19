package Array_TekPyramid;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedIndex {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,1,2,3,3};
		LinkedHashMap<Integer, ArrayList<Integer>> map=new LinkedHashMap();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.get(a[i]).add(i);
			}else {
				map.put(a[i], new ArrayList());
			}
		}
			for(Map.Entry<Integer, ArrayList<Integer>> list:map.entrySet()) {
				if(!list.getValue().isEmpty()) {
					System.out.print(list.getKey()+"---"+list.getValue()+"\n");
					
				}
			}
			
		}
		
		
		
	
}
