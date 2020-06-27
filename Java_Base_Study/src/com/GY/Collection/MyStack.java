package com.GY.Collection;

import java.util.LinkedList;

/**
 * 需求： 使用LinkList实现一个栈试的集合
 * @author guoweiyong
 *
 *
 */
public class MyStack<E> {
	private LinkedList<E> linkedList;

	public MyStack() {
		super();
		// TODO Auto-generated constructor stub
		linkedList = new LinkedList<E>();
	}
	
	public void add(E object) {
		linkedList.addFirst(object);
	}
	
	public Object getObject() {
		return linkedList.removeFirst();
	}
	
	public boolean isEmpaty() {
		return linkedList.isEmpty();
	}
	
	//定义一个泛型方法
	public <E> void show(E e) {
		System.out.println(e);
	}

}
