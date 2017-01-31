package cnn;

public class Calculator {

	private int x=30;
	private int y;

	public void setX(int x) {
		this.x = x;

	}

	public int getX() {

		return x;

	}

	public void setY(int y) {
		this.y = y;

	}

	public int getY() {

		return y;

	}

	public void add() {
		int z = x + y;
		System.out.println("addition of two number is " + z);
	}

	public void sub() {
		int z = x - y;
		System.out.println("subtraction of two number is " + z);
	}
}
