package Array_TekPyramid;

public class MaxAndSecondMaximumNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[]a= {9,8,11,2,3,1,11,9};
		int a[]= {5,3,5,4,5};
		int max=Integer.MIN_VALUE;
		int sec_max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				sec_max=max;
				max=a[i];
			}else if(a[i]>sec_max && a[i]!=max) {
				sec_max=a[i];
			}
			
		}
		System.out.println(max);
		System.out.println(sec_max);

	}

}
