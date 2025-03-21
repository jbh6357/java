package 배열실습;

import java.util.Random;

public class Ex01배열실습_가장큰수 {

	public static void main(String[] args) {
		// [실습] 가장 큰 수 찾기
		
		// 1. 정수 데이터 5개를 저장할 수 있는 배열 array 만들기
		//  --> 정수 데이터는 6,3,8,4,2
		// 2. 배열 안의 데이터 중 가장 큰 값을 출력
		
		Random ran = new Random();
		
		int[] a = new int[10];

		int max = a[0];
		
		System.out.print("array에 들어있는 값 [ ");
		
		for(int i = 0; i<a.length; i++)
		{
			a[i] = ran.nextInt(20)+1;
			
			if(i!=a.length-1) {
				System.out.print(a[i] + ", ");
			}
			else
			{
				System.out.println(a[i] + " ]");
			}
			if(a[i]> max)
			{
				max = a[i];
			}
		}
		System.out.println("가장 큰 값은 " + max + " 입니다.");

	}

}
