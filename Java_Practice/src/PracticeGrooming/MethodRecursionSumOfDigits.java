package PracticeGrooming;

public class MethodRecursionSumOfDigits {

	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(123456));
	}
	public static int sumOfDigits(int a) {
		
		if(a<=9)
			return a;
		return ((a%10)+sumOfDigits(a/10));
		
	}

}
