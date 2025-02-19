package String_TekPyramid;

public class ConvertFirstCharacterToUpperCase {

	public static void main(String[] args) {
		String s="Welcome to the admin world";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String s1=str[i];
			System.out.print(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");
		}

	}

}
