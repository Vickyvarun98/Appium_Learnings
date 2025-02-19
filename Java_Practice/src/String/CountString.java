package String;

public class CountString {

	public static void main(String[] args) {
		String s = "Hii Hi Hi Hii Hii Good Morning";
		CountString.count(s);

	}

	public static void count(String s) {

		String[] s1 = s.split(" ");
		String target = "hi";
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			if (target.equalsIgnoreCase(s1[i])) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("The string " + target + " present in " + s + " is " + count);
		} else {
			System.out.println("The string is not present....");
		}

	}

}
