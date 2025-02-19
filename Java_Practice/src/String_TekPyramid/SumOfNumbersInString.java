package String_TekPyramid;

public class SumOfNumbersInString {

	public static void main(String[] args) {

		String s = "a1b34%c5%";
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i) - 48;
			if (ch>=0 && ch<=9) {
				num+=ch;
			}
		}
		System.out.println("The sum of numbers in String is "+num);
	}

}
