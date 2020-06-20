package com.GY.String;


/*
 * StringBuffer:  线程安全的可变字符序列，主要操作是apend和insert
 * 
 * StringBuffer 和 String的区别？
 * 前者长度和内容可变，后者不可变。
 * 如果使用前者做字符串的拼接，不会浪费太多的资源。
 * 
 * 实现StringBuffer的 添加、删除、替换，反转、截取、和String的相互转换
 */

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("hellow");
		System.out.println("stringBuffer append=====" + stringBuffer);
		
		stringBuffer.deleteCharAt(stringBuffer.length() - 1);
		System.out.println("stringBuffe delete=====" + stringBuffer);
		
		stringBuffer.insert(0, "guoweiyong");
		System.out.println("stringBuffer insert=====" + stringBuffer);
		
		stringBuffer.replace(0, 1, "wo");
		System.out.println("stringBuffer replace=====" + stringBuffer);
		
		StringBuffer stringBuffer2 = stringBuffer.reverse();
		System.out.println("stringBuffer reverse=====" + stringBuffer2);
		
		String subString = stringBuffer.substring(0, 2);
		System.out.println("stringBuffer  subString=====" + subString);
		
		String resulString = new String(stringBuffer);
		System.out.println("相互转换===" + resulString);
		 
		
		
	}
	
	
}
