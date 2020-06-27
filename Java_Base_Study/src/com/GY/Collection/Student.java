package com.GY.Collection;

import java.util.Comparator;

/*
 * 如果在TreeSet集合中缓存，需要实现接口Comparable接口
 */
public class Student implements Comparable<Student> {

	//名称
	private String name;
	
	//年龄
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return 0;
		/**
		 * 首先规定规则，按照年龄排序  ---》 如果年龄相同就比较姓名
		 */
		int num = this.age - o.age;
		return num == 0 ? this.name.compareTo(o.name) : num;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
