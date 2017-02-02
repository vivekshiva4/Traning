package polymorphism;

public class Tile extends Player {
	
	public void tile(){
		System.out.println("tile method");
	}
	@Override
	public void animate() {
		System.out.println("again animate method called");
	}

}
