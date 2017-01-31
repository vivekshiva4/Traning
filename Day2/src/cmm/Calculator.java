package cmm;

public class Calculator implements Add,Sub {
	@Override
	public void add(int x, int y) {
		int z=x+y;
		System.out.println("Addition of X and Y is "+z);
	}
	
	@Override
	public void sub(int x, int y) {
		int z=x-y;
		System.out.println("Substraction of X and Y is "+z);		
	}
	
	

}
