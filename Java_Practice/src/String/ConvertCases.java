package String;

public class ConvertCases {

	public static void main(String[] args) {
		String a="jAvA Is nOt EaSy";
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
			System.out.println(a1);
	}

} 