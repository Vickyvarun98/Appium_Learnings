package String;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		String s = "java is a programming language";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z')){//TO eliminate special characters
				if (s1.indexOf(ch) == -1) {
					s1 = s1 + ch;
					for (int j = i + 1; j < s.length(); j++) {
						char ch1 = s.charAt(j);
						if (ch == ch1) {
							count++;
						}
						
					}
					System.out.println(ch + "-->" + count);
				}
			}

		}

	}

}
