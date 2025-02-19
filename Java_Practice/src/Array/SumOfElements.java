package Array;
import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		int sum=0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the range of the array");
		int a[]=new int[s.nextInt()];
		System.out.println("Enter the Element");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=s.nextInt();
			sum+=a[i];
			
		}
		System.out.println("The Sum of Element is "+sum);

	}

}
