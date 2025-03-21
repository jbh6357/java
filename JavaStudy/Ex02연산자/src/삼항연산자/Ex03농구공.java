package 삼항연산자;

import java.util.Scanner;

public class Ex03농구공 {

	public static void main(String[] args) {
		// 한 상자에 농구공 5개까지 담김!

		Scanner sc = new Scanner(System.in);

		System.out.print("농구공의 갯수를 입력하세요 >> ");
		int ball = sc.nextInt();

		// 필요한 상자의 수 구하기
		int result = ball % 5 == 0 ? ball / 5 : ball / 5 + 1;

		System.out.println("필요한 상자의 수 : " + result);

	}

}
