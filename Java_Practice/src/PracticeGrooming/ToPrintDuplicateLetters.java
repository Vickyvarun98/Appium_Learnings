package PracticeGrooming;

public class ToPrintDuplicateLetters {

	public static void main(String[] args) {
		String s="apple";
		String s1="";
		for(int i=0;i<s.length();i++) {
			int count=1;
			char c=s.charAt(i);
			if(s1.indexOf(c)==-1) {
				for(int j=i+1;j<s.length();j++) {
					char ch=s.charAt(j);
					if(c==ch) {
						count++;
					}
				}
				s1=s1+c;
				if (count>1) {
					System.out.println(c);
				}
			}
		}

	}

}
