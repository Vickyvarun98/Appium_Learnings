package Array;

public class RemoveElementFromAnArray {

	public static void main(String[] args) {
		int[] a = { 3, 5, 7, 2};
		int b = 7;
		int[] c = new int[a.length];
		for (int i = 0; i < c.length; i++) {
			if (b != a[i]) {
				c[i] = a[i];
				System.out.println(c[i]);

			} else {
				c[i] = a[i + 1];
				System.out.println(c[i]);
				i = i + 1;
			}
		}

	}
	

}
