package com.GY.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("Java");
		set.add("sss");
		set.add("aaa");
		set.add("ddd");
		
		//增加forr
		for (String string : set) {
			System.out.println(string);		
			}
	}

}
