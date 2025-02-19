package Array;

public class ReverseOfArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = new int[a.length];
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			//System.out.println("Enter the " + (i + 1) + " value");
			b[j] = a[i];
		}
		System.out.println("The Reverse of an array is ");
		for (int a1 : b) {
			System.out.print(a1 + " ");
		}
	}
}
