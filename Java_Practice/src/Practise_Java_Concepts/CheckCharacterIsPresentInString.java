package Practise_Java_Concepts;

import java.util.Scanner;

public class CheckCharacterIsPresentInString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=s.nextLine();
		System.out.println("Enter the Character");
		char c=s.next().charAt(0);
		int search=CheckCharInString(s1, c);
		if(search !=-1) {
			System.out.println("The character is present");
			System.out.println("The index of character is "+search);
		}else {
			System.out.println("The character is not Present");
		}
		String out = checkCharInString(s1, c);
		System.out.println(out);

	}
	
	public static int CheckCharInString(String s,char c) {
		int value = -1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				value= i;
				break;
			}
	}
		return value;
	}
	
	public static String checkCharInString(String a,char c) {
	        boolean flag=false;
	        for(int i=0;i<a.length();i++){
	            if(c==a.charAt(i)){
	                flag=true;
	                break;
	            }
	            
	        }
	        if(flag==true){
	                return (c+" character is present");
	            }else{
	                return (c+" character is not present");
	            }
	}
}
