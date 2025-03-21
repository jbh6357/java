package doWhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex02예제깔끔버전 {

	static boolean play = true;
	
	static boolean check = true;
	
	static Scanner sc = new Scanner(System.in);
	
	static Random ran = new Random();
	
	static void game()
	{
		int num1 = ran.nextInt(9)+1;
	    int num2 = ran.nextInt(9)+1;
	    System.out.print(num1 + "+" + num2 + "=" );
	    int ans = sc.nextInt();
		
	    if (ans == num1 + num2)
	    {   
	    	System.out.println("정답!");
	    	check = true;
	    }else
	    {
	    	check = false;
	    }
	}
	
	static void quest()
	{
		String go;
		int chance = 0;
		while(true)
		{
			if(chance>0)
			{
				System.out.print(chance +"번째 기회 : ");
			}
			System.out.print("계속하시겠습니까? (y or n) >> ");
			go = sc.next();
			if(go.equals("y") || go.equals("n"))
			{
				break;
			}
			chance++;
			
			if(chance>3)
			{
				System.out.println("모든 기회를 소비하였습니다.");
				go = "n";
				break;
			}
			
		}
		if (go.equals("n"))
		{
			play = false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("===== Start Game =====");
		
		while(play)
		{
			game();
			
			if(!check)
			{
				quest();
			}	
			
		}
		
		System.out.println("===== GAME END =====");

	}

}
