package Array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range");
		int[] a = new int[s.nextInt()];
		int sum = 0;
		System.out.println("Enter the value of Index");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <=a[i]; j++) {
				if (a[i] % j == 0)
					count++;
			}
			if (count == 2)
				System.out.println(a[i]);
		}

	}

}
