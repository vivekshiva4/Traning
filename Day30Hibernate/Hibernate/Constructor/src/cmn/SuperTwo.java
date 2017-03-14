package cmn;

public class SuperTwo  extends SuperOne{
	public SuperTwo(int x) {
		super(62);
		System.out.println("value of x in subclass is :"+x);
		
	}

}
//super is the keyword used in sub class .when we use constructors .
//super aquires all properties of superclass into sub class.
//always use default constructor in super calss.