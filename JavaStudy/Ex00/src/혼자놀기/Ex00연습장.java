package 혼자놀기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ex00연습장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] a;
//		
//		a = new int[] {1,2,3};
//		
//		
//		int[] b = new int[3];
//		b[0] = 1;
//		b[1] = 2;
//		b[2] = 3;
//		
//		ArrayList<Integer> c = new ArrayList<Integer>();
//		
//		c.add(1);
//		c.add(2);
//		c.add(3);  
//		
//		for (int num : c)
//		{
//			System.out.println(num);
//		}
//		
//		String s = "-12345";
//		System.out.println(s.charAt(0));
//		int num = Integer.parseInt(s);
//		HashSet<Integer> hash = new HashSet<Integer>();
		
//		int[] a = {4,1,8,2,3,5};
//		
//		for(int i=0; i<a.length-1; i++)
//		{
//			int temp = 0;
//			
//			if(a[i]>a[i+1])
//			{
//				temp = a[i];
//				a[i] = a[i+1];
//				a[i+1] = temp;
//				
//				i=-1;
//				
//			}
//		}
//	
//		for (int num : a)
//		{
//			System.out.println(num);
//		}
		
		//약수의 개수 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : ");
//		int num = sc.nextInt();
//		int count = 0;
//		for(int i=num; i>0; i--)
//		{
//			if(num%i==0)
//			{
//				count++;
//			}
//		}
//		System.out.println("약수의 개수 : " + count);
		
		for(int i=0; i<7; i++)
		{
			System.out.print("+----------");
		}
		System.out.println("+");
		System.out.println("| 0        | 1        | 2        | 3        | 4" +
		                 "        | 5        | 6        |");
		System.out.println("| STRAT    | 타이베이   | 베이징     | 마닐라    | 제주" +
		                 "      | 싱가포르    | 카이로    |" );
		for(int i=0; i<7; i++)
		{
			System.out.print("+----------");
		}
		System.out.println("+");
		System.out.println("| 23       |                                    " +
		                  "                  | 7        |");
		System.out.println("| 뉴욕      |                                    " +
                "                  | 이스탄불   |" );	 
		System.out.print("+----------+");
		for(int i=0; i<6; i++)
		{
			System.out.print("         ");
		}
		System.out.println("+----------+");
		System.out.println("| 22       |                                    " +
                "                  | 8        |");
		System.out.println("| 파리      |                                    " +
                "                  | 아테네     |" );	
		System.out.print("+----------+");
		for(int i=0; i<6; i++)
		{
			System.out.print("         ");
		}
		System.out.println("+----------+");
		System.out.println("| 23       |                                    " +
                "                  | 7        |");
		System.out.println("| 도쿄      |                                    " +
				"                  | 코펜하겐   |" );	 
	}

}
