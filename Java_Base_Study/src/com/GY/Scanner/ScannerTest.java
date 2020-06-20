package com.GY.Scanner;

import java.util.Scanner;

/*
 *  实现一个用户登录的密码 ，猜字小游戏的功能
 */


public class ScannerTest {
	
	private static final String userName = "guoweiyong";
	private static final String password = "123";
	

	public static void main(String[] args) {
		//获取用户输入的用户名和密码
		System.out.println("请输入您的用户名：");
		Scanner scanner = new Scanner(System.in);
		String usernameString = scanner.nextLine();
		System.out.println("请输入您的密码：");
		String passwordString = scanner.nextLine();
		//判断用户名密码是否正确
		do {
			if (!usernameString.equals(userName) || !passwordString.equals(password)) {
				System.out.println("您输入的账号/密码不正确，请重新输入");
				
				System.out.println("请输入您的用户名：");
				usernameString = scanner.nextLine();
				System.out.println("请输入您的密码：");
				passwordString = scanner.nextLine();
			} else {
				System.out.println("恭喜您登入成功！开始进入猜数字字小游戏，输入的数字在0-100范围内");
				System.out.println("请输入您猜的数字：");
				
				break;
			}
		} while (true);
		
		// 猜字小游戏的循环 Math.random()产生了一个0 到 1 之间的数
		int num = (int)(Math.random() * 100) + 1;
		while (true) {
			// 这里我们需要判断，输入的字符是否是数字，并且在我们输入的字符串之内
			String inpuString = scanner.nextLine();
			if (isNumber(inpuString)) {
				int count = Integer.parseInt(inpuString);
				if (count > 100 || count < 0) {
					System.out.println("您输入的字符不符合要求，请重新输入：");
				}

				// 这是符合要求的数字，然后我们在比较字符有没有猜中 ，这里需要使用二分法
				if (count == num) {
					System.out.println("恭喜您，猜中了，游戏结束！");

					scanner.close();

					break;
				}
				if (count < num) {
					System.out.println("您猜的数字小了，请在猜：");
				} else {
					System.out.println("您猜的字大了，请在猜：");
				}
			} else {
				System.out.println("您输入的字符类型不对，请重新输入！");
			}
		}
	}
	
	/**
	 * 判断一个字符串中是否是纯数字
	 * @param string
	 * @return
	 */
	public static boolean isNumber(String string) {
		for (int i = 0; i < string.length(); i++) {
			//Character.isDigit(): 判断字符是否为数字
			if (!Character.isDigit(string.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
}
