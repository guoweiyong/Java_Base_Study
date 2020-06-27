package com.GY.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * 1.需求：List集合储存遍历字符串
 * 2.需求：List集合储存自定义对象遍历
 * 
 * List的集合特点：
 * 		1.有序的，通常允许元素重复
 * 		2、对列表中的每个元素可以进行精确的控制，通过索引来访问元素
 * 		
 */

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List 储存字符串对象遍历
		List<String> list = new ArrayList<String>();
		
		list.add("hello");
		list.add("world");
		list.add("Java");
		
		System.err.println("list:" + list);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("iterator======" + string);
		}
		
		System.out.println("---------------");
		//储存自定义对象遍历
		Student student = new Student("zhansan", 22);
		Student student2 = new Student("lisi", 23);
		Student student3 = new Student("wangwu", 33);
		
		List<Student> list2 = new ArrayList<Student>();
		list2.add(student);
		list2.add(student2);
		list2.add(student3);
		
		
//		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
//			Student student4 = (Student) iterator.next();
//			System.out.println("student=====" + student4);
//			
//		}
		
//		for (int i = 0; i < list2.size(); i++) {
//			Student student4 = list2.get(i);
//			
//			System.out.println("Student====" + student4);
//		}
		
		//List集合特定的列表迭代器 ListIterator
		ListIterator<Student> listIterator = list2.listIterator();
		while (listIterator.hasNext()) {
			Student student4 = (Student) listIterator.next();
			System.out.println("Student===" + student4);
			if (student4.getName().equals("lisi")) {
				list2.remove(student4);
				System.out.println("迭代的过程中删除成功---");
			}
			
			
		}
	}

}
