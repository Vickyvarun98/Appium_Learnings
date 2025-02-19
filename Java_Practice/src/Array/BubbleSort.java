package Array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 20, 50, 2, 4, 5, 9 };
		for (int i = 0; i < a.length; i++) {  //No .of iterations
			for (int j = 0; j < a.length - 1; j++) { //compare the values
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for(int s:a) {
			System.out.print(s+" ");
		}
		

	}

}
