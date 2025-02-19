package String;

public class ConvertCase {

	public static void main(String[] args) {
		String a="lIFe Is nOt EaSy";
		System.out.println(convertCase(a));
		String res=convertCase("jAvA");
		System.out.println(res);
	}
		
	public static String convertCase(String a) {
		String a1="";
		for (int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c>='a'&& c<='z')
			{
				c=(char)(c-32);
			}
			else if (c>='A'&& c<='Z')
			{
				c=(char)(c+32);
			}
			a1+=c;
		}
			return a1;
	}
	

}
