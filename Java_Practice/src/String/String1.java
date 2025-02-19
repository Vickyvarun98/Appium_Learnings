package String;

public class String1 {

	public static void main(String[] args) {
		String s1 = "Happy";//normal
		String s2 = new String("Happy");//string
		System.out.println(s1 == s2);//compare address
		System.out.println(s1.equals(s2));//compare data
		char[] a = { 'b', 'c', 'd', 'e', 'f', 'g' };//convert char into string
		String s3 = new String(a );
		System.out.println(s3);
		byte b[] = { 97, 98, 99, 100, 101, 102, 103 };//convert byte into string
		String s4 = new String(b);
		System.out.println(s4);

	}

}
