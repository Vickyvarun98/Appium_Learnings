package Array;

public class MaximumElementInAnArray {

	public static void main(String[] args) {
		int[] a= {5,19,14,27,11,8,2};
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("The maximum number in an array is "+max);
	}

}
