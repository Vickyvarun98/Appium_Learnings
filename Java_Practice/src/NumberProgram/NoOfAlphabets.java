package NumberProgram;

public class NoOfAlphabets {

	public static void main(String[] args) {
		String s="aabbbccccddddd";
		int a=0,b=0,c=0,d=0;
		for(int i=0;i<s.length();i++)
		{
			char f = s.charAt(i);
			if(f=='a') {
				a++;
			}
			else if (f=='b') {
				b++;
			} 
			else if (f=='c') {
				c++;
			}
			else if (f=='d') {
				d++;
			}
		}
		System.out.print( a+"a"+b+"b"+c+"c"+d+"d");

	}

}
