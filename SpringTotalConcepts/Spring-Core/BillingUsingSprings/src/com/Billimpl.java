package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="bill")
public class Billimpl {

	@Autowired
	private PriceMatrix pm;
	

	public double getCartTotal(List<String> cart) {

		double total = 0.0;

		for (String item : cart) {

			total = total + pm.getItemPrice(item);

		}

		return total;
	}

}
