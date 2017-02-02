package overRiding;

public   class Two extends One {
	
	@Override
	public void one() {
		System.out.println("method over rided ");
	}
	@Override
	public void display() {

		super.display();
		System.out.println("dispaly method for two");
	}
	
	@Override
	public int go(int x) {
		System.out.println("two method x value is  "+x);
		return super.go(200);
		
		
	}
		
	
	

}
