package OOPS;


class Admission{
	
	String name;
	int id;
	long contact;
	String address;
	Admission(){}
	Admission(String name){
		this.name=name;
	}
	Admission(String name,int id){
		this.name=name;
		this.id=id;
	}
	Admission(String name,int id,long contact){
		this.name=name;
		this.id=id;
		this.contact=contact;
	}
	Admission(String name,int id,long contact,String address){
		this.name=name;
		this.id=id;
		this.contact=contact;
		this.address=address;
	}
	public void display() {
		System.out.println("Name : "+name+"\n"+"Admission Number : "+id+"\n"+"Contact Number : "+contact+"\n"+"Address : "+address);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Admission a1=new Admission("Vignesh",420,7397023397l,"Thiruvarur");
		a1.display();
		System.out.println("------------------------");
		Admission a2=new Admission("Ragul");
		a2.display();
		

	}

}
