package String;

public class CheckPalindromeInString {

	public static void main(String[] args) {
		 String s="mom isi isi malayalam level level malayalam";
		 String s3="";
		 String[] sp=s.split(" ");
		 for(int i=0;i<sp.length;i++) {
			 String s1=sp[i];
			 String s2="";
			 int count=1;
			
			 for(int j=s1.length()-1;j>=0;j--) {
				 char c=s1.charAt(j);
				 s2+=c;
			 }
			 if(s1.equals(s2)) {
				 if(s3.indexOf(s1)==-1) {
					 s3+=s1;
			   for(int k=i+1;k<sp.length;k++) {
				   if(s1.equals(sp[k])) {
					   count++;
				   }
			   }
			   }
				 
			 }
			 System.out.println(s1+"----"+count);
		 }

	}

}
