package String_TekPyramid;

public class LeftShiftingOfString {

	public static void main(String[] args) {

		String s = "Hii Welcome to the world";
		String[] sp = s.split(" ");
		
		int count = 5;
		for (int j = 0; j < count; j++) {
			String temp = sp[0];
			for (int i = 0; i < sp.length - 1; i++) {
				sp[i] = sp[i + 1];

			}
			sp[sp.length - 1] = temp;
			for (String s1 : sp) {
				System.out.print(s1 + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
