package String_TekPyramid;

public class ReverseWIthoutReversingSpace {

public static void main(String[] args) {
	String s="I LOVE INDIA";
	System.out.println(s);
	String s1=s.replace(" ","");
	System.out.println(s1);
	int index=s1.length()-1;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			System.out.print(" ");
		}else {
			System.out.print(s1.charAt(index--));
		}
	}
			
}
}
