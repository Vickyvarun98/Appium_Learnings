package String;

public final class Rearrangement {

	public static void main(String[] args) {
		String s = "a1b2c3d4e5";
		rearrangement(s);
	}

	public static void rearrangement(String s) {
		String alp = "";
		String num = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				num += ch;

			}
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				alp += ch;
			}
		}
		System.out.println("The arrangement of " + s + " is " + alp + num);
	}

}
