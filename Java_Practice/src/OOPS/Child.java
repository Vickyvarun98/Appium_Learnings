package OOPS;

public class Child extends Parent {
	
	
	int j;
	Child(){}
	Child(int i,int j){
		super(i);
		this.j=j;
	}

	public static void main(String[] args) {
		Child c=new Child(10,20);
		System.out.println(c.i);
		System.out.println(c.j);

	}

}
