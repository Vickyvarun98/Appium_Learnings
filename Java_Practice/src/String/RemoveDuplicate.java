package String;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String a = "Helllllllo";
//		String b="";
		System.out.println(removeDuplicate(a));
//		System.out.println(a.isEmpty());
//		System.out.println(b.isEmpty());
//		System.out.println(a.toCharArray());
//	//	System.out.println(b.isBlank());
	}

	public static String removeDuplicate(String a) {
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (b.indexOf(c) == -1) {
				b += c;
			}
			//b = b;
		}
		return b;
	}

}
