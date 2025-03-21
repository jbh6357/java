package 클래스객체기초;

public class BankMain {

	public static void main(String[] args) {
		// 보통 변수는 디폴트 접근제한자를 썼지만
		// 같은 패키지의 다른 파일에서 함부로 값을 바꾸지 못하도록
		// 접근제한자를 private로 설정
		
		Bank mrBank = new Bank();
		
		
		mrBank.inMoney(100);  //입금
		mrBank.outMoney(300); //출금
	
		
		System.out.println("잔액은 " + mrBank.showMoney());

	}

}
