package Practise_Java_Concepts;

public class PracticeReverse {
	 public static void main(String[] args) {
	       String s="I love Appium";
	       String rev="";
	       for(int i=s.length()-1;i>=0;i--){
	           char c=s.charAt(i);
	           rev+=c;
	       }
	       String[] sp=s.split(" ");
	       String s1="";
	       for (int i=sp.length-1;i>=0;i--){
	           String r=sp[i];
	           s1=s1+r+" ";
	       }
	       String s2="";
	       for(int i=0;i<sp.length;i++){
	         String r=sp[i];
	         for(int j=r.length()-1;j>=0;j--){
	             char c=r.charAt(j);
	             s2=s2+c;
	         }
	         s2+=" ";
	       }
	       System.out.println(s2);
	       System.out.println(rev);
	       System.out.println(s1);
	    }

}
