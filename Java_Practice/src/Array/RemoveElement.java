package Array;

public class RemoveElement {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 7, 2, 9, 12, 11, 32 };
		int key = 11;

		arr = remove(key, arr);

		for (int a1 : arr) {
			System.out.print(a1+" ");
		}

	}

	public static int[] remove(int key, int[] a) {
		int b[] = new int[a.length - 1];
		boolean flag = true;
		for (int i = 0, j = 0; i < b.length; i++) {
			if (key != a[i] && flag) {
				b[i] = a[i];
			} else {
				flag = false;
				if (j < a.length) {
					j = i + 1;
					b[i] = a[j];
					j++;
				}
			}
		}

		return b;

	}
}
