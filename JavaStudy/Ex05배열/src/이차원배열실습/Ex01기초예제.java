package 이차원배열실습;

public class Ex01기초예제 {

	public static void main(String[] args) {
		
		// // 1. 이차원 배열 생성
				int[][] array2 = {
						{1, 2, 3, 4},   // 0행
						{5, 6, 7, 8},   // 1행
						{9, 10, 11, 12} // 2행
					};
				
				// for문 써서 1,2,3,4 출력
				// array2.length : array2행의 갯수
				// array2[0].length : array2의 0번 행이 가지고 있는 데이터의 갯수
				for(int i=0; i<array2[0].length; i++)
				{
					if(i<array2[0].length-1)
					{
						System.out.print(array2[0][i] + ", ");

					}
					else
					{
						System.out.println(array2[0][i]);
					}
				}
				System.out.println();
				// for문 써서 5,6,7,8 출력
				for(int i=0; i<array2[1].length; i++)
				{
					if(i<array2[1].length-1)
					{
						System.out.print(array2[1][i] + ", ");

					}
					else
					{
						System.out.println(array2[1][i]);
					}
				}

				// for문 써서 9,10,11,12 출력
				for(int i=0; i<array2[2].length; i++)
				{
					if(i<array2[2].length-1)
					{
						System.out.print(array2[2][i] + ", ");

					}
					else
					{
						System.out.println(array2[2][i]);
					}
				}
				
				
				for(int i=0; i<array2.length; i++)
				{
					for(int j=0; j<array2[i].length; j++)
					{
						if(j<array2[i].length-1)
						{
							System.out.print(array2[i][j] + ", ");

						}
						else
						{
							System.out.println(array2[i][j]);
						}
					}
				}
				
	}

}
