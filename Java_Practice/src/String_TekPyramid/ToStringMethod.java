package String_TekPyramid;

public class ToStringMethod {
	String brand;
	int price;

		
		ToStringMethod()
		{}
		ToStringMethod(String brand,int price)
		{
			this.brand=brand;
			this.price=price;
		}
		public String toString() {
			return "Brand "+this.brand + "\n" +"Price "+this.price;
		}
		public static void main(String[] args) {
			ToStringMethod m1=new ToStringMethod("POCO",25000);
			System.out.println(m1);
		}
	}

