package String_TekPyramid;

public class ExpandString {

	public static void main(String[] args) {

		String s="a3b4c2d3a1b1c1d";	
		for(int i=0;i<s.length();i+=2) {
			char ch=s.charAt(i);
			int num=s.charAt(i+1)-48;
			for(int j=1;j<=num;j++) {
				System.out.print(ch);
			}
			
		}
		

	}

}
