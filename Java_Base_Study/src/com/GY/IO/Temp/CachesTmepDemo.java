package com.GY.IO.Temp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 内存操作流
 */
public class CachesTmepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//使用内存操作写数据，其底层是把数据存放在一个byte数组中
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try {
			byteArrayOutputStream.write("helloworld Java".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//byteArrayOutputStream.close();
		
		//读取数据
		byte[] cachesByte = byteArrayOutputStream.toByteArray();
		
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(cachesByte);
		//一次读一个字节
//		int temp = 0;
//		while ((temp = byteArrayInputStream.read()) != -1) {
//			System.out.println((char)temp);
//		}
		
		/*
		 * 一次读取一个字符数组
		 */
		int temp = 0;
		byte[] tempByte = new byte[1024];
		try {
			while ((temp = byteArrayInputStream.read(tempByte)) != -1) {
				System.out.println(new String(tempByte, 0, temp));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
