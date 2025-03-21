package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {
		// [예제2]
		// 사용자의 입력값에서 홀수, 짝수 갯수를 세는 프로그램
		// -1을 입력하면 프로그램 종료
		// ★입력값을 판별
		// -> 홀수라면, 홀수카운트+1, 짝수라면 짝수카운트+1
		// ----> 홀수 셀 수 있는 변수, 짝수 셀 수 있는 변수가 필요함!!

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int j = 0;
		int h = 0;

		while (input != -1) {
			
			if (input % 2 == 0) 
			{
				j++;
			}else 
			{
				h++;
			}
			
			System.out.println("짝수 개수 : " + j);
			System.out.println("홀수 개수 : " + h);

			System.out.print("정수 입력 : ");
			input = sc.nextInt();

		}
		System.out.println("종료되었습니다.");
	}

}
