package Array;

import java.util.Scanner;

public class EvenElementInAnArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range of index");
		int[] a = new int[s.nextInt()];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + (i + 1) + " value");
			a[i] = s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
