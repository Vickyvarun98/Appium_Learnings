package OOPS;

class Animal {
	public void animal() {
		System.out.println("Animals are two kinds");
		System.out.println("1.Wild Animal");
		System.out.println("2.Pet Animal");
	}
}

class Tiger extends Animal {
	public void tiger() {
		System.out.println("Tiger is a Wild Animal");
	}
}

class Dog extends Animal {
	public void dog() {
		System.out.println("Dog is a Pet Animal");
	}
}

public class HieraricalInheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.animal();
		d.dog();
		System.out.println("--------------------------------------");
		Tiger t = new Tiger();
		t.animal();
		t.tiger();
	}
}
