package 메소드기초;

public class Ex02메소드기초예제 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1,num2,op));

	}
	
	public static int cal(int num1, int num2, char op)
	{
		int result = 0;

		switch(op)
		{case('-'):
			result = num1 - num2;
			break;
		 case('+'):
			result = num1 + num2;
		 	break;	
		 case('*'):
			result = num1 * num2;
		 	break;
		 case('/'):
			result = num1 / num2;
		 	break;
		 case('%'):
			result = num1 % num2;
		 	break;
		 default :
			break;
		}

		return result;
	}
}
