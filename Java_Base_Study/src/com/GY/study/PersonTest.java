package com.GY.study;

/**
 * 测试抽象类作为形参
 * @author guoweiyong
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试
		PersonDemo personDemo = new PersonDemo();
		//第一种方法
		//personDemo.method(new Student());
		
		//第二中方法
		personDemo.method(new Person() {
			
			@Override
			public void study() {
				// TODO Auto-generated method stub
				System.out.print("使用匿名函数来实现抽象类作为形参的调用");
			}
		});
		
		personDemo.method2(new Love() {
			@Override
			public void like() {
				// TODO Auto-generated method stub
				System.out.print("使用匿名函数来实现接口作为形参的调用");
			}
		});
	}

}


abstract class Person {
	public abstract void study();
}

class PersonDemo {
	/*
	 * 抽象类作为形参
	 */
	public void method(Person person) {
		person.study();
	}
	
	/*
	 * 接口作为形参
	 */
	public void method2(Love love) {
		love.like();
	}
}

class Student extends Person {
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.print("学生应该学习");
	}
}
/**
 * 定义一个接口
 * @author guoweiyong
 *
 */
interface Love {
	public void like() ;
}