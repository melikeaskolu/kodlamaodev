package homework4;

public class GameManager implements GameService {
	//oyun işlemleri
	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" Oyunu başarıyla eklendi");
	}
	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" Oyunu başarıyla güncellendii");
	}
	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" Oyunu başarıyla silindi");
	}
	
	
	

}
