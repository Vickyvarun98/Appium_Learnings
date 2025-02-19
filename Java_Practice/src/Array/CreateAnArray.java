package Array;

import java.util.Scanner;

public class CreateAnArray {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the no.of rows & column");
		int [][]a=new int[s.nextInt()][s.nextInt()];
		System.out.println("Enter the indexes");
		for (int i=0;i<a.length;i++) {
			System.out.println("Enter the "+(i+1)+" row");
			for (int j=0;j<a[i].length;j++) {
				a[i][j]=s.nextInt();
			}
		}
		
	/*	for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
		for(int a1[]:a) {
			for(int b:a1) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	for (int i=0;i<a.length;i++) {
		for (int j=0;j<a[i].length;j++) {
			System.out.print(a[j][i]+" ");
		
	}
		System.out.println();
	}
	}

}
