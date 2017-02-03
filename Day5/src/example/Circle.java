package example;

public class Circle {
	private int radius;
	private String color;

	public Circle() {

		radius = 1;
		color = "blue";
	}

	Circle(int r) {
		radius = r;
		color = "red";

	}

	public int getRadius() {
		return radius;

	}

	public String getColor() {
		return color;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}

}
