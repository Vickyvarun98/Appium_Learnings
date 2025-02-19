package String_TekPyramid;

public class RightShiftingOfString {

	public static void main(String[] args) {

		String s = "Hii welcome to the world";
		String[] sp = s.split(" ");

		int count = 1;
		for (int j = 0; j < count; j++) {
			String temp = sp[sp.length - 1];
			for (int i = sp.length - 1; i > 0; i--) {
				sp[i] = sp[i - 1];
			}
			sp[0] = temp;

			for (String s1 : sp) {
				System.out.print(s1 + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
