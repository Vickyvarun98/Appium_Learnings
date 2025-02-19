package NumberProgram;

import java.util.Scanner;

public class ReverseNumberByString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Data");
		String a = s.nextLine();
		System.out.println(reverse(a));

	}
	public static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
		char c= s.charAt(i);
		rev+=c;
		}
		return("The reverse of "+ s+" is "+rev);
	}

}
