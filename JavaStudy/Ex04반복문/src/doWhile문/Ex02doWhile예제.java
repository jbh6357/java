package doWhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex02doWhile예제 {

	public static void main(String[] args) {
		// 랜덤수 만드는법
		// 1. 랜덤 수를 만들어주는 도구 꺼내기
		Random ran = new Random();
		// 2. 도구를 이용해서 랜덤수 생성
		// 소괄호 안에 추출하고 싶은 숫자의 갯수를 적기
//		int ranNum = ran.nextInt(9)+1;
//		System.out.println(ranNum);
		
		Scanner sc = new Scanner(System.in);
		
		//또다른방법 boolean play = true;  do {} while(play)   
	
		int ans = 0;
		System.out.println("===== Start Game =====");
		
		do {int a = ran.nextInt(9)+1;
	    int b = ran.nextInt(9)+1;
		
	    System.out.print(a + "+" + b + "=" );
	    ans = sc.nextInt();
	    if (ans == a+b)
	    {
	    	System.out.println("정답!");
	    }
		    else { //틀렸음
		    		String go;
		    		int chance = 0;
		    	while(true)
		    	{
		    		if (chance>3)
		    		{
		    			System.out.println("기회는 끝났어!!");
		    			go = "n";
		    			break;
		    		}
		    		if(chance > 0)
		    		{
		    			System.out.print("(" +chance + "번째 기회)" + "틀렸는데 계속할래? >> ");
		    		}
		    		else
		    		{
		    			System.out.print("틀렸는데 계속할래? >> ");
		    		}
		    	    go = sc.next();
		    	    if (go.equals("y")||go.equals("n"))
		    	    {
		    	    	break;
		    	    }else {
		    	    	System.out.println("'y'와 'n'만 입력가능해!");
		    	    }
		    	    chance++;    		    	
		    	}
		    	if(go.equals("n"))  
		            // go.equals("n") String의 값을 비교하는 방법 : 변수.equals(비교값)
		    	{
		
		    		break;
		    	}
		    	
		    }				    
		}while(true);
			
		System.out.println("종료!!!");
		
		
	}

}
