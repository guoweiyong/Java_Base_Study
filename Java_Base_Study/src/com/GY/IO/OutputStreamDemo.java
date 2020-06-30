package com.GY.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;

import com.GY.study.TestMain;

/*
 * FileOutPutStream的构造方法；
 * FileOutputStream(File file)： 创建文件输出流以写入由指定的 File对象表示的文件。
 * FileOutputStream(String name)：创建文件输出流以指定的名称写入文件。
 * 上述两个构造方法的效果是一样的，前者传递文件 后者传递文件路径名称
 * 
 * 
 * 
 * FileOutputStream(File file, boolean append) ：创建文件输出流以写入由指定的 File对象表示的文件。
 * FileOutputStream(String name, boolean append)：创建文件输出流以指定的名称写入文件。
 * 上述这个两个构造方法也是一样的  第二个参数表示是够在文件的本来的内容后面追加内容
 * 
 * 
 * FileOutputStream(FileDescriptor fdObj)：创建文件输出流以写入指定的文件描述符，表示与文件系统中实际文件的现有连接。
 * 
 * 
 * 字节输出流操作步骤：
 * 		1.创建字节流对象
 * 		2.写数据
 * 		3.释放资源
 * 
 */
public class OutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//每一次写入都覆盖文件本来的内容
		//writerFile
		
		//在原来文件的内容追加内容
		//writerFile2("fos.text", true);
		
		writerFile3("fos2.text", false);
	
	}
	
	/*
	 * 写入的数据换行，需要写如换行符
	 */
	public static void writerFile3(String tempFileName, boolean append) {
		FileOutputStream fileOutputStream = null; 
		try {
			fileOutputStream = new FileOutputStream(tempFileName);
			for (int i = 0; i < 10; i++) {
				fileOutputStream.write(("hello" + i + "\n").getBytes());
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public static void writerFile2(String tempFileName, boolean append) {
		// 2.首先我们先创建一个输出流
		OutputStream fileOutputStream = null;
		// 该构造方法和上面文件参数创建的效果是一样的
		// OutputStream fileOutputStream2 = new FileOutputStream("test.text");
		try {
			fileOutputStream = new FileOutputStream(tempFileName, append);
			/**
			 * 创建字节流对象做了几件事情
			 * 1.调用系统功能去创建文件
			 * 2.创建 fileOutputStream （输入流对象）对象
			 * 3.把fileOutputStream对象指向这个文件
			 */
			fileOutputStream.write("GY hello world java".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 释放资源 关闭此文件输出流并释放此流有关的所有系统资源。
			// 如果该对象是null我们就不需要释放
			if (fileOutputStream != null) {
				try {
					/*
					 * 为什么一定要close（）？
					 * 
					 * 1.让流对象编程垃圾，这样就可以被垃圾回收器回收了
					 * 2.通知系统去释放该文件的相关资源
					 */
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	/*
	 * 文件写入内容
	 */
	public static void writerFile(String tempFileName) {

		// 2.首先我们先创建一个输出流
		OutputStream fileOutputStream = null;
		// 该构造方法和上面文件参数创建的效果是一样的
		// OutputStream fileOutputStream2 = new FileOutputStream("test.text");
		try {
			fileOutputStream = new FileOutputStream(tempFileName);
			fileOutputStream.write("hello world java".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 释放资源
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
