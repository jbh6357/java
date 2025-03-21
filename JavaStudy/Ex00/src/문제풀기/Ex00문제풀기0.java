package 문제풀기;

public class Ex00문제풀기0 {

	public static void main(String[] args) {
		
		//[나이 출력]
		// 머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 2025년 기준 선생님의 나이가 age 변수에 저장돼있을때,
		// 선생님의 출생 연도를 출력해주세요  (ex. 30살 선생님 -> 1995년생입니다)
		
		int age = 30;
		int year = 2025;
		
		System.out.println((year-age) + "년생입니다");
		
		//[양꼬치]
		//머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에
		// 12,000원, 음료수는 2,000원입니다. 양꼬치 n인분과 음료수 k개를 먹었다면 총 얼마를 지불해야 하는지 출력해주세요
		// (ex. n이 10인분, k가 3개라면 124,000원)
		
		int n = 10;
		int k = 3;
		int pay;
		
		if(k-n/10>=0)
		{
			pay = n*12000 + (k-n/10)*2000;
		}
		else
		{
			pay = n*12000;
		}
		System.out.println(pay + "원입니다");
		
		
		//[카운트 업]
		//정수 startNum과 endNum이 주어질 때, startNum부터 endNum까지의 숫자를 차례로 출력해보세요(개행 없이 한칸씩 떼어서 출력하기!)
		// startNum이 2, endNum이 7이라면 [2, 3, 4, 5, 6, 7] 이렇게 공백 쉼표 포함해서 출력해보기
		
		int startNum = 2;
		int endNum = 7;
		int num=0;
		
		System.out.print("[");
		
		while(true)
		{
			
			if(startNum == endNum)
			{
				System.out.print(endNum);
				break;
			}
			else {
				System.out.print(startNum++ + ", ");
			}
			
		}
		System.out.print("]");
		
	}

}
