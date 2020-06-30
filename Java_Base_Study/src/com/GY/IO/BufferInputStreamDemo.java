package com.GY.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 字节缓冲输入流
 */

public class BufferInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		readerForBuffuered("fos3.text");
	}
	/*
	 * 高效类 字节缓冲输入流  (高效字节流)
	 * 
	 * BufferedInputStream
	 */
	public static void readerForBuffuered(String fileName) {
		BufferedInputStream bufferedInputStream = null;
		try {
			bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName));
			int len = 0;
			//一次读取一个字节 返回值是哪个字节的内容 一次读取一个字节数组 返回的是字节数组的长度
//			while ((len = bufferedInputStream.read()) != -1) {
//				System.out.println((char)len);
//			}
			//一次性读取多个字节
			byte[] tempByte = new byte[1024];
			while ((len = bufferedInputStream.read(tempByte)) != -1) {
				System.out.println(new String(tempByte, 0, len));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bufferedInputStream != null) {
				try {
					bufferedInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
