package NumberProgram;

import java.util.Scanner;

public class MaximunNumberInGivenNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		long l=s.nextLong();
		MaximunNumberInGivenNumber max=new MaximunNumberInGivenNumber();
		System.out.println(max.maximumNumber(l));

	}
	public long maximumNumber(long l) {
		long max=l%10;
		while(l>0) {
			long a=l%10;
			if (a>max) {
				max=a;
			}
			l=l/10;
		}
		return max;
	}

}
