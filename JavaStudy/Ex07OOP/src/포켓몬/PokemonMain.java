package 포켓몬;

import java.util.Random;
import java.util.Scanner;

public class PokemonMain {

	static boolean isPlay = true;
	static boolean isGame = true;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		Pokemon pika = new Pokemon("피카츄", "전기", "백만볼트", 100, 10);
		Pokemon jamman = new Pokemon("잠만보", "노멀", "누르기", 200, 5);
		
		while(isPlay) {
			System.out.println("===== 포켓몬을 선택하세요 =====");
			System.out.print("[1]피카츄 [2]잠만보 >> ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("=== "+ pika.getType() + " 타입 " + pika.getName() +"을(를) 선택!! ===");
				System.out.println("피카츄가 나타났다!!");
				pika.print();
				game(pika,jamman);			 
			}else if(choice == 2) {
				System.out.println("=== "+ jamman.getType() + " 타입 "+ jamman.getName() +"을(를) 선택!! ===");
				System.out.println("잠만보가 나타났다!!");
				jamman.print();
				game(jamman,pika);
			}else {
				System.out.println("다시 포켓몬을 선택해주세요!");
			}		
		}
		sc.close();
	}
	
	public static void game(Pokemon user, Pokemon npc)
	{
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int i = 1;
		while(isGame)
		{
			System.out.println(i + "번째 턴");
			System.out.println("===== 공격을 선택하세요 =====");
			System.out.print("[1]일반 공격 [2]스킬 공격 >> ");
			int choiceUser = sc.nextInt();
			attack(user, npc, choiceUser);
			
			
			if(isGame == true) {
			System.out.println(npc.getName()+ "의 차례!!");
			int choiceNpc = rn.nextInt(2)+1;
			attack(npc, user, choiceNpc);
			}
			System.out.println("==== 남은 hp =====");
			System.out.println(user.getName() + " hp : " + user.getHp());
			System.out.println(npc.getName() + " hp : " + npc.getHp());
			System.out.println();
			
			if(user.getHp()<=0)
			{
				isPlay = false;
				isGame = false;
				System.out.println("===== " +npc.getName() + "이(가) 승리했다!!! =====" );
				npc.print();
				System.out.println("===== 게임 종료 !!! =====");
			}else if(npc.getHp()<=0)
			{
				isPlay = false;
				isGame = false;
				System.out.println("===== " +user.getName() + "이(가) 승리했다!!! =====" );
				System.out.println("===== 게임 종료 !!! =====");
				user.print();
			}
			i++;	
		}
		sc.close();
	}
	
	public static void attack(Pokemon atk, Pokemon hit, int choice)
	{
		if(choice == 1) {
		System.out.println(atk.getName() +"가 "+ hit.getName() +"를 공격!!!");
		hit.setHp(hit.getHp()-atk.getAtk());
		System.out.println(hit.getName() +"는(은) 아파했다!! ");
		}else {
		System.out.println(atk.getName()+"가 "+ hit.getName() +"에게 " + atk.getSkill() + "를 시전!!!");
		hit.setHp((int)(hit.getHp()-atk.getAtk()*1.5));
		System.out.println(hit.getName() +"는(은) 아파했다!! ");
		}
		System.out.println();

		if(hit.getHp()<=0)
		{
			isGame = false;
		}
	}
	
	
}
