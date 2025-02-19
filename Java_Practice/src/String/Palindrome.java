package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the data");
		String S=s.next();
		palindrome(S);

	}
	public static void palindrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
		}
		if (rev.equals(s)) {
			System.out.println("The given String is Palindrome");
		}
		else {
			System.out.println("The given String is not a Palindrome");
		}
	}

}
