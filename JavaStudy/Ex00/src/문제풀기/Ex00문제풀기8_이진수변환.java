package 문제풀기;

import java.util.Scanner;

public class Ex00문제풀기8_이진수변환 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int a = sc.nextInt();
		bin(a);
	}

	private static void bin(int a) {

		int k = 2;
		int cnt = 1;
		while(a/k!=0)
		{
			k*=2;
			cnt++;
		}
	 	    
	    k /= 2;
	  
	    for(int i = cnt-1; i>-1; i--)
	    {
	    	int tmp = a/k;
	    	System.out.print(tmp + " ");
	    	a = a - k*tmp;
	    	k /=2;    	    		 
	    }
	}

}
