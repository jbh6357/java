package 메소드기초;

import java.util.Scanner;

public class Ex03메소드실습_절대값 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("첫번째 정수 입력 : ");
		int num2 = sc.nextInt();
		Math.max(num1,num2);
		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과 확인 : " + result);
	}

	private static int getAbsoluteValue(int num1, int num2) {
		
		int result = num1>num2 ? num1-num2 : num2-num1;
		return result;
	}

}
