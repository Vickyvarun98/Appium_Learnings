package String;
public class ToconvertByteToString {

	public static void main(String[] args) {
		byte []a= {65,66,67,68,69,70};
		String s="";
		String s1="";
		 for (int i=0;i<a.length;i++)
		 {
			 s=s+a[i];
			 s1=s1+(char)(a[i]);
		 }
		 System.out.println(s);
		 System.out.println(s1);

	}

}
