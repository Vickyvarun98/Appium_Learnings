package String_TekPyramid;

public class SwapTheLastAndFirstString {
	
	public static void main(String[] args) {
		String s="welcome to tp world";
		String[] sp=s.split(" ");
		String s1=sp[0];
		String s2=sp[sp.length-1];
		sp[0]=s2;
		sp[sp.length-1]=s1;
		String swap="";
		for(int i=0;i<sp.length;i++) {
			swap+=sp[i]+" ";
		}
		System.out.println(s);
		System.out.println();
		System.out.println(swap);
	}

}
