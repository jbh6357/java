package ifElse문;

import java.util.Scanner;

public class Ex02ifElse예제 {

	public static void main(String[] args) {
		// 입장료 : 5000
		
		int ticket = 5000;
		double discount_rate = 0.5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("인원수를 입력하세요 : ");
		int num_people = sc.nextInt();
		
		if (age < 20) {
			System.out.println("입장료는 " + (int)(ticket*num_people*discount_rate) + "입니다");
		} else {
			System.out.println("입장료는 " + ticket*num_people + "입니다");
		}

	}

}
