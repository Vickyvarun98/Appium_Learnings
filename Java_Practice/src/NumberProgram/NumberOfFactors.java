package NumberProgram;

import java.util.Scanner;

public class NumberOfFactors {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Number");
			int n=s.nextInt();
			NumberOfFactors Num=new NumberOfFactors();
			Num.factors(n);

	}
	public void factors(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println("The Number of Factors in "+n+" is " +count);
	}

}
