package String;

public class SumOfNumberInString {

	public static void main(String[] args) {
		String s="Vicky@1234";
		int num=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				num=num+ch-'0'; // subtract ASCII values (48)
			}
		}
		System.out.println(num);
	}

}
