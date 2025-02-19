package String;

import java.util.Scanner;

public class MaximumWord {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the data");
		String a=s.nextLine();
		maximum(a);

	}
	public static void maximum(String s) {
		String s1[]=s.split(" ");
		String max=s1[0];
		for (int i=0;i<s1.length;i++) {
			String word=s1[i];
			if (word.length()>max.length()) {
				max=word;
			}
		}
		System.out.println("The maximum word in present in String is "+max);
	}

}
