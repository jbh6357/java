package OT;

public class Ex03연산자 {

	public static void main(String[] args) {
		
		//산술연산자 : + - * / %
		int num1 = 10;
		int num2 = 3;
		System.out.println(num1 + num2); //13
		System.out.println(num1 - num2); //7
		System.out.println(num1 * num2); //30
		System.out.println(num1 / num2); //3
		System.out.println(num1 % num2); //1
		
		
		float num3 = 3.45f;
		//더 많은 정보를 표현할 수 있는 타입으로
		//자동(묵시적) 형 변환이 일어남
		System.out.println(num1 + num3); //13.45
		
		//숫자 + 문자열 --> 두개의 데이터가 붙여서 출력된다
		// ==> 결과 타입 : 문자열
		String number = "10";
		System.out.println(num1 + number); //1010
		
		System.out.println("" + num1 + num2);
		
		System.out.println("============================");
		
		int a = 456;
		System.out.println(a - a%100);
		System.out.println(a/100*100);
		System.out.println(a/100+"00");
		
		
	}

}
