package overLoadingAndRiding;

public class Child extends Parent {
	
	@Override
	public void over() {
		super.over();
	System.out.println("child class");
	}
	
	@Override
	public void over(int x) {
		super.over(200);
		System.out.println("value of x in child class is  "+x);
	}

}
