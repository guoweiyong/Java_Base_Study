package com.GY.Example.dao;

import com.GY.Example.pojo.User;

public interface UserDao {
	
	/**
	 * 用户登录的方法
	 * @param userName 用户名
	 * @param password 用户密码
	 * @return
	 */
	public abstract boolean isLogin(String userName, String password);
	
	/**
	 * 用户注册结果
	 * @param user
	 */
	public abstract void register(User user);
}
