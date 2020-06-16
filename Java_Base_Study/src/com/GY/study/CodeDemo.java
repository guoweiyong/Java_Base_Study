package com.GY.study;
/*
 * 代码块测试类
 */
public class CodeDemo {
	public static void main(String[] args) {
		//局本部代码块 --> 局部位置，用于限定局部变量的声明周期，及早释放，有助于内存利用率
//		{
//			int x =10;
//			System.out.print(x);
//		}
		//System.out.print(x);
		
		//测试构造代码块
		Code code = new Code();
		System.out.print("--------------");
		
		Code code2 = new Code(3);
		
	}
}


class Code  {
	
	//静态代码块
	static {
		int y = 2000;
		System.out.print(y);
	}
	
	//构造代码块
	{
		int x = 100;
		System.out.print(x);
	}
	
	//构造方法
	public Code() {
		System.out.print("无惨构造方法");
	}
	
	public Code(int a) {
		System.out.print("有参构造方法");
	}
}