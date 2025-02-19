package NumberProgram;

public class Casting {

	public static void main(String[] args) {
		int a = 12;// 
		int b = a++;// 12 //13 //14//15
		int c = ++b;// 13
		System.out.println(a);// 13
		System.out.println(b);// 13
		System.out.println(c);// 13
		b++; //13
		System.out.println(b);// 14
		System.out.println(b++);// 14
		System.out.println(b);// 15
	}

}
