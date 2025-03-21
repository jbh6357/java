package 메소드기초;

public class Ex07메소드실습_배열평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array = {15,10,2,8,23};
		double avg = average(array);
		
		System.out.print("평균값은 " + avg);
	}

	private static double average(int[] array) {
		int sum =0;
		
		for(int i=0; i<array.length; i++)
		{
			sum+= array[i];
		}
		
		return sum/(double)array.length;
	}
	
	

}
