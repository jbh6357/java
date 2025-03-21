package 이중for문;

import java.util.Scanner;

public class Ex03역별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
//		이지
//		Scanner sc = new Scanner(System.in);
//		System.out.println("행 갯수 입력 : ");
//		int a = sc.nextInt();
//		
//		for(int i = 0; i<a; i++)
//		{
//			for(int j = a; j>i; j--)
//			{
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
		
		
		
		//노멀
//		for(int i = 0; i<5; i++)
//		{
//			for(int j = 4; j>i; j--)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int j = 0; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//쌤풀이
//		for(int i = 0; i<5; i++)
//		{
//			for(int j = 0; j<4-i; j++) 
//			{
//				System.out.print(" ");
//			}
//			
//			for(int j = 0; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//번외
//		Scanner sc = new Scanner(System.in);
//		System.out.print("n 입력 :");
//		int n = sc.nextInt();
//		int k = 1;
//		
//		for(int i = 1; i<=n; i++)
//		{
//			k += (i-1);
//			System.out.print(k+" ");
//		}
		
		//[프로그래머스]
		// 1. 입문 - 세균 증식
		// 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 변수로 주어질 때 
		// t시간 후 세균의 수를 출력하세요 (n이 2, t가 10이라면, 결과는 2048)
		
//		int n = 2;
//		int t= 10;
//		int answer = n;
//		for(int i = 1; i<=t; i++)
//		{
//			answer *=2;
//		}
//		System.out.println(answer);
			
			
		//2. 입문 - 개미 군단
		// 개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
	    // 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
	     //예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 
	     //장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
		// 사냥감의 체력 hp가 변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 출력하세요
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("hp : ");
//		int hp = sc.nextInt();
//		
//	    int num = 0;	
//	    
//		for(int i=5; i>=1; i--)
//		{
//			if(hp/i!=0)
//			{
//				num += hp/i;
//				hp = hp%i;
//			}
//			if (hp==0)
//			{
//				break;
//			}
//			i--;
//		}
//		System.out.println(num);
		
	}

}
