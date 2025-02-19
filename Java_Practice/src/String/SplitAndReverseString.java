package String;

public class SplitAndReverseString {
public static void main(String[] args) {
	String s="I love watching movies";
	String[] s1=s.split(" ");
	String rev="";
	for(int i=0;i<s1.length;i++) {
		
		for(int j=s1[i].length()-1;j>=0;j--) {
			char ch=s1[i].charAt(j);
			rev+=ch;
			
		}
		rev+=" ";
	}
	System.out.println(rev);
}
}
