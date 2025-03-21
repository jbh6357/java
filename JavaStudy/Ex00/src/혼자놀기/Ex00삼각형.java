package 혼자놀기;
import java.util.Scanner;

public class Ex00삼각형 {
	
	static double myFunc(double num1, double num2) {
		return (double) Math.sqrt(Math.pow(num1, 2) + Math.pow(num2,2));
	}
	
	static double myFunc2(double num1, double num2, double num3)
	{
		if(num1>= num2)
		{
			if(num1>=num3)
			{
				return num1;
			}
			else 
			{
				return num3;
			}
		}
		else if(num2 >= num3)
		{
			return num2;
		}else {
			return num3;
		}
		
	}
	
	static void myFunc3(int num1, int num2, int num3)
	{
		int number = (int) myFunc2((double)num1, (double)num2, (double)num3);	
		
		if (number>= num1 + num2 + num3 - number)
		{
			System.out.println("삼각형이 아닙니다.");
		}
		else
		{
			double s = (num1 + num2 + num3)/2.0;
		    double area = Math.sqrt(s*(s-num1)*(s-num2)*(s-num3));
		    System.out.println("삼각형의 넓이는 " + area + "입니다.");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("직각삼각형의 빗변이 아닌 한 변의 길이를 적어주세요 : ");
		double num1 = sc.nextInt();
		System.out.print("직각삼각형의 빗변이 아닌 다른 한 변의 길이를 적어주세요 : ");
		double num2 = sc.nextInt();
		
		double num3 = myFunc(num1, num2);
		System.out.println("직각삼각형의 세 변은 " + num1 + ", " + num2 + ", " + num3 + "입니다.");
		
		double number = myFunc2(num2, num1, num3);
		
		if (number!=0) {
			System.out.println("직각삼각형의 빗변의 길이는 " + Math.round(number*100) / 100.0 + "입니다.");
		}
		else {
			System.out.println("알 수 없는 이유로 빗변의 길이를 구할 수 없습니다");
		}
		
		System.out.print("자연수를 입력해주세요 : ");
		int number1 = sc.nextInt();
		System.out.print("자연수를 입력해주세요 : ");
		int number2 = sc.nextInt();
		System.out.print("자연수를 입력해주세요 : ");
		int number3 = sc.nextInt();
		
		myFunc3(number1, number2, number3);

	}

}
