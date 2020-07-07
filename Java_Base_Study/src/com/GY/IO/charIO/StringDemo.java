package com.GY.IO.charIO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tempString = "您好";
		
		byte[] bytes = null;
		try {
			bytes = tempString.getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(bytes)); //[-60, -6, -70, -61]
		

	}

}
