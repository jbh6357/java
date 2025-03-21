package 닌텐도게임;

public class GameMain {
// 닌텐도 게임기(실행할 수 있는 공간)
	
	public static void main(String[] args) {
		
		// 마리오 게임칩 꺼내오기
		Mario m = new Mario();
		// 게임칩을 넣기
		on(m);
		// 젤다 게임칩 꺼내오기
		Zelda z = new Zelda();
		// 게임칩 넣기
		on(z);
		PokemonGo p = new PokemonGo();
		on(p);		

	}
	
	// (1)메소드 오버로딩 기법 (안함)
	
	// (2)메소드 오버라이딩 기법 
	private static void on(GameChip g) {
		g.gameStart();
	}
	

}
