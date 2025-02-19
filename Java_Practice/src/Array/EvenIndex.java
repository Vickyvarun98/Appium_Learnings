package Array;

import java.util.Scanner;

public class EvenIndex {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the range of the array");
		int a[]=new int[s.nextInt()];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter the "+(i+1)+" Element");
			a[i]=s.nextInt();
		}
		for (int j=0;j<a.length;j++)
		{
			if (j%2==0)
			{
				System.out.println(a[j]);
			}
		}

	}

}
