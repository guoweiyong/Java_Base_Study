package com.GY.IO.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 基本数据操作流
 */
public class DataStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write("data.text");
		read("data.text");
	}
	
	public static void write(String fileName) {
		DataOutputStream dataOutputStream = null;
		try {
			dataOutputStream = new DataOutputStream(new FileOutputStream(fileName));
			dataOutputStream.writeFloat(2.11F);
			dataOutputStream.writeInt(100);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (dataOutputStream != null) {
				try {
					dataOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void read(String fileName) {
		DataInputStream dataInputStream = null;
		try {
			dataInputStream = new DataInputStream(new FileInputStream(fileName));
			System.out.println(dataInputStream.readFloat());
			System.out.println(dataInputStream.readInt());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (dataInputStream != null) {
				try {
					dataInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
