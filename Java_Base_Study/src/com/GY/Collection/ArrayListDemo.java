package com.GY.Collection;

import java.util.ArrayList;

/*
 * 需求： ArrayList 中去除重复元素，不创建新的集合
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("world");
		arrayList.add("world");
		arrayList.add("world");
		arrayList.add("java");
		
		//我们使用插入排序的思想来实现这个需求
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i+1; j < arrayList.size(); j++) {
				if (arrayList.get(j).equals(arrayList.get(i))) {
					arrayList.remove(j);
					j--;
				}
			}
		}
		
		System.out.println("删除之后的元素=====" + arrayList);
		//删除之后的元素=====[hello, world, java, world]
		//会出现重复的元素，经查看之后，因为当你删除一个元素时，该元素后面的下标自动减一，这个时候我们
		//没有判断当前所以的元素是否有重复，所以当出现连续重复的元素时，会有元素漏掉，解决方法是当我们删除
		//该重复元素时，集合的元素下表发生改变时，应才在判断后续补位元素是否有重复
		//删除之后的元素=====[hello, world, java]
		
	}
	
	//申明一个多个参数的方法
	public static int sum(int... count) {
		int sum = 0;
		if (count != null) {
			for (int i : count) {
				return sum += i;
			}
		}
		
		return sum;
	}

}
