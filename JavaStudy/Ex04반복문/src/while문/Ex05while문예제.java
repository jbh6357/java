package while문;

import java.util.Scanner;

public class Ex05while문예제 {

	public static void main(String[] args) {
		// A,B 입력받아 A-B 출력, A와B 모두 0일 때 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A 입력 : ");
		int a = sc.nextInt();
		System.out.print("B 입력 : ");
		int b = sc.nextInt();	
		
		while(a!=0 || b!=0)
		{			
			System.out.println("A - B : " + (a-b));
			System.out.print("A 입력 : ");
			a = sc.nextInt();
			System.out.print("B 입력 : ");
			b = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
	}

}
