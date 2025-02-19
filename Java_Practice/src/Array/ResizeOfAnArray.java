package Array;


import java.util.Scanner;

public class ResizeOfAnArray {
	static int[] a;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
	     a = new int[s.nextInt()];
		for (int i = 0; i <= a.length; i++) {
			if (i == a.length) {
				System.out.println("Do u want to continue....");
				if (s.next().equalsIgnoreCase("No")) {
					break;
				} else {
					increase();
				}
			}
			System.out.println("Enter the " + (i + 1) + " element");
			a[i] = s.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i<a.length-1) {
				System.out.print(",");
			}
		}

	}

	public static void increase() {
		int[] b = new int[a.length * 2];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		a = b;
	}

}
