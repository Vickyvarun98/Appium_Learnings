package String;

public class ConvertString {

	public static void main(String[] args) {
		char []a= {'a','b','c','d','e'};
		String s="";
		for (int i=0;i<a.length;i++)
		{
			s+=a[i];
		}
			System.out.println(s);
			String s1=new String(a);
			System.out.println(s1);
	}

}