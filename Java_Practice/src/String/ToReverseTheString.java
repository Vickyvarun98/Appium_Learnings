package String;

public abstract class ToReverseTheString {
	public static void main(String[] args) {
		String s = "Welcome to the world";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		 System.out.println(s);
		 System.out.println();
		 System.out.println(rev);
		 System.out.println();
		String[] split = rev.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}
	}
}