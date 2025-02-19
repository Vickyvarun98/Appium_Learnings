package Array;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int[] a = new int[s.nextInt()];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		int S = 0;
		for (int i = 0; i < a.length; i++) {
			S += a[i];
		}
		System.out.println(S);
	}
}
