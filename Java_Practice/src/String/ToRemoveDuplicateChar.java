package String;


public class ToRemoveDuplicateChar {

	public static void main(String[] args) {
		String a = "java is a programing language";
		// System.out.println(removeduplicate(a));
		removeDuplicate(a);
	}

	public static String removeduplicate(String a) {
		String s = "";

		for (int i = 0; i < a.length(); i++) {
			int count = 1;
			char c = a.charAt(i);
			if (s.indexOf(c) == -1) {
				for (int j = i + 1; j < a.length(); j++) {
					char d = a.charAt(j);
					if (c == d) {
						count++;
					}
				}

				if (count == 1) {
					s = s + c;
				}

			}
		}
		return s;
	}

	public static void removeDuplicate(String s) {

		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int count = 1;
			if (s1.indexOf(c) == -1) {
				for (int j = i + 1; j < s.length(); j++) {
					char d = s.charAt(j);
					if (c == d) {
						count++;
					}
				}
				s1 += c;
				if (count == 1) {
					System.out.print(c);
				}
			}

		}

	}
}