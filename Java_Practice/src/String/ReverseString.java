package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the data");
		String a=s.nextLine();
		reverse(a);

	}
	public static void reverse(String a)
	{
		String rev = "";
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
		}
		System.out.println(rev);
	}

}
