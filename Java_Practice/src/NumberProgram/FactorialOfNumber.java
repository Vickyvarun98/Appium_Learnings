package NumberProgram;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt(),Fact=1,b=a;
		while(b>0) {
			Fact*=b;
			b--;
		}
		System.out.println("The Factorial of "+a+" is "+Fact);
	}

}
