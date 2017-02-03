package refrenceVariablesCasting;

public class Test {

	public static void main(String[] args) {
		Animal [] a={new Animal(),new Dog()};
		
		for(Animal aa:a){
			aa.makeNoise();
			
			if (aa instanceof Dog){
				Dog d=(Dog) aa;
				d.playDead();
			
		}
		
	}

}
}