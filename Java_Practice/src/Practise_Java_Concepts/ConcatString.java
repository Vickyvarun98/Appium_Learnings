package Practise_Java_Concepts;

/**
 * @author vino
 * 
 */
public class ConcatString {

	public static void main(String[] args) {
		String s="java";
		String s1="is programming language";
//		ConcatString con=new ConcatString();
//		String concat = con.concat(s, s1);
		String concat = s.concat(s1);
		System.out.println(concat);
	
	}
	public String concat(String s1,String s2) {
		String res=s1+' '+s2;
		
		return res;
	}

}
