package String;

import java.util.Scanner;

public class MinimumWord {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the data");
		String a=s.nextLine();
		minimum(a);
	}
	public static void minimum(String a) {
		String s1[]=a.split(" ");
		String min=s1[0];
		for (int i=0;i<s1.length;i++) {
			String word=s1[i];
			if(word.length()<min.length()) {
				min=word;
			}
		}
		System.out.println("The minimum word in present in String is "+min);
	
	}

}
