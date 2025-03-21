package for문;

import java.util.Scanner;

public class Ex02for문예제 {

	public static void main(String[] args) {
		// 구구단 : 2단 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 입력 : ");
		int dan = sc.nextInt(); //몇단
		System.out.print("어느 수까지 출력 : ");
		int num = sc.nextInt(); //몇까지
		
		// 구구단
		for(int i = 1; i-1<num; i++)
		{	
			System.out.println(dan + "*" + i + "= " + (dan*i));
		}
	}

}
