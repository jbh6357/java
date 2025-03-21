package 혼자놀기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Ex00 {

			
	static HashSet<Integer> num = new HashSet<Integer>();
	
	
	public static void main(String[] args) {
		// 역숫자야구
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hash = new HashSet<Integer>();
		System.out.println("==== 숫자야구 ====");
		
		while(true)
		{
			while(hash.size()<4)
			{
				int number = rn.nextInt(9)+1;			
				int count = 0;
				
				if(num.size() > 0)
				{
					for(int i : num)
					{
						if(i==number)
						{
							count++;
							break;
						}
					}
				}
				
				if(count>0)
				{
					continue;
				}
						
				hash.add(rn.nextInt(9)+1);	
			}
			for(int num : hash)
			{
				System.out.print(num + " ");
			}
			
			System.out.println();
			System.out.print("결과를 입력해주세요 >> ");
			String s = sc.next();
			
			func(s,hash.stream().mapToInt(i->i).toArray());
			
			
		}
		

		
	}

	public static void func(String s, int[] a) {
//		1s2b
//		1s
//		2b
//		out
	
		
//		1498
//		1234 1s1b  
//		1s 4C1 
//		2s 4C2
//		3s 4C3
//	    4s 끝
//
//		???? 안에 n개 없으면 리셋
		
		switch(s.length())
		{
			case 2 :
				
				if (s.charAt(1)=='s')
				{
					int num1 = Character.getNumericValue(s.charAt(0));
					
				}else if(s.charAt(1)=='b')
				{
					
				}
				
				break;
				
			case 3 :
				for(int i=0; i<a.length; i++)
				{
					num.add(a[i]);
				}
				break;
				
			case 4 :
				int num1 = Character.getNumericValue(s.charAt(0));
				int num2 = Character.getNumericValue(s.charAt(2));
				
				break;
		}
		
	}

}
