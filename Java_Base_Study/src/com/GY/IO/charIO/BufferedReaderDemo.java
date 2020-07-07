package com.GY.IO.charIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 字符缓冲输入流
 */
public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//一次读取一行数据
		readerLineFile("test2.text");

		//一次读取一个字符
		//readerFile("test2.text");
		
		//一次读取一个字符数组
		//readerFile2("test2.text");
	}
	
	/*
	 * 字符缓冲流来一次读取一行数据
	 * readLine（）：读一行文字。 一行被视为由换行符（'\ n'），回车符（'\ r'）中的任何一个或随后的换行符终止。
	 * 包含行的内容的字符串，不包括任何行终止字符，如果已达到流的末尾，则为null
	 */
	public static void readerLineFile(String fileName) {
		BufferedReader bufferedReader = null;

		try {
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			// 一次读取一行数据
			String conteString = null;
			while ((conteString = bufferedReader.readLine()) != null) {
				System.out.println(conteString);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * 高效字符输入流 一次读取一个字符
	 */
	public static void readerFile(String fileName) {
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			//高效输入字符流一次读取一个字符
			int ch = 0;
			while ((ch = bufferedReader.read()) != -1) {
				System.out.println((char)ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	 * 高效输入字符流 一次读取一个字符数组
	 *
	 */
	public static void readerFile2(String fileName) {
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			//高效输入字符流一次读取一个字符
			char[] ch = new char[1024];
			int count = 0;
			while ((count = bufferedReader.read(ch)) != -1) {
				System.out.println(String.valueOf(ch, 0, count));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
