package 문제풀기;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex00문제풀기1 {

	public static void main(String[] args) {
		//만나이 구하기
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		int currentYear = now.getYear();
		int currentMonth = now.getMonthValue();
		int currentDay = now.getDayOfMonth();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 :");
		int year = sc.nextInt();
		System.out.print("월 :");
		int month = sc.nextInt();
		System.out.print("일 :");
		int day = sc.nextInt();
		 
		int answer = currentYear-year-1;
		
		if(currentMonth > month )
		{	
			answer++;
		}else if(currentDay >= day)
		{
			answer++;
		}
		
		System.out.println("만 " + answer + "세");
		
	}

}
