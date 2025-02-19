package String;

public class CheckTheOccurenceOfChar {

	public static void main(String[] args) {
		String s="javacs";
		String s1="jbcdabamvdfdgga";
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int count=0;
			if(s2.indexOf(c)==-1) {
			s2+=s.charAt(i);
			for(int j=0;j<s1.length();j++) {
				char d=s1.charAt(j);
				if (c==d) {
					count++;
				}
	
			}			
		}
			System.out.println(c+"---->"+count);
		}
	}

}
