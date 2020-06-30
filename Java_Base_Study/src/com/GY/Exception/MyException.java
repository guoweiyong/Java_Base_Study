package com.GY.Exception;
/*
 * 自定义异常类
 * java不可能对所有的情况都考虑到，在实际开发中，我们可能需要自己定义异常
 */

public class MyException extends Exception {
	
	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
