package com;

import org.springframework.stereotype.Component;

@Component(value="price")
public class PriceMatrixImpl implements PriceMatrix {

	@Override
	public double getItemPrice(String itemCode){
		return 150;
	}
}
