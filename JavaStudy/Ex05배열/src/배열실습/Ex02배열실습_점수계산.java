package 배열실습;

import java.util.Scanner;

public class Ex02배열실습_점수계산 {

	public static void main(String[] args) {
		// [실습] 점수계산
		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array 만들기
		// 2. 반복해서 사용자에게 값을 입력받고,
		// 바로 배열의 인덱스에 차례대로 저장

		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.print("입력된 점수 : ");
		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1) {
				System.out.print(a[i] + ", ");
			} else {
				System.out.println(a[i]);
			}

		}

		// array를 돌면서, 최고/최저/총합/평균을 계산하고,
		// for문이 종료된 이후에 4개 결과를 출력

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
			sum += a[i];
		}

		avg = sum / (double) a.length;

		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 점수 : " + sum);
		System.out.println("평균 점수 : " + avg);

		

	}

}
