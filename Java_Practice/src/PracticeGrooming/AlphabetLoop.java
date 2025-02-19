package PracticeGrooming;

import java.util.Scanner;

public class AlphabetLoop {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no.of rows & column");
		int a=s.nextInt();
		//System.out.println("Enter the Alphabet");
		//char c = s.next().charAt(0);
		for (int i=0;i<=a;i++) {
			char c = 'a';
			for (int j=0;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
	
			System.out.println();
		}	
	}

}
