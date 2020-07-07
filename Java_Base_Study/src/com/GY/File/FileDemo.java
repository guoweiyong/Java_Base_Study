package com.GY.File;

import java.io.File;
import java.io.IOException;

/*
 * 文件的表示形式
 * 
 * 构造方法：
 * 		public File(String pathname): 根据路径来生成一个文件对象
 * 		
 * 	public boolean renameTo: 改名方法：如果路径相同则是改名 ，路径不同是改名加剪切
 */
public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creatFile();
		//creatDir();
		//creatDirs();
		//delete();
	}
	
	/*
	 * 删除功能
	 */
	public static void delete() {
		String pathname = "/Users/guoweiyong/Desktop/测试/Test.java";
		File file = new File(pathname);
		//Java中的删除不走回收站
		//要删除一个文件夹，请注意文件夹内不能包含文件或者文件夹
		boolean flag = file.delete();
		System.out.println("删除文件成功===" + flag);
	}
	
	/*
	 * 创建多级文件夹，如果父文件夹不存在会自动创建
	 */
	public static void creatDirs() {
		String pathname = "/Users/guoweiyong/Desktop/测试/Test2/aaa/bbb";
		File file = new File(pathname);
		//mkdirs: 只能创建文件夹--》 不能创建文件
		boolean flag = file.mkdirs();
		System.out.println("创建文件成功===" + flag);
	}
	
	/*
	 * 创建一个文件夹
	 */
	 public static void creatDir() {
			String pathname = "/Users/guoweiyong/Desktop/测试/Test";
			File file = new File(pathname);
			// 1.创建一个文件目录, 文件不存在，创建并返回true，存在时不创建，并返回false
			//注意: 要想在某个目录下创建内容，该目录首先必须存在
			boolean flag = file.mkdir();
			System.out.println("创建文件成功===" + flag);
	 }
	
	/*
	 * 创建文件的方法 
	 */
		public static void creatFile() {
			// 创建一个文件对象
			String pathname = "/Users/guoweiyong/Desktop/测试/Test.java";
			File file = new File(pathname);

			// 1.创建一个文件
			boolean flag = false;
			try {
				// 当文件不存在时，创建文件并返回true，如果文件已经存在就不创建，则返回false
				flag = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("创建文件成功===" + flag);
		}

}
