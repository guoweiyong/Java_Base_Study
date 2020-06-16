package com.GY.Object;

public class ObjectTest {

	public static void main(String[] args) {
		
		StudentTest_Object studentTest_Object = new StudentTest_Object();
		studentTest_Object.setAge(23);
		studentTest_Object.setName("ss");
		System.out.println(studentTest_Object.hashCode());
		
		StudentTest_Object studentTest_Object2 = new StudentTest_Object();
		System.out.println(studentTest_Object2.hashCode());
		
		System.out.println("------------------");
		System.out.println(studentTest_Object.getClass().getName());
		System.out.println(studentTest_Object2.getClass().getName());
		
		System.out.println("--------------------");
		System.out.println(studentTest_Object.toString());
		System.out.println(studentTest_Object2.toString());
		
		System.out.println("-----------");
		StudentTest_Object studentTest_Object3 = new StudentTest_Object(23, "sss");
		System.out.println(studentTest_Object3.toString());
		
		System.out.println("------------");
		//比较两个引用类型
		System.out.println(studentTest_Object.equals(studentTest_Object3));
	}
}
