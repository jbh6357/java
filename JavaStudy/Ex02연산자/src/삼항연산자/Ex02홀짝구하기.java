package 삼항연산자;

import java.util.Scanner;

public class Ex02홀짝구하기 {

	public static void main(String[] args) {
		
		// 1. 입력도구 꺼내기
		Scanner sc = new Scanner(System.in);
		
		// 2. 정수 입력받아서 저장
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		
		// 3. 입력받은 정수가 홀수인지 짝수인지 판별
		String result = num%2==0 ? "짝수" : "홀수";
		
		// 4. 결과 출력
		System.out.println(num + "은(는)" + result + "입니다.");
		
	}

}
