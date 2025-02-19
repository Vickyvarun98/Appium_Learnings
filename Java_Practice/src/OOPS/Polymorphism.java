package OOPS;

class ClassA {
	public  String prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return ("A class executing it is prime no");
		} else {
			return ("A class executing not a prime no");
		}

	}
}

class ClassB extends ClassA {
	public  String prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return ("B class executing it is prime no");
		} else {
			return ("B class executing not a prime no");
		}
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		ClassB b1 = new ClassB();
		ClassA a1 = b1;// Upcasting
		ClassB c1 = (ClassB) a1;// Downcasting
		System.out.println(a1.prime(3));
		System.out.println(b1.prime(3));
		System.out.println(c1.prime(3));

	}

}
