package overLoading;

public class Child extends Parent {
	public void load(String x, String y){
		String z=x+y;
		System.out.println("value of z is "+z);
	}
}
