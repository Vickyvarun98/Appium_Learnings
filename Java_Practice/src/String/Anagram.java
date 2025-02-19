package String;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "pot";
		String s2 = "top";
		anagram(s1, s2);
	}

	public static void anagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			System.out.println("This is not an Anagram....");
		} else {
			int num1 = 0, num2 = 0;
			for (int i = 0; i < s1.length(); i++) {
				char ch = s1.charAt(i);
				num1 += ch;
			}
			for (int i = 0; i < s2.length(); i++) {
				char ch = s2.charAt(i);
				num2 += ch;
			}
			if (num1 == num2) {
				System.out.println("This is an Anagram....");
				System.out.println(num1);
				System.out.println(num2);
			} else {
				System.out.println("This is not an Anagram....");
			}
		}
	}

}
