package prac;

interface Karthik {
public void swithOn();
public void Switchoff();
}
class Lights implements Karthik{

	@Override
	public void swithOn() {
		System.out.println("Light is On");
		
	}

	@Override
	public void Switchoff() {
		System.out.println("Light is off");
		
	}
	
}

