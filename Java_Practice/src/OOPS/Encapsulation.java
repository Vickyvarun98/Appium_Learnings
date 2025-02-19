package OOPS;

public class Encapsulation {
	
	private String name;
	private int pin;
	private double balance;
	
	Encapsulation(){}
	Encapsulation(String name,int pin,double balance){
		this.name=name;
		this.pin=pin;
		this.balance=balance;
	}
	public double getbalance(int pin) {
		if (this.pin==pin) {
			return balance;
		}
		return 1.0;
	}
	public void setpin(int oldpin, int newpin) {
		if(this.pin==oldpin) {
			this.pin=newpin;
			System.out.println("The Pin is Updated....");
		}
		else {
			System.out.println("You are entered the invalid Pin...");
		}
	}
	public void display() {
		System.out.println("User name : "+name+'\n'+ "PIN Number : "+pin);
		
		
	}
	

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		System.out.println(e.getbalance(0));//0.0
		e.display();
		e.setpin(0, 123);
		e.display();
		System.out.println();
		System.out.println("====================================");
		
		
		
		
		Encapsulation e1=new Encapsulation("Vignesh",1998,20000.0);
		System.out.println(e1.getbalance(1998));//20000
		e1.display();
		e1.setpin(1998, 2000);
		e1.display();
		
		

	}

}
