package com.GY.IO.charIO;

import java.io.FileReader;
import java.io.IOException;

/*
 * 字符输入流的子类  便捷字符输入流FilerReader
 * 由于我们本地不用
 */

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readerFile("test3.text");
		readerFile2("test3.text");
	}

	/*
	 * 使用fileReader一次读取一个字符
	 */
	public static void readerFile(String fileName) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
			int count = 0;
			while ((count = fileReader.read()) != -1) {
				System.out.println((char)count);
			}
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	 * 使用fileReader一次读取一个字符数组
	 */
	public static void readerFile2(String fileName) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
			char[] ch = new char[1024];
			int count = 0;
			while ((count = fileReader.read(ch)) != -1) {
				System.out.println(String.valueOf(ch, 0, count));
			}
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
