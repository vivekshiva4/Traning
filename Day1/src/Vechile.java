
public class Vechile {
	
	int regNo;
	String colour;
	String company;
	public Vechile()
	{
		
	}
	public Vechile(int regNo, String colour, String company) {
		this.regNo = regNo;
		this.colour = colour;
		this.company = company;
	}
	public void display(){
		System.out.println("Registration numbr is "+regNo);

		System.out.println("Colour  is "+colour);
		System.out.println("company is "+company);
	}
	 
	

}
