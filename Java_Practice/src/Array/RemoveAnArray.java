package Array;

import java.util.Scanner;

public class RemoveAnArray {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the range of an array");
		 int[] a = new int[s.nextInt()];
		  for (int i = 0; i < a.length; i++) { System.out.println("Ënter the " + (i +
		  1) + " range"); a[i] = s.nextInt(); }
		  System.out.println("Enter the element to remove"); 
		  int b = s.nextInt();
		  remove(a, b);
	}

	public static void remove(int a[], int b) {
		int[] c = new int[a.length];
		for (int i = 0; i < c.length; i++) {
			if (b != a[i]) {
				c[i] = a[i];
				System.out.print(c[i]+" ");
			} else {
				c[i] = a[i + 1];
				System.out.print(c[i]+" ");
				i = i + 1;
			}
		}
	}
}
