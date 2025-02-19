package String;

import java.util.*;

public class CheckStringIsPresentOrNotUsingAnagram {
	
	public static void main(String[] args) {
		String a = "frolkhmrfrogfderfo";
		String b = "For";
		char[] c = b.toLowerCase().toCharArray();
		Arrays.sort(c);
		int count = 0;
		for (int i = 0; i < a.length() - 2; i++) {

			String s = a.substring(i, i + 3);
			char[] d = s.toLowerCase().toCharArray();

			Arrays.sort(d);
			String k = new String(d);
			b = new String(c);
			if (k.equals(b)) {
				count++;
			}

		}
		System.out.println(b + "-----" + count);

	}

}
