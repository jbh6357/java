package 추상클래스;

public class Main {

	public static void main(String[] args) {

		RegularEmployee regular = new RegularEmployee("0001", "이도연", 4000, 300);
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay());
		
		TempEmployee temp = new TempEmployee("0002", "주미리", 4000);
		System.out.println(temp.print());
		
		PartTimeEmployee part = new PartTimeEmployee("0003", "신재영", 50, 20);
		System.out.println(part.print());
	}

}
