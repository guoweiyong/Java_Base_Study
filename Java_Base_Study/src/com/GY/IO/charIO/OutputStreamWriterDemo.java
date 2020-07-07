package com.GY.IO.charIO;

/*
 * close（）和flush（）的区别
 * close（）关闭流对象，但是先刷新一次缓冲区。关闭流对象之后，流对象不可以在使用了
 * flush（）仅仅刷新缓冲区，刷新之后流对象还可以继续使用
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		writerFile("test.text");
	}

	/*
	 * 使用字符输出流来写数据
	 */
	public static void writerFile(String fileName) {
		OutputStreamWriter outputStreamWriter = null;
		try {
			//是够在文件后面追加根据创建的字节流， 字符流的构造方法参数都是字节流
			outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileName));
			//开始写
			for (int i = 0; i < 3; i++) {
				outputStreamWriter.write("我爱你，中国");
			}
			//刷新内容，如果输出流没有关闭，这个时候文件中可能没有刷新我们写入的内容，所以需要刷新内容下
			//当写的操作完成之后再刷新缓存
			outputStreamWriter.flush(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			if (outputStreamWriter != null) {
				try {
					outputStreamWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
