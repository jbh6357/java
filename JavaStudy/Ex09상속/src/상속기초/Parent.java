package 상속기초;

public class Parent {
	
	// 기존 클래스 => 부모 클래스, 슈퍼 클래스
	// 한식가게
	
	int x = 3;
	
	int getX()
	{
		return x * 2;
	}
	
	// 1. 제육볶음 메뉴를 파는 메소드
	public void makeJae() {
		System.out.println("맛있는 제육볶음을 만든다~~~");
	}
	
	// 2. 비빔밥 메뉴를 파는 메소드
	public void makeBibim() {
		System.out.println("맛있는 비빔밥을 만든다~~~");
	}
		
	
}
