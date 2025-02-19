package String_TekPyramid;

public class CheckTheStringForPalindrome {

	public static void main(String[] args) {
		String s="MALAYALAM";
		String rev="";
		//String[] sp=s.split("");
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if(rev.equals(s)) 
			System.out.println("The given string is Palindrome");
		else
			System.out.println("The given string is not Palindrome");
		
	}
}
