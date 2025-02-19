package String;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data");
		String a = s.nextLine();
		swapString(a);
	}

	public static void swapString(String a) {
		String[] s1 = a.split(" ");
		String temp = s1[0];
		s1[0] = s1[s1.length - 1];
		s1[s1.length - 1] = temp;
		String swap = "";
		for (int i = 0; i < s1.length; i++) {
			swap = swap + s1[i] + " ";
		}
		System.out.println();
		System.out.println(swap);
	}
}
