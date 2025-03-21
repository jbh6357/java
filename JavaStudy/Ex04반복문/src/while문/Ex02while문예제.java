package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int result = 0;
		
		while(input != -1)
		{
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			result += input;   
			System.out.println("누적결과 : " + result);
		}
		
		System.out.println("종료되었습니다.");
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		// 사용자 입력값
//		int input = sc.nextInt();
//		System.out.print("사용자의 입력값 : " + input);
//		
//		// 입력값 누적용 변수
//		int sum = 0;
//		
//		while(input != -1) {
//			// 사용자에게 입력받은 값을 누적 저장
//			sum += input;
//			System.out.print("누적값 : " + sum);
//
//			// 입력값이 -1이 아닌 경우에는 다시 입력받기
//			input = sc.nextInt();
//			System.out.print("다시 입력받은 값 : " + input);
//		}
		
	}

}
