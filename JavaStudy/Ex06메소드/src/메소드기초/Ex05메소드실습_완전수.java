package 메소드기초;

public class Ex05메소드실습_완전수 {

	public static void main(String[] args) {

		int startValue = 2;
		int endValue = 10;
		getPerfectNumber(2, 1000);
	}

	public static void getPerfectNumber(int startValue, int endValue) {
		System.out.print(startValue + "~" + endValue + "까지의 완전수 : ");

		for (int i = startValue; i <= endValue; i++) {
			if (getSumOfDivisors(i) == 2 * i) {
				System.out.print(i + " ");
			}
		}
	}

	public static int getSumOfDivisors(int num) {
		int result = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				result += i;
			}
		}
		result += num;
		return result;
	}


}
