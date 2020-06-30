package com.GY.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节缓冲输出流（缓冲区类。高效类）
 * 
 */

public class BufferOutputStreamDemo {
	
	public static void main(String[] args) {
		
		writerForBuffered("fos3.text");
		
	}
	/*
	 * 使用字符缓存输入流 来写写入内容到文件（高效类）
	 * 
	 * bufferedOutputStream类
	 */
	public static void writerForBuffered(String fileName) {
		// 创建一个字节缓冲输入流对象
		BufferedOutputStream bufferedOutputStream = null;
		try {
			bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName));
			bufferedOutputStream.write("我正在学历Java中的IO流".getBytes());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (bufferedOutputStream != null) {
				try {
					bufferedOutputStream.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

}
