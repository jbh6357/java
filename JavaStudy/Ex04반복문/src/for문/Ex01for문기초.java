package for문;

public class Ex01for문기초 {

	public static void main(String[] args) {
		// for문
		// while문과 달리, 반복 횟수가 정해진 반복문
		
		// 기본 구조	
		// for(초기화구문; 조건식; 반복후작업) {로직}
		// - 초기화구문 : 반복문이 처음 시작될 때 딱 한번만 실행
		// - 조건식 : 반복 조건
		// - 반복후작업 : 로직 반복 후 작업해야 하는 파트
				
		// i가 0부터 5가 되기 전까지
//		for(int i = 0; i<5; i++)
//		{
//			System.out.println(i);
//		}
		
		// 연습1. 96부터 73까지 출력 (반복후작업 포인트)
//		for(int i=96; i>=73; i--)
//		{
//			System.out.print(i + " ");
//		}
		
		// 연습2. 96부터 73까지인데 홀수만 출력 (출력조건 포인트)
		// ==> 각각 for문을 만들어서 풀기!
//		for(int i=96; i>=73; i--)
//		{
//			if(i%2!=0)
//			{
//				System.out.print(i + " ");
//			}
//		}
		
//		int sum = 0;
//		
//		for(int i=1; i<=100; i++)
//		{
//			if(i%2!=0)
//			{
//				System.out.print(i + " ");
//				sum += i;
//			}
//			else {
//				System.out.print(-i + " ");
//				sum -= i;
//			}
//			
//		}
//		System.out.println("\n결과 : " + sum);
		
		int sum = 0;
		int minus = -1;
		for(int i=1; i<101; i++)
		{
			minus *= -1;
			System.out.print(minus*i + " ");
			sum += minus*i;
		}
		System.out.println("\n결과 : " + sum);
		
		
		//삼항연산자 활용도 가능
		
	}

}
