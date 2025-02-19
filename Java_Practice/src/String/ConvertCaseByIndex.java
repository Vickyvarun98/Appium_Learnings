package String;

public class ConvertCaseByIndex {

	public static void main(String[] args) {
		String s = "ABCDEFGHIJKL";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (i % 2 == 0) {
				if (ch >= 'a' && ch <= 'z') {
					ch = (char) (ch - 32);
				}
			} 
			else {
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
				}
			}
			res += ch;
		}

		System.out.println(res);
	}

}
