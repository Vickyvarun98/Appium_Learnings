package PracticeGrooming;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		star1();
		System.out.println();
		star2();
		System.out.println();
		star3();
		System.out.println();
		star4();
		System.out.println();
		star5();
		System.out.println();
		star6();
		System.out.println();
		star7();

	}

	public static void star1() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void star2() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void star3() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}

	public static void star4() {
		int n = 5;
		char ch = 'a';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
			ch++;
		}
	}

	public static void star5()
		{	

			int n=5;	
			for (int i=1;i<=n ;i++ )
			{
				char ch='a';
				for (int j=1;j<=n ;j++ )
				{
					System.out.print(ch+" ");
					ch++;
				}
				System.out.println();
			}
		}
		public static void star6() {
			int n=5;char ch='a';
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
		public static void star7()
		{
			int n=5,a=01;
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=n ;j++ )
				{
					System.out.print(a+" ");
						a++;
				}
				System.out.println();
			}
		}
			
		


	}


