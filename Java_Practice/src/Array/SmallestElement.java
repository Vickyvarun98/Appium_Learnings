package Array;
public class SmallestElement {

	public static void main(String[] args) {
		int [] a= {9,3,2,7,8,2,1};
		int min=a[0];
		for (int i=0;i<a.length;i++)
		{
			if (min>a[i])
			{
				min=a[i];
			}
	
		}
		System.out.println(min+" is the minimum element of an array");

	}

}