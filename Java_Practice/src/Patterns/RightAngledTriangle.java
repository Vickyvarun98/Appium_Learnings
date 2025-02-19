package Patterns;

public class RightAngledTriangle {

	public static void main(String[] args) {
		int count=4;
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				if(i>=j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
