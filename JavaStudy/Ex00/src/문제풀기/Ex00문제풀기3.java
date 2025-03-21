package 문제풀기;

import java.util.Scanner;

public class Ex00문제풀기3 {

	public static void main(String[] args) {
		//

		int[] a = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
//		for(int i = 0; i<a.length; i++)
//		{
//			System.out.print((i+1)+"번째 정수 입력 >> ");
//			a[i] = sc.nextInt();
//		}
//		
//		System.out.print("3의 배수 : ");
//		for(int i = 0; i<a.length; i++)
//		{
//			if(a[i]%3==0)
//			{
//				System.out.print(a[i] + " ");
//			}
//		}
		
		String result = "3의 배수는 ";
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.print((i+1)+"번째 정수 입력 >> ");
			a[i] = sc.nextInt();
			if(a[i]%3==0) {
				result += a[i] + " ";
			}
		}

		System.out.println(result);
		
		
//		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
//		int[] result = new int[2];
//		int result_dist = Integer.MAX_VALUE;
//		int dist = 0;
//		
//		for (int i = 0; i < point.length; i++) {
//
//			for (int j = i + 1; j < point.length; j++) {
//
//				dist = point[i] - point[j];
//
//				if (dist < 0) {
//					dist *= -1;
//				}
//				if (result_dist > dist) {
//					result_dist = dist;
//					result[0] = i;
//					result[1] = j;
//				}
//
//			}
//
//		}
//
//		if (result[0] > result[1]) {
//			int temp = result[1];
//			result[1] = result[0];
//			result[0] = temp;
//		}
//
//		System.out.println("result = [" + result[0] + ", " + result[1] + "]");
	

	}

}
