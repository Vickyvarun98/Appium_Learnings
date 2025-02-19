package String_TekPyramid;


import java.util.LinkedHashMap;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		String s = "java is a programming language";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		System.out.println(map);
	}
}
