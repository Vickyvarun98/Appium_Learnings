package String;

//import java.util.Scanner;

public class CountTargetLetterInString {

	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the data");
		// String s=sc.nextLine();
		String s = "vigneshwaran";
		char Target = 'a';
		int count = 0;
		// String[] s1 = s.split(" ");

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Target == ch) {
				count++;
			}

		}
		if (count != 0) {
			System.out.println("The letter " + Target + " present in the string " + s + " is " + count);
		} else {
			System.out.println("The letter is not Present in the string");
		}

	}

}
