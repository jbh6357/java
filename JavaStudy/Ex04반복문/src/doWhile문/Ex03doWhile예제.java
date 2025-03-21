package doWhile문;

import java.util.Scanner;

public class Ex03doWhile예제 {

	public static void main(String[] args) {
		// 아이디와 비빌번호 입력받고 아래와 일치할 경우
		// 로그인 성공 일치하지 않을 경우에는 로그인 실패를 출력하세요
		// 아이디 : test 비밀번호 : test1234
		
		Scanner sc = new Scanner(System.in);
		
		
		String id = "test";
		String pw = "test1234";
		String id_ans;
		String pw_ans;
		
		int count = 0; //로그인 실패 횟수를 센다
		
		do {
		System.out.print("아이디 : ");
		id_ans = sc.next();
		System.out.print("비밀번호 : ");
		pw_ans = sc.next();
		
		if(id_ans.equals(id) && pw_ans.equals(pw))
		{
			System.out.println("로그인 성공");
			break;
		}else {
			System.out.println("로그인 실패");
			count++;
			if(count==3) {
				System.out.println("세번이상틀렸어요~");
				break;
			}
		}
		}while(true);
		
		
	
	}

}
