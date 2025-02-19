package NumberProgram;
import java.util.Scanner;

public class ToCountNumberOfFactors {

	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number");
			int a=s.nextInt();
			count(a);
			
		}
		public static void count(int n) {
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			System.out.println("The Count of factors of "+n+" is "+count);
		}

	}


