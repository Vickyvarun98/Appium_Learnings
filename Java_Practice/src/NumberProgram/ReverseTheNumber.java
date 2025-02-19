package NumberProgram;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		long l = s.nextLong();
		System.out.println(reverse(l));

	}

	public static String reverse(long l) {
		long n=l;
		long rev=0;
		while(l>0) {
			int r=(int) (l%10);
			rev=(rev*10)+r;
			l=l/10;
		}
		return ("The Reverse of "+n +" is "+rev);
		
		
	}

}
