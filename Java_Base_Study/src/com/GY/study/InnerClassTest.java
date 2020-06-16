package com.GY.study;

public class InnerClassTest {

	public static void main(String[] args) {
		
		//new Outer().method();
		
		//如何访问成员内部类
		//外部类.内部类 对象名 = 外部类对象.内部内对象
//		Outer.Inner inner = new Outer().new Inner();
//		inner.show();
		
		//new Outer().method3();
		
		//static 修饰内部类的访问方式
		// 外部类名.内部类名 对象名称 = new 外部类名.内部类名()
//		Outer.Inner3 inner3 = new Outer.Inner3();
//		inner3.show3();
//		inner3.method3();
//		
		//method3的另外一种调用模式
		//Outer.Inner3.method3();
		
		//测试局部内部类的调用
		//new Outer().method2();
		
		//测试调用匿名内部类
		new Outer().method4();
	}
}

class Outer {
	private int num = 10;
	
	/*
	 * 成员内部类
	 */
	class Inner {
		public void show() {
			
			System.out.print("成员内部类方位外部成员" + num );
		}
	}
	
	public void method() {
		System.out.print("外部访问内部类通过对象方位" + "\n");
		new Inner().show();
	}
	
	/*
	 * 局部内部类
	 */
	public void method2() {
		final int cacheCount = 100;
		class TempInner {
			public void show() {

				System.out.print("局部内部类方位外部成员" + cacheCount);
			}
		}
		
		TempInner tempInner = new TempInner();
		tempInner.show();
	}
	
	/*
	 * 访问private修饰的内部类，通过一个公共方法来访问
	 */
	private class Inner2 {
		public void show2() {
			System.out.println("private修饰的内部类");
		}
	}
	
	public void method3() {
		Inner2 inner2 = new Inner2();
		inner2.show2();
	}
	
	
	/*
	 * static 修饰的内部类
	 */
	private static int tempNum = 400;
	public static class Inner3 {
		public void show3() {
			System.out.print("静态修饰符修饰内部类访问外部类" + tempNum);
		}
		
		public static void method3() {
			System.out.print("静态修饰符修饰内部类访问外部类" + tempNum);
		}
	}
	
	/*
	 * 匿名内部类的用法
	 */
	public void method4() {
		//第一种方法，当只有一个方法时调用,实质是创建一个类或接口的子类对象，然后调用方法
//		new TempClass() {
//			@Override
//			public void show() {
//				// TODO Auto-generated method stub
//				System.out.println("匿名内部类的第一种调用方法");
//			}
//		}.show();
		
		
		//如果有多个方法的时候我们可以使用多台来调用
		TempClass tempClass = new TempClass() {
			
			@Override
			public void show2() {
				// TODO Auto-generated method stub
				System.out.println("多个方法使用多态的方式来调用");
			}
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("多个方法使用多态的方式来调用");
				
			}
		};
		
		tempClass.show();
		tempClass.show2();
	}
}

interface TempClass {
	public abstract void show();
	public abstract void show2();
}
