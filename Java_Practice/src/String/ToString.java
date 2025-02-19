package String;

public class ToString {

	public static void main(String[] args) {
		String s;
		String s1=new String();
		s="Hello";
		String s2= new String("Hello");
		System.out.println(s1);//space
		System.out.println(s);//hello
		System.out.println(s2);//hello
		System.out.println(s==s1);//false-compare the address
		System.out.println(s==s2);//false-compare the address
		System.out.println(s1==s2);//false-compare the address
		System.out.println(s.equals(s1));//false-compare the value
		System.out.println(s.equals(s2));//true-compare the value
		System.out.println(s1.equals(s2));//false-compare the value
	}
}
