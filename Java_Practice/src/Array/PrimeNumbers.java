package Array;

import java.util.Scanner;

class PrimeNumbers 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range of array");
		int a[]=new int [s.nextInt()];
		System.out.println("Enter the Elements");
		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The prime Numbers in Array are ");
		 for(int i=0;i<a.length;i++)
		 {
			 int count=0;
			 for (int j=1;j<=a[i];j++)
			 {
				if (a[i]%j==0)
				{
				count++;
				}
			 }
			 if (count==2)
			 {
				 System.out.println(a[i]);
			 }
		 }
	}
		
	}


