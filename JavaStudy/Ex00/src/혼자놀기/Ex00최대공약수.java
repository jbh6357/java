package 혼자놀기;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex00최대공약수 {
	
	static int myFunc(int num1, int num2) {
		
		if (num1 < num2)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;			
		}
		if(num1 % num2 == 0)
		{
			return num1;
		}
		else
		{
			return num1 * num2;
		}
			
	}
	
	static ArrayList<Integer> myFunc2(int number) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		list.add(10);
//		list.get(0);
//		list.clear();
//		list.remove(0);
		
		for (int i=1; i<=number; i++)
		{

			if (number % i == 0)
			{
				if (number == i)
				{
					System.out.print(i + "\n");
					list.add(i);
				}
				else
				{
					System.out.print(i + ", ");
					list.add(i);
				}
			}
		}
		return list;
		
	}
	
	static int myFunc3(ArrayList<Integer> a, ArrayList<Integer> b)
	{
		int maxA = a.get(a.size()-1);
		int maxB = b.get(b.size()-1);
		
		if (maxA < maxB)
		{
			ArrayList<Integer> a2 = b;
			ArrayList<Integer> b2 = a;
		}
		for (int i = b.size()-1; i>=0; i--)
		{
			if(maxA % b.get(i) == 0)
			{
				int k = b.get(i);
				return k;
			}
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1; 
		
		int num2;
		while(true)
		{
			System.out.print("첫 번째 자연수를 입력해주세요 :");	
		    num1 = sc.nextInt(); 

		    // try-catch 문
		    if(num1>0)
		    {
		    	break;
		    }
		    System.out.println("\n잘못 입력하셨습니다.");
		}
		while(true)
		{
			System.out.print("두 번째 자연수를 입력해주세요 :");
			num2 = sc.nextInt();
			if(num2>0)
		    {
		    	break;
		    }
		    System.out.println("\n잘못 입력하셨습니다.");
		}
		int ans = myFunc(num1, num2);
		
		System.out.printf("두 숫자의 최소 공배수는 %d입니다.\n", ans);
		
		System.out.printf("%d의 약수는 : ",num1);
		
		ArrayList<Integer> a = myFunc2(num1);
		
		System.out.printf("%d의 약수는 : ",num2);
		
		ArrayList<Integer> b = myFunc2(num2);
		
	    int number = myFunc3(a, b);
	    
	    if(number!=0)
		{
	    	System.out.println("최대공약수 : " + number);
		}
	    else
	    {
	    	System.out.println("알 수 없는 이유로 최대공약수를 구할 수 없습니다");
	    }
				
		
	}
	

}
