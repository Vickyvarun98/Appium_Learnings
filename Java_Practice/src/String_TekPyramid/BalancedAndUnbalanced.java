package String_TekPyramid;
import java.util.*;

public class BalancedAndUnbalanced {

	public static void main(String[] args) {
		 String s="([{}])";
	        ArrayList<Character> list=new ArrayList<>();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(list.size()!=0 &&( (ch=='}' && list.get(list.size()-1)=='{')||(ch==']' && list.get(list.size()-1)=='[')||(ch==')' && list.get(list.size()-1)=='(')))
	            {
	                list.remove(list.size()-1);
	            }else{
	                list.add(ch);
	            }
	        }
	        if(list.isEmpty()){
	            System.out.println("Balanced");
	        }else{
	            System.out.println("UnBalanced");
	            System.out.println(list);
	        }

	}

}
