package String_TekPyramid;

public class ReverseTheLetterInSentence {

	public static void main(String[] args) {
		
		String s="welcome to hello world";
		String[] sp=s.split(" ");
		String s1="";
		for(int i=sp.length-1;i>=0;i--) {
			s1+=sp[i]+" ";
			
		}
		System.out.println(s1);
	}

}
