package ploy;

public class PlayerPeice extends GameShape implements Animatable {
	
	@Override
	public void animate() {
		System.out.println("animating");
		
	}
	
	@Override
	public void movePeice() {
	System.out.println("peice is moving");
		
	}

}
