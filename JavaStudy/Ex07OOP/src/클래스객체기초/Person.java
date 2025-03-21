package 클래스객체기초;

public class Person {
	
	// Person 이라고 하는 이름의 클래스(설계도)
	// 사람이 가질 수 있는 데이터와 로직을 설계
	
	// 데이터
	int age;
	String name;
	
	// 로직
	void sleep()
	{
		System.out.println("잠을 자요");
	}
	
	void introduce() {
		// 같은 클래스 내의 변수 사용 가능
		System.out.println("제 이름은 " + name + "이고 " + age + "살입니다");
	}
	
	void eat(String food) {
		// 매개변수를 받아와서 실행 가능  
		System.out.println(name + "가(이) " + food + "를(을) 먹습니다");
	}
	
	static void hello(Person a, Person b)
	{
		if(a.age>b.age)
		{
			System.out.println(a.name + "가(이) " + b.name + "에게 " + "90도 인사를 합니다");
		}
		else if (a.age == b.age)
		{
			System.out.println(a.name + "과 " + b.name + "이 서로 사이좋게 인사합니다");
		}
		else 
		{
			System.out.println(b.name + "가(이) " + a.name + "에게 " + "90도 인사를 합니다");
		}
	}
}
