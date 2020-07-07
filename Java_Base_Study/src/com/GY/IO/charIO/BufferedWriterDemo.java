package com.GY.IO.charIO;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 字符缓冲输出流
 */
public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bufferedWriterFile("test2.text");
	}
	
	/*
	 * 使用高效输出字符流来写一个字符串到文件总
	 */
	public static void bufferedWriterFile(String fileName) {
		BufferedWriter bufferedWriter = null;
		
		try {
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
			//使用高效字符流来写字符串 到文件
			for (int i = 0; i < 10; i++) {
				bufferedWriter.write("安东尼刷卡号地块撒谎的萨达到拉萨讲道理撒娇的的撒的撒电视剧阿来得及撒来得及");
				//根据系统属性写入一个换行符
				bufferedWriter.newLine();
				//刷新缓冲区
				//bufferedWriter.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
