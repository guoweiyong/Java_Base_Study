package com.GY.BigDecimal;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(0.09 + 0.01);
		System.out.println(1.0 - 0.32);
		
		BigDecimal bigDecimal = new BigDecimal("0.09");
		BigDecimal bigDecimal2 = new BigDecimal("0.01");
		System.out.println(bigDecimal.add(bigDecimal2));
		
		BigDecimal bigDecimal3 = new BigDecimal(0.09);
		BigDecimal bigDecimal4 = new BigDecimal(0.01);
		System.out.println(bigDecimal3.add(bigDecimal4));
	}

}
