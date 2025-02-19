package Array_TekPyramid;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6,8,9};
		int max=Math.max(a.length, b.length);
		int[] sum=new int[max];
		
		for(int i=0;i<max;i++) {
			if(i<a.length) {
				sum[i]+=a[i];
			}
			if(i<b.length) {
				sum[i]+=b[i];
			}
		}
		System.out.println(Arrays.toString(sum));
	}
}
