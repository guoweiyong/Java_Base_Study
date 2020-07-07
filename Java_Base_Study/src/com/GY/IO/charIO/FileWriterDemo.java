package com.GY.IO.charIO;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 由于我们常见的操作都是使用本地默认编码，所以，不用指定编码。
 * 而转换的名称有点长，所以，Java就提供了其子类供我们使用。
 * 
 * FileWriter，FileReader 都是Java封装好的类
 */
public class FileWriterDemo {

	public static void main(String[] args) {
		
		writerFile("test3.text");
	}
	
	/*
	 * 使用fileWriter来写入文件
	 */
	public static void writerFile(String fileName) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.write("我爱你，中国");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
