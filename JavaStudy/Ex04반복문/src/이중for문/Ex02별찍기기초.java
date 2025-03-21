package 이중for문;

public class Ex02별찍기기초 {

	public static void main(String[] args) {
		
		// ***** 출력
//		for(int i = 0; i<5; i++)
//		{
//			System.out.print("*");
//		}
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
//		for(int i = 0; i<5; i++)
//		{
//			for(int j = 0; j<5; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
		
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
