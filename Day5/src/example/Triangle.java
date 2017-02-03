package example;

public class Triangle extends Rectangle {
	@Override
	public void area() {
		
		super.area();
		width=25.02;
		height=56.25;
		double d=0.5*width*height;
		System.out.println("triangle AREA"+d);
	}

}
