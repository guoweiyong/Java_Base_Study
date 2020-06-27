package com.GY.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 泛型高级通配符
 * ？ ：
 * ？ extend E：
 * ？ super E:
 */
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Object> collection = new ArrayList<Object>();//正确
		//Collection<Object> collection2 = new ArrayList<Animal>();//报错
		
		//都不报错
		Collection<?> collection3 = new ArrayList<Object>();
		Collection<?> collection4 = new ArrayList<Animal>();

	}

	
}



class Animal {
	
}

class Dog extends Animal {
	
}