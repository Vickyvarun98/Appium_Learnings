package String_TekPyramid;

public class SubStringPalindrome {

	public static void main(String[] args) {
		String s="abaac";
		for(int i=0;i<s.length();i++) {
			for (int j=i+1;j<=s.length();j++) {
				String s1=s.substring(i,j);
				if(isPalindrome(s1)) {
					System.out.print(s1+" ");
				}
			}
		}

	}
	
	public static boolean isPalindrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if (rev.equals(s)) {
			return true;
		}
		else {
			return false;
		}
	}

}
