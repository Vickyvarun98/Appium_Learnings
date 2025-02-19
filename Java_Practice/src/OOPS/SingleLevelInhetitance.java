package OOPS;

class Parents {
	public void parent() {
		System.out.println("Parent is calling...");
	}
}

class Childs extends Parents {
	public void child() {
		System.out.println("Child is calling...");
	}
}

public class SingleLevelInhetitance {
	public static void main(String[] args) {
		Childs c = new Childs();
		c.parent();
		System.out.println("-----------------------");
		c.child();

	}

}
