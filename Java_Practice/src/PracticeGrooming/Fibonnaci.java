package PracticeGrooming;

public class Fibonnaci {

	public static void main(String[] args) {
		fibonacci(5);

	}
	public static void fibonacci(int f) {
		 
		int a=0,b=1,c=0;
		for (int i=0;i<f;i++) {
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
		}
		
	}
}
