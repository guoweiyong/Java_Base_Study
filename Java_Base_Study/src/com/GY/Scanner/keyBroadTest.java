package com.GY.Scanner;

import java.util.Scanner;

/*
 * 基本格式：
 * 		public boolean hasNextXXX: 判断是否是某种类型的元素，如果不带XXX 就是判断字符串
 * 		public XXX nextXXX(): 获取该元素
 * 
 * 注意： 如果输入和获取的数据类型不一样，程序会carsh
 * 
 * 常用的两个方法：
 * 		public int nextInt():获取一个int类型的值
 * 		public String nextLine(): 获取一个string类型的值
 * 
 * 如果先获取一个数值后，在获取字符串会出现问题，主要原因： 是换行字符的问题
 * 如何解决：
 * 			把所有的数据都先按照字符串获取，然后需要什么，在转换对应的类型
 */

public class keyBroadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
//		int x = scanner.nextInt();
//		System.out.println(x);
		
		if (scanner.hasNextInt()) {
			System.out.println("输入的数据正确");
		} else {
			 System.out.println("输入不匹配 ");
		}
	}

}
