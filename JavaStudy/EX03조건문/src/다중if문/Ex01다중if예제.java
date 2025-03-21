package 다중if문;

import java.util.Scanner;

public class Ex01다중if예제 {

	public static void main(String[] args) {
		// 다중if문
		
		// if(조건1) {
		//	 조건1이 참일때
		// } else if(조건2) {
		//   조건 2가 참일때
		// } else if(조건3) {
		//   조건 3이 참일때
		// } 조건 1~3 다 거짓일때
		// }
		
		// 성적 산출 프로그램
		// 90 이상 A
		// 80 이상 90 미만 B
		// 70 이상 80 미만 C
		// 70미만(나머지) D
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >> ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점입니다.");
		}else if(score >= 80) {
			System.out.println("B학점입니다.");
		}else if(score >= 70) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("D학점입니다.");
		}

	}

}
