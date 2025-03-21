package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		
	
		
		// 1. Student 자료형을 보관할 수 있는 sList라는 이름을 가진 ArrayList 생성
		ArrayList<Student> sList = new ArrayList<Student>();
				  
		// 2. 데이터 추가(본인 이름, 나이를 가지고 있는 데이터를 추가)
//		Student stu1 = new Student("정병호", 26);
//		sList.add(stu1);
		sList.add(new Student("정병호", 26));
		
		// 3. 이름 출력!
		System.out.println(sList.get(0).getName());
		System.out.println(sList.get(0).getAge());
		// 본질적으로 어떤 자료형인지 확인할 것!!
		// sList.get(0) ---> return type : Student ---> 객체!!!
		
		// 4. 팀원 데이터 전부 추가하기!!
		sList.add(new Student("주연진", 29));
		sList.add(new Student("이수현", 26));
		sList.add(new Student("문경서", 28));
		
		System.out.println("==== 학생 정보 ====");
		System.out.println("이름\t나이\t");
		
		for(Student st : sList)    
		{
			System.out.println(st.getName() + "\t" + st.getAge());
		}
		

		

	}

}
