package polymorphism;

public class Player extends Game implements Animatable {
	public void player() {
		System.out.println("player method");

	}
	
	@Override
	public void animate() {
		
			System.out.println("animate method");
		}
		
	
}
