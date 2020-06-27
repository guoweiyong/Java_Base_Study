package com.GY.Example;

import java.util.Scanner;

import com.GY.Example.dao.UserDao;
import com.GY.Example.dao.impl.UserDaoImpl;
import com.GY.Example.games.UserGame;
import com.GY.Example.pojo.User;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {
			System.out.println("----------------欢迎界面--------------");
			System.out.println("1: 登录");
			System.out.println("2: 注册");
			System.out.println("3: 退出");
			System.out.println("请选择你要使用的功能：");

			// 首先我们获取键盘出入都是使用字符串来接受
			Scanner scanner = new Scanner(System.in);
			String inputString = scanner.nextLine();

			UserDao uDao = new UserDaoImpl();
			switch (inputString) {
			case "1":
				// 登录
				System.out.println("----------------登录界面--------------");
				System.out.println("请输入您的用户名：");
				String userName = scanner.nextLine();
				System.out.println("请输入您的密码：");
				String password = scanner.nextLine();

				boolean flag = uDao.isLogin(userName, password);
				if (flag) {
					System.out.println("登录成功！");
					//scanner.close();
					System.out.println("可以开始完猜字小游戏了！");
					System.out.println("请输入0-100之间的一个数字：");
					UserGame.numGames();
					scanner.close();
					System.exit(0);
				} else {
					System.out.println("登录失败！");
				}
				break;

			case "2":
				System.out.println("----------------注册界面--------------");
				System.out.println("请输入您的用户名：");
				String newUserName = scanner.nextLine();
				System.out.println("请输入您的密码：");
				String newPassword = scanner.nextLine();
				User user = new User();
				user.setUserName(newUserName);
				user.setPassword(newPassword);

				uDao.register(user);

				System.out.println("注册成功！");
				break;

			case "3":
			default:
				System.out.println("感谢您的使用");
				System.exit(0);
				break;
			}
		}
	}

}
