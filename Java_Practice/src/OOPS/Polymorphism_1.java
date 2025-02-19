package OOPS;

class A {
	public  void m1() {
		System.out.println("Class A is executing...");
	}
}
class B extends A {
	public  void m1() {
		System.out.println("Class B is executing...");
	}
}

public class Polymorphism_1 {
	public static void main(String[] args) {

		A a = new B();
		//B b=(B)a;
		a.m1();
		// B b= new B();
		//	A a=new B();
		//B b = new B();
		//b.m1();
		//B c = (B) a;
		//c.m1();
		//c.m1();
	}
}
