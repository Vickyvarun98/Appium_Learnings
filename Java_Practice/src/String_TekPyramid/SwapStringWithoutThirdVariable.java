package String_TekPyramid;

public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		String d1="java";
		String d2="api";
		System.out.println("Before Swapping");
		System.out.println(d1+"  "+d2);
		d1=d1+d2;
		d2=d1.substring(0, d1.length()-d2.length());
		d1=d1.substring(d2.length());
		System.out.println();
		System.out.println("After Swapping");
		System.out.println(d1+"  "+d2);
		
		
		
	}

}
