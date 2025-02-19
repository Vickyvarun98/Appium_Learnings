package String;

public class ConsonantsVowelsNumbersCharInString {

	public static void main(String[] args) {
		String a = "Vigneshwaran@123";
		String s = a.toLowerCase();
		int vow = 0, con = 0, num = 0, ch = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				num++;
			}
			else if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vow++;
				} else {
					con++;
				}
			}
			else {
				ch++;
			}

		}
			System.out.println(num);
			System.out.println(vow);
			System.out.println(con);
			System.out.println(ch);
	}

}
