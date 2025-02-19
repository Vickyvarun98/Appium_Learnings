package prac;

import java.util.ArrayList;


public class BalancedOrUnbalanced {

	public static void main(String[] args) {
		String s="{[()]}";
		ArrayList <Character>arr=new ArrayList<Character>();
		int size=arr.size();
		for(int i=0;i<s.length();i++) {
				char c=s.charAt(i);
				if(size!=0 &&(c==')' && arr.get(arr.size()-1)=='(')||(c==']' && arr.get(arr.size()-1)=='[')||(c=='}' && arr.get(arr.size()-1)=='{')) {
					arr.remove(size-1);
				}else {
					arr.add(c);
				}
		}
		if(size==0) {
			System.out.println("Balanced");
		}else {
			System.out.println("Unbalanced");
		}
	}

}
