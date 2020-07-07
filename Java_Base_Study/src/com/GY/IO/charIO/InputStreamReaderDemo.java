package com.GY.IO.charIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 字符流和字节流的方法用的差不多
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) {
		
		//测试字符输出流
		//readerFile("test.text");
		
		//使用字符流一次读取一个字符数组 
		readreFile2("test.text");
	}
	
	/*
	 * 使用字符流来一个读取一个字符的方法来读取文件内容
	 */
	public static void readerFile(String fileName) {
		InputStreamReader inputStreamReader  = null;
		try {
			inputStreamReader = new InputStreamReader(new FileInputStream(fileName));
			//一个字符一个字符的读
			int ch = 0;
			while ((ch = inputStreamReader.read()) != -1) {
				System.out.println((char)ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStreamReader != null) {
				try {
					inputStreamReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	 * 使用字符流 一次读取多个字符 
	 */
	public static void readreFile2(String fileName) {
		InputStreamReader inputStreamReader  = null;
		try {
			inputStreamReader = new InputStreamReader(new FileInputStream(fileName));
			//一次读取多个字符
			char[] ch = new char[1024];//可以自定义长度
			int count = 0;
			while ((count = inputStreamReader.read(ch)) != -1) {
				
				System.out.println(String.valueOf(ch, 0, count));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStreamReader != null) {
				try {
					inputStreamReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
