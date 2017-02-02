package polymorphism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tile p = new Tile();

		p.game();
		p.player();

		p.tile();
		p.animate();

		Player pp = new Player();
		pp.animate();
	}

}
