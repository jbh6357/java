package 입출력;
import java.util.Scanner;

// 도구를 꺼내올 때는 반드시 어디에서 꺼내올지 'import' 구문을 작성


public class Ex01입출력 {

	public static void main(String[] args) {
		// [입력/출력 해보기]

		// 1. 출력문
		// System.out.println();  -> 출력 후 개행
		// System.out.print();
		// ---> ( )안쪽에 출력하고 싶은 구문 작성
		
		// 출력문 생성 단축키 : syso + ctrl space enter
		
		System.out.println("신재영쌤");
		
		// 2. 입력문
		// 2-1) 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 2-2) 입력받기
		sc.next();  //입력값을 문자열 데이터로 인식
		sc.nextInt(); //입력값을 정수 데이터로 인식
		
		
	}
}
