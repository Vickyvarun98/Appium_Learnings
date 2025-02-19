package OOPS;


class Booking
{
	String PassengerName;
	int age;
	String Aadhar;
	String PanNumber;
	String Sources;
	String Destinations;
	Booking(String PassengerName)
	{
		
		this.PassengerName=PassengerName;
	}
	Booking (String PassengerName,int age)
	{
		this(PassengerName);
		this.age=age;
	}
	Booking(String PassengerName,int age,String Aadhar)
	{
		this(PassengerName,age);
		this.Aadhar=Aadhar;
	}
	Booking(String PassengerName,int age,String Aadhar,String PanNumber)
	{	
		this(PassengerName,age,Aadhar);
		this.PanNumber=PanNumber;
	}
	Booking(String PassengerName,int age,String Aadhar,String PanNumber,String Sources)
	{
		this(PassengerName,age,Aadhar,PanNumber);
		this.Sources=Sources;		
	}
	Booking(String PassengerName,int age,String Aadhar,String PanNumber,String Sources,String Destinations)
	{
		this(PassengerName,age,Aadhar,PanNumber,Sources);
		this.Destinations=Destinations;
	}
	Booking()
	{
		this("Vignesh",25,"656753623643","BJPPV665M","BANGLORE","CHENNAI");//Default Passenger
		System.out.println();
	}
	public void display()
	{
		System.out.println("Passenger Name :"+PassengerName+"\n"+"Age :"+age+"\n"+"Aadhar Number :"+Aadhar+"\n"+"Pan Number :"+PanNumber+"\n"+"Source :"+Sources+"\n"+"Destination :"+Destinations);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		System.out.println("Welcome to Booking");
		
		Booking B1=new Booking();
		B1.display();
		System.out.println("=================================");
		Booking B2=new Booking("Ragul",29,"876754367421","BJPYS986M","BANGLORE","OOTY");
		B2.display();

	}

}
