package Array_TekPyramid;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3};
		int[] b= {4,5,6,8,9};
		int sum=Math.max(a.length, b.length);
		int[] c=new int[sum];
		for(int i=0;i<c.length;i++) {
			
			if(i<a.length) {
				c[i]+=a[i];
			}
			c[i]+=b[i];
		}
		System.out.println(Arrays.toString(c));
		
	}
}
