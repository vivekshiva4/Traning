package com;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component(value="product")
//@Service --model classes
//@Repository --dao classes
//@Controller --controller classes
@Scope(value="singleton")
@Lazy(value=true)
public class Product {

	public Product() {
	System.out.println("product obj created");
	}
	private int prodId=102;
	private String prodName="lkil";
	private double price=20.36;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
