package com.GY.Collection.Set;

import java.util.HashSet;
import java.util.Set;

import com.GY.Collection.Student;

/*
 * HashSet: 储存字符串并遍历
 * 
 * 问题： 为什么存储字符串的时候，字符串内容相同的只存储了一个？
 * 通过查看add方法的源码，我们回到底层方法依赖hashCode()和equals()方法，首先比较hash值，
 * 如果相同，在比较地址值和equals()方法，而String方法重写了hashCode()和equals()方法，
 * 所以可以保证把内容相同的字符串去掉只留下一个

 * 
 * 2.使用HashSet储存自定义对象,遍历(如果两个对象的成员属性一样则表示两个对象是同一个对象)
 */
public class HashSetDemo {

	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<String>();
//		set.add("hello");
//		set.add("world");
//		set.add("Java");
//		set.add("sss");
//		set.add("aaa");
//		set.add("ddd");
//
//		// 增加for 遍历集合
//		for (String string : set) {
//			System.out.println(string);
//		}
		
		
		
		//使用HashSet储存自定义对象
		HashSet<Student> hashSet = new HashSet<Student>();
		Student student = new Student("lishi", 22);
		Student student2 = new Student("zhansna", 33);
		Student student3 = new Student("wangwu",44);
		Student student4 = new Student("lishi", 22);
		
		hashSet.add(student);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		
		for (Student student5 : hashSet) {
			System.out.println("Student=====" + student5);
		}
		
	}
	
}
