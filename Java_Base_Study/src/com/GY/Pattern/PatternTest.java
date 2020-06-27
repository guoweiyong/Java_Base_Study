package com.GY.Pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的QQ号码：");
		String qqString = scanner.nextLine();
		
		System.out.println("checkQQ: " + checkQQ(qqString));

		
		scanner.close();
	}
	
	/*
	 * 正则表达式；符合一定规则的字符串
	 * 使用正则表达式来判断一个手机号码
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;
		// [1-9]表示第一位只能出现1-9的数字 没有写范围就是当前位置
		//[0-9]{4,14}： 第二位可以出现0-9的数字  后面跟了一个范围{4,14} 可以出现4到14次
		String regxString = "[1-9][0-9]{4,14}";
		flag = qq.matches(regxString);
		
		return flag;
	}

}
