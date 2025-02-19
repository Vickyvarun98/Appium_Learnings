package Array_TekPyramid;

public class MaximunAndMinimumNumberInArray {

	public static void main(String[] args) {

		int[] a = { 6, 9, 1,15, 3, 8, 5, 0 };
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
			
			
		}
		System.out.println("The Maximum number in array is "+max);
		System.out.println("The Minimum number in array is "+min);
	}

}
