package NumberProgram;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt(),pro=1,n=a;
		while(n>0)
		{
			int d=n%10;
			pro*=d;
			n/=10;
		}
		System.out.println("The Product of digits of "+a+" is "+pro);
	}

}
