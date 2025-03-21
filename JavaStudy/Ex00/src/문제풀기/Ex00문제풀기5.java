package 문제풀기;

import java.util.Scanner;

public class Ex00문제풀기5 {

	public static void main(String[] args) {
		//
		// 1번 문제
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 >> ");
//		int n = sc.nextInt();
//		int[][] array = new int[n][n];

		// 1번 풀이
//		for(int i=0; i<array.length; i++ )
//		{
//			for(int j=0; j<array[i].length; j++)
//			{
//				array[i][j] = (i+1) + j*5;
//				System.out.print(array[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		
		// 2번 풀이
//		int cnt = 1;
		
//		(열고정 행반복)
//		for(int i=0; i<array[0].length; i++ )
//		{
//			for(int j=0; j<array.length; j++)
//			{
//				array[j][i] = cnt++;
//			}
//		}
//		(행고정 열반복)
//		for(int i=0; i<array.length; i++ )
//		{
//			for(int j=0; j<array[i].length; j++)
//			{
//				System.out.print(array[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		
		// 문제 2
//		int[][] array = new int[5][5];
//		int cnt = 1;
//		System.out.println("원본");
//		for(int i=0; i<array.length; i++ )
//		{
//			for(int j=0; j<array[i].length; j++)
//			{
//				array[i][j] = cnt++;
//				System.out.print(array[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		System.out.println("90도 회전");    
//		for(int i=array[0].leth-ng1; i>-1; i--)   // 열의 갯수 
//		{
//			for(int j=0; j<array.length; j++)   // 행의 갯수
//			{
//				System.out.print(array[j][i] + "\t");
//			}
//			System.out.println();
//		}

		

		// 문제 3
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 >> ");
//		int n = sc.nextInt();
//		int[][] array = new int[n][n];
//		int cnt = 1;
//		for(int i =0; i<array.length; i++)
//		{
//			for(int j=0; j<array[i].length; j++)
//			{
//				if((i+1)%2!=0)
//				{
//					array[i][j] = cnt++;
//				}
//				else
//				{
//					array[i][array[i].length-1-j] = cnt++;
//				}
//			}
//		}
//		
//		for(int i=0; i<array.length; i++ )
//		{
//			for(int j=0; j<array[i].length; j++)
//			{
//				System.out.print(array[i][j] + "\t");
//			}
//			System.out.println();
//		}
	
	}

}
