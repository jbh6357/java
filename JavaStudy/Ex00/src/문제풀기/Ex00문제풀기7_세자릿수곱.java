package 문제풀기;

import java.util.Scanner;

public class Ex00문제풀기7_세자릿수곱 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
 		int a = sc.nextInt();
 		System.out.print("두 번째 숫자 입력 >> ");
		int b = sc.nextInt();
		
		print(a,b);
	}

	private static void print(int a, int b) {
		
		int[] num2 = new int[3];
		
		for(int i=0; i<num2.length; i++)
		{
			num2[i] = getDigit(b,i+1);
		}
		System.out.println(a*num2[0]);
		System.out.println(a*num2[1]);
		System.out.println(a*num2[2]);
		System.out.println(a*b);
		
	}
	
	private static int getDigit(int num, int digit) 
	{
	
		digit = (int)Math.pow(10, digit-1);
		int result = num >= digit ? (num % (digit * 10)) / digit : -1;

		return result;
	}

}
