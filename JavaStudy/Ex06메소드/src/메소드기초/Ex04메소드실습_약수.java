package 메소드기초;

public class Ex04메소드실습_약수 {

	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 2;
//		
//		boolean divisor = isDivisor(num1,num2);
//		
//		System.out.println(divisor);
		int num = 15;
		int result = getSumOfDivisors(num);
		
		System.out.println("\n" + num+"의 약수의 합 : " + result);

	}
	
	public static int getSumOfDivisors(int num)
	{
		int result = 0;
		for(int i=1; i<=num; i++)
		{
			if (num%i==0)
			{
				result +=i;
				System.out.print(i +" ");
			}
		}
		return result;
	}
	
//	public static boolean isDivisor(int num1,int num2)
//	{
//		return num1%num2==0;
//	}

}
