package String;

public class CountCaseLetters {

	public static void main(String[] args) {
		String a="jAvA Is nOt EaSy";
		System.out.println("The count of Upper case is "+countUpper(a));
		System.out.println("The count of Lower case is "+countLower(a));
	}
	public static int countUpper(String a)
	{
		int count=0;
		for (int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c>='A'&& c<='Z')
			{
				count++;
			}
		}
		return count;
	}
	public static int countLower(String a)
	{
		int count=0;
		for (int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c>='a'&& c<='z')
			{
				count++;
			}
		}
		return count;
	}

}
