package com.GY.IO;

import java.io.FileInputStream;

import java.io.IOException;

/*
 * 输入流： 从文件中读取数据
 * 
 * 	int read()：从该输入流读取一个字节的数据。 返回值是读取的一个字节（返回值是 读取的一个字节的内容 转换成Int类型的数据表示出来）
 * ，如果下面没有内容了则返回-1，对于大的数据，过程比较慢
 * 
 *  int read(byte[] b)：从该输入流读取最多 b.length个字节的数据为字节数组。(返回值就是读取的整个缓冲区的实际字节数组的长度) 
 *  如果没有内容则返回-1 增加读取数据的效率
 */
public class InputStreamDemo {

	public static void main(String[] args) {
		
		//读取数据
		readFileContent("fos.text");
	}
	
	/*
	 * 一次读取多个字节的方法
	 */
	public static void readFileContent(String fileNamPath) {
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(fileNamPath);
			//从文件中读取数据
			//创建一个类似缓冲区的字节数组，一次读取2014个字节，缓冲区长度一般是1024或则是1024的整数倍
			byte[] fileString = new byte[10];
			int len = 0;
			//判断读取的
			while ((len = fileInputStream.read(fileString)) != -1) {
//				System.out.println("len ===" + len + "fileString.length=====" + fileString.length);
				System.out.println(new String(fileString, 0, len));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


