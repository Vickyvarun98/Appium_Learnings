package PracticeGrooming;

public class Reverse {

	public static void main(String[] args) {
		String s = "Welcome to the world";
		String[] s1 = s.split(" ");
		String s2 = "";
		for (int i = s1.length - 1; i >= 0; i--) {
			s2 = s2 + s1[i] + " ";
		}
		System.out.println(s);
		System.out.print(s2);
		String s4 = "";
		for (int j = s2.length() - 1; j >= 0; j--) {
			char s3 = s2.charAt(j);
			s4 += s3;
		}
		//System.out.println();
		System.out.print(s4.trim());
	}

}
