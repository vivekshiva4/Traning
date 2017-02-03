package example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1=new Circle();
		System.out.println("colour of circle is "+ c1.getColor()+" --radius of the circle is "+c1.getRadius()+" --area of circle  is "+c1.getArea());
		
		Circle c= new Circle(2);
		System.out.println("colour of circle is "+ c.getColor()+" --radius of the circle is "+c.getRadius()+" --area of circle  is "+c.getArea());
		
	}

}
