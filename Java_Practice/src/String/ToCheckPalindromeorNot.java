package String;

import java.util.Scanner;

public class ToCheckPalindromeorNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE WORD");
		String s1=s.next();
		
		String rev="";
		for (int i=s1.length()-1;i>=0;i--)
		{
			rev+=s1.charAt(i);
		}
		System.out.println(rev);
		if (rev.equals(s1)) {
			System.out.println("This is a PALINDROME");
		}
		else {
			System.out.println("This is not a PALINDROME");
		}
			}

}
