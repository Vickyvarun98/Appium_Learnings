package String;

public class NumbersPresentInString {

	public static void main(String[] args) {
		String s = "vicky@91234567";
		string(s);

	}

	public static void string(String s) {
		String num = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				num += ch;
			}
		}
		System.out.println("The number present in " + s + " is " + num);
	}
}
