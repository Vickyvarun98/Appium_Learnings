package String_TekPyramid;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String s="raman";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
		if (s.indexOf(ch)==s.lastIndexOf(ch)) {
			System.out.print(ch);
		}
		}

	}

}
