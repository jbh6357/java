import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Ex00블랙잭 {

	public static void main(String[] args) {
		// TODO 카드의 합이 21을 넘지 않는 한에서 카드의 합을 최대한 크게
		// 딜러가 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다
		// 딜러는 숫자 M을 크게 외친다
		// 플레이어는 제한된 시간 안에 N장의 카드 중 3장의 카드를 골라야 한다
		// 카드의 합은 M을 넘지 않되 M과 최대한 가깝게 만들어야 한다.
		// N(3 <= N <= 100) M(10<= M <=300,000) 카드값<100,000
		// 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다
		// 카드 N장, 기준값 M, 카드 를 입력받고
		// M에 최대한 가까운 카드 3장의 합을 출력
		
//		int N = 5;
//		int M = 21;
		
//		int[] cards = new int[N];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N 입력 : ");
		int N = sc.nextInt();
		System.out.print("M 입력 : ");
		int M = sc.nextInt();

		HashSet<Integer> hash = new HashSet<Integer>();
		Random rn = new Random();
		int[] cardsNum = new int[3];
		while(hash.size()<N)
		{
			if((M/3)*2<100000)
			{
				hash.add(rn.nextInt((M/3)*2) + 1);
			}
			else
			{
				hash.add(rn.nextInt(100000-1) + 1);
			}
		}
		
		int[] cards = hash.stream().mapToInt(i -> i).toArray();
		
		for(int card : cards)
		{
			System.out.print(card + " ");
		}
		System.out.println();

		int result = 0;
		
		for(int i=0; i<cards.length-2; i++)
		{
			int sum = cards[i];
			if(sum>M) continue;

			for(int j = i+1; j<cards.length-1; j++)
			{
				sum = cards[i] + cards[j];
				if(sum>M) continue;

				for(int k = j+1; k<cards.length; k++)
				{
					sum = cards[i] + cards[j] + cards[k];
					if(sum>M) continue;
					if(result<sum) 
					{
						result = sum;
						cardsNum[0] = i;
						cardsNum[1] = j;
						cardsNum[2] = k;
						
					}
				}
			}
		}
		System.out.print(cards[cardsNum[0]] + " + " + cards[cardsNum[1]] + " + " +  cards[cardsNum[2]] + " = " + result);
	}

}
