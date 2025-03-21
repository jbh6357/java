package while문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {
		// [예제3]
		// 1. 사용자에게 현재 몸무게, 목표 몸무게를 입력받아서 저장
		// 2. 주차별 감량 몸무게를 계~속 입력받기 (1주차~)
		// 3. 종료조건 : 몸무게가 목표 이하가 되었을 때!
		//            --> 종료 후 "축하합니다 !!!" 를 출력하기
		
		
		Scanner sc = new Scanner(System.in);
		
		// 현재 몸무게, 목표 몸무게 입력받아서 저장
		System.out.print("현재 몸무게 :");
		int now = sc.nextInt(); //현재몸무게
		System.out.print("목표 몸무게 :");
		int goal = sc.nextInt(); //목표몸무게
		
		int minus = 0; //주차별 감량 몸무게
		int week = 0;
		int crazy = now + 10;
		
		while(now > goal)
		{	
			// 감량 몸무게 입력받기
			System.out.print(++week + "주차 감량 몸무게 : ");
			minus = sc.nextInt();
			now -= minus;	
			
			if (now >= crazy)
			{
				week = -1;
				break;
			}
		}
		if(week!=-1)
		{
			System.out.println(now + "kg 달성!! 축하합니다!");
		}
		else
		{
			System.out.println(now + "kg 달성!! 당신은 다이어트를 하지 마세요!");
		}
	}

}
