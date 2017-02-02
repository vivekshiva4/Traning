package overLoading;

public class One {
	
	public void load(int x, int y){
		int z=x+y;
		System.out.println("value of z is "+z);
	}
	public void load(String x, String y){
		String z=x+y;
		System.out.println("value of z is "+z);
	}
	public void load(int x, String y){
		String z=x+y;
		System.out.println("value of z is "+z);
	}
	

}
