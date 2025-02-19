package OOPS;

class GrandFather {
	public void grandFather() {
		System.out.println("GrandFather is called by his GrandSon");
	}
}

class Father extends GrandFather {
	public void father() {
		System.out.println("Father is called by his Son");
	}
}

class Son extends Father {
	public void son() {
		System.out.println("Son is calling");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Son s = new Son();
		s.grandFather();
		System.out.println("-------------------------------------");
		s.father();

	}

}
