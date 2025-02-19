package String_TekPyramid;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		String s="ramanar";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if (s.indexOf(ch) != s.lastIndexOf(ch) && i== s.indexOf(ch)) {
				System.out.print(ch);
			}
			
		}

	}

}
