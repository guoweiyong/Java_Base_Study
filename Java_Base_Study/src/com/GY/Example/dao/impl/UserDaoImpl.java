package com.GY.Example.dao.impl;
import java.util.ArrayList;
import com.GY.Example.dao.UserDao;
import com.GY.Example.pojo.User;

/**
 * 用户登录注册实现类 （集合版）
 * @author guoweiyong
 *
 */
public class UserDaoImpl implements UserDao {
	private static ArrayList<User> userInfoLists =  new ArrayList<User>();
	
	@Override
	public boolean isLogin(String userName, String password) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (User user : userInfoLists) {
			
			if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				flag = true;
			}
		}
		return flag;
	}

	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		//ArrayList添加元素一定会成功
		userInfoLists.add(user);
		
	}
}
