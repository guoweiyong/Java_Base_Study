package com.GY.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 测试Collction的方法
 */

public class CollectionDemo {
	
	
	public static void main(String[] args) {
		
		//由于接口不能实例化，我们需要找其具体实现子类来创建对象
		Collection<String> collection = new ArrayList<String>();
		collection.add("hello");
		collection.add("word");
		collection.add("hello");
		/**
		 * public boolean add(E e) {
        	ensureCapacityInternal(size + 1);  // Increments modCount!!
        	elementData[size++] = e;
        	return true;
    		}
    	* 通过查看ArrayList中的add（）方法 源码，返现返回的永远是true，由此可知 这个集合允许重存在的
    	* 元素
		*/
		
		//删除方法
		//collection.clear(); //移除集合所有的元素
		//collection.remove("hello");//删除集合某个元素
//		Collection<String> collection2 = new ArrayList<String>();
//		collection2.add("hello");
//		collection2.add("hello");
//		collection.removeAll(collection2);
		
		System.out.println("collection===" + collection);
		
		//集合的迭代器遍历集合
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("迭代器遍历集合===" + string);
			
		}
		 
		//加强版for遍历集合 增强for的弊端就是 遍历的目标不能为null，使用之前最好对目前进行判断
		//增强for实质是 迭代器遍历
		for (String string : collection) {
			System.out.println("加强for循环遍历集合====" + string);
		}
		
		//普通for循环
		for (int i = 0; i < collection.size(); i++) {
			//向下转型 多态
			ArrayList<String> arrayList = (ArrayList<String>)collection;
			String string = arrayList.get(i);
			System.out.println("普通for循环遍历集合====" + string);
		}
	}
}
