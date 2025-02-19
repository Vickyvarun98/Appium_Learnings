package Array_TekPyramid;

import java.util.Arrays;

public class ArrangeOddAndEvenNumberInArray {

	public static void main(String[] args) {
		int[] a= {7,2,8,1,5,6,14,19};
		int[] b=new int[a.length];
		int odd=0,even=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b[even--]=a[i];
			}else {
				b[odd++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
