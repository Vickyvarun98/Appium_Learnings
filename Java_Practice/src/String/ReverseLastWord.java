package String;

import java.util.Scanner;

public class ReverseLastWord {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the Data");
		//String a = s.nextLine();
		String a="Java is fun";
		String[] s1 = a.split(" ");
		String word = s1[s1.length - 1];
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev += word.charAt(i);
		}
		s1[s1.length - 1] = rev;
		String s2 = "";
		for (int i = 0; i < s1.length; i++) {
			s2 = s2 + s1[i] + " ";
		}
		System.out.println(s2);
	}

}
