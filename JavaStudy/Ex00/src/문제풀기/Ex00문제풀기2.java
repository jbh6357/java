package 문제풀기;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Ex00문제풀기2 {

	public static void main(String[] args) {
		// 
		
		Random ran = new Random();
		
		HashSet<Integer> ranset = new HashSet<Integer>(); 
		
		while(ranset.size()<6) {
			
			ranset.add(ran.nextInt(45)+1);
		}
		
		for(int i : ranset)
		{
			System.out.print(i + " ");
		}
		System.out.println(ranset.size());
		
//		int sum = 0;
//		for(int i = 1; i<=77; i++)
//		{
//			sum += (77-i+1)*(i); 
//		}
//		System.out.println(sum);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("총금액 입력 : ");
//		int total = sc.nextInt();
//		System.out.println();
//		System.out.println("잔돈 : " + total + "원");
//		
////		System.out.println("10000원 : " + total/10000 + "개" );
////		total = total%10000;
////		System.out.println("5000원 : " + total/5000 + "개" );
////		total = total%5000;
////		System.out.println("1000원 : " + total/1000 + "개" );
////		total = total%1000;
////		System.out.println("500원 : " + total/500 + "개" );
////		total = total%500;
////		System.out.println("100원 : " + total/100 + "개" );
//		
//		
//		int money = 10000;
//		for(int i=1; i<6; i++)
//		{
//			System.out.println(money + "원 : " + total/money + "개 ");
//			total %= money;
//			money = i%2!=0 ? money/2 : money/5;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("입력 : ");
//		int N = sc.nextInt();
//		
//		int sum = 1;
//		for(int i=1; i<=N; i++)
//		{
//			sum*=i;
//		}
//		System.out.println("출력 : " + sum);
		
		
	}

}
