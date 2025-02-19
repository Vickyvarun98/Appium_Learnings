package String_TekPyramid;

public class CheckStringIsPresentWithoutContains {
	public static void main(String[] args) {
		String s1="selenium";
		String s2="ium";
		boolean flag=false;
		
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<=s1.length();j++) {
				
				if (s1.substring(i,j).equals(s2)) {
					flag=true;
					System.out.println(s2+" is present in "+s1);
					break;
				}
				System.out.println(s1.substring(i, j));
				
			}
						
		}
		if(!flag) {
			System.out.println(s2+" is not present in "+s1);
		}
	}

}
