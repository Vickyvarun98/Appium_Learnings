package PracticeGrooming;

public class ToCountCharacterInString {

	public static void main(String[] args) {
		String s = "java is a programming language122212345443...";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			char ch = s.charAt(i);
			//TO eliminate special characters
				if (s1.indexOf(ch) == -1) {
					if ((ch >= 'a' && ch <= 'z')||(ch>'0'&&ch<='9')) {
					for (int j = i + 1; j < s.length(); j++) {
						char ch1 = s.charAt(j);
						if (ch == ch1) {
							count++;
						}

					}
					s1 = s1 + ch;
					System.out.println(ch + "-->" + count);
				}
			}

		}

	}

}
