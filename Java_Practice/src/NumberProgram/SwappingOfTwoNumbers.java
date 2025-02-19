package NumberProgram;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		System.out.println("Before Swapping...");
		System.out.println("a "+a);
		System.out.println("b "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println();
		System.out.println("After Swapping.....");
		System.out.println("a "+a);
		System.out.println("b "+b);

	}

}
