package Array;

public class MinimumElementInAnArray {

	public static void main(String[] args) {
		int[] a = { 5, 19, 14, 27, 11, 8, 2 };
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("The minimum number in an array is " + min);
	}

}
