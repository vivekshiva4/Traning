package com;

public class Ball implements Bounceable {

	public void bounce() {
		System.out.println("Bounce method is called");
	}

	public void setBounceFactor( int bf) {
		System.out.println("setBounceFactor of a ball is "+bf);
	}
}
