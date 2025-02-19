package Practise_Java_Concepts;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8};
		int last=a.length-1;
		int[] arr=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				arr[last--]=a[i];
			}
			else
			{
				arr[i]=a[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
