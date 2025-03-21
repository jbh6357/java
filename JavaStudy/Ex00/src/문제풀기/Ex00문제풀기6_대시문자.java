package 문제풀기;

import java.util.Scanner;

public class Ex00문제풀기6_대시문자 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);

		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();

		System.out.println("대시('-')의 총 합 >> " + sumDash(num));
	}

	private static int sumDash(int num) {

		int digit = 1;
		int sum = 0;
		int flag = getDigit(num, digit);
	
		while (flag!=-1) {
			
			switch (flag) {
			case 1:
				sum += 2;
				break;
			case 7:
				sum += 3;
				break;
			case 4:
				sum += 4;
				break;
			case 2, 3, 5:
				sum += 5;
				break;
			case 0, 6, 9:
				sum += 6;
				break;
			case 8:
				sum += 7;
				break;
			default :
				break;
			}
			digit++;
			flag = getDigit(num, digit);
		}
		
		return sum;
	}

	private static int getDigit(int num, int digit) {
		digit = (int)Math.pow(10, digit-1);
		int result = num >= digit ? (num % (digit * 10)) / digit : -1;

		return result;
	}

}
