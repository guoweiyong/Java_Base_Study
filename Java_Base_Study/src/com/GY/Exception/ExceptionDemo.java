package com.GY.Exception;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 异常： 程序出现了不正常的问题 
 * try..catch...finaly格式
 * try{
 * 		可能出现问题的代码
 * } catch(异常变量名) {
 * 		针对问题的处理；
 * }finaly {
 * 	释放资源
 * }
 * 
 * 注意：
 * 		try里面的代码越少越好。因为放在try里面的代码，java会走异常开启机制，如果代码越多。java就需要更多的资源来处理它
 * 		catch里面必须有内容，哪怕是给出一个简单的提示
 * 
 * 
 * JDK7之后新的处理方案:
 * 			try {
 * 				
 * 			}catch(异常名 | 异常名2 | ... 变量) {
 * 				...
 * 			}
 * 
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		
		//method3();
//		
//		try {
//			method5();
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("over");
		
		//测试
		System.out.println(getInt());
	}
	/*
	 * 如果catch里面有return语句，请问finally里面的代码还会执行吗？
	 * 如果会，请问是在return前，还是return 后
	 * 
	 * 答案： 会执行， 在return前执行
	 */
	public static int getInt() {
		int a = 10;
		try {
			System.out.println(a / 0);
			a = 20;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			a = 30;
			return a;
			/*
			 * return a在执行这一步的时候，这里不是返回return a而是return 30；
			 * 这个返回路径就形成了，但是他发现后面还有finally，所以继续执行finally的内容 a = 40
			 * 再次回到以前的返回路径，继续走return 30，实质上a的值确实是40
			 */
		}finally {
			a = 40;
		}
		
		return a;
	}
	
	/*
	 * 使用throws来抛出异常
	 */
	public static void method5() throws ParseException {
		String string = "2014-11-20";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = simpleDateFormat.parse(string);
	}
	
	public static void method4() {
		String string = "2014-11-20";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = simpleDateFormat.parse(string);
			System.out.println();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	public static void method3() {
		int a = 10;
		int b = 0;
		
		int[] arr = {1,2,3};
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("发生异常走这里====" + e.toString());
		} 
	}
	
	public static void method2() {
		int a = 10;
		int b = 0;
		
		int[] arr = {1,2,3};
		try {
			//注意：一旦try里面出现了问题，就会把问题跑出去，然后和catch里面的问题匹配，
			//一旦有匹配的，就在catch里面执行，然后结束了try...catch。继续执行后面的语句
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("发生异常走这里====" + e.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("您访问了不存在的索引===" + e.toString());
		}
	}
	
	/*
	 * 一个异常处理
	 */
	public static void method() {
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("发生异常走这里====" + e.toString());
		}
		
	}
}
