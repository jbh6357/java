package 클래스객체기초;

public class Bank {
	
	private int money = 0;
	
	void inMoney(int coin)
	{
		//매개변수만큼, money의 값을 저금
		money = money + coin;
	}
	
	void outMoney(int coin)
	{						
		//매개변수만큼, money의 값을 차감
		money = money - coin;
		
		if (money < 0)
		{
			money = money + coin;
			System.out.println("잔고가 부족합니다");
			System.out.println("잔고 : " + money);
			System.out.println("출금 불가");
		}
	}
	
	//잔액조회 메소드
	int showMoney()
	{
		return money;
	}

}
