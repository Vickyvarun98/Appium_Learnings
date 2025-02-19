package NumberProgram;

import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		factors(a);
		
	}
	public static void factors(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println("The sum of factors of "+n+" is "+sum);
	}
}
