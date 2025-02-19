package String;

public class ToRemoveDuplicateLetter {
	public static void main(String[] args) {
		String s = "java is a programing language";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z')||(ch>'0'&&ch<='9')) {
				if (s1.indexOf(ch) == -1) {
					for (int j = i + 1; j < s.length(); j++) {
						char ch1 = s.charAt(j);
						if (ch == ch1) {
							count++;
						}

					}
					s1 = ch + s1;
					if (count >= 1) {
						System.out.println(ch);
					}
				}
			}

		}

	}

}
