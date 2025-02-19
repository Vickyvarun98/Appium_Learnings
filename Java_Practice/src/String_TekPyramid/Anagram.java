package String_TekPyramid;

import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Race";
		String b = "Care";

		if (a.length() == b.length()) {
			char[] c = a.toLowerCase().toCharArray();
			char[] d = b.toLowerCase().toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			a = new String(c);
			b = new String(d);

			if (a.equals(b)) {
				System.out.println("This is an Anagram");
			} else {
				System.out.println("This is not an Anagram");
			}
		} else {
			System.out.println("This is not an Anagram");
		}
	}

}
