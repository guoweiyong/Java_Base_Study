package com.GY.Collection;

/*
 * 定义一个反向接口
 */
public interface Inner<E> {
	public abstract void show(E e);

}

//第一种形式，实现类的时候就知道类型了 （不常见）
class InnerDemo implements Inner<String> {
	@Override
	public void show(String e) {
		// TODO Auto-generated method stub
		
	}
}

//第二种形式: 使用的时候知道具体的类型 （常见）
class InnerDemo2<E> implements Inner<E> {
	@Override
	public void show(E e) {
		// TODO Auto-generated method stub
		
	}
}
