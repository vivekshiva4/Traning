package overRiding;

public abstract class One {
	
	public abstract void one();
	
	
	public  void display(){
		System.out.println("display method for class one");
	}
	
	public int go(int x){
	
		System.out.println("one method x value is"+x);
		return x;
	}

}
