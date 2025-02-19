package Array_TekPyramid;

import java.util.Arrays;

public class ShiftZerosToLeftSide {
	public static void main(String[] args) {
	int []a= {2,3,4,5,0,5,1,0,6};
	int [] result=new int[a.length];
	int last=result.length-1;
	for(int i=a.length-1;i>=0;i--) {
		
		if(a[i]!=0) {
			result[last]=a[i];
			last--;
		}
		
	}
//	for(int i=0;i<a.length;i++) {
//		System.out.print(result[i]+",");
//		
//	}
	System.out.println(Arrays.toString(result));
}
	

}
