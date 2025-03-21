package 배열실습;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex01배열실습 {

	public static void main(String[] args) {
			
		
		  // set, set.stream().mapToInt(i -> i).toArray()
		  // Integer.MiN_VALUE 
		  // Math.max(int num1,int num2)
		
		  Random random = new Random();
		  
	      int[] array = new int[5];
	      
	      Set<Integer> set = new HashSet<>();
	      
	      while(set.size() < 6) set.add(random.nextInt(9) + 1);
	      
	      array = set.stream().mapToInt(i -> i).toArray();
	      
	      System.out.print("array에 들어있는 값 [ ");
	      for(int i = 0; i < array.length - 1; i++) System.out.print(array[i] + ", ");
	      System.out.println(array[array.length-1] + " ]");
	      
	      int max = Integer.MIN_VALUE;
	      
	      for(int num : array) max = Math.max(max, num);
	      
	      System.out.println("가장 큰 값은 " + max + "입니다.");


	}

}
