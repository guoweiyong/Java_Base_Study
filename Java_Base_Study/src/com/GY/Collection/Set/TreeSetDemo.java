package com.GY.Collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

import com.GY.Collection.Student;

/*
 *  TreeSet储存自定义对象并保证排序和唯一
 */

public class TreeSetDemo {
	public static void main(String[] args) {
		
		//TreeSet<Student> treeSet = new TreeSet<Student>();//自然排序、
		
		//比较器排序
		TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				
				//return 0;
				int num = o1.getAge() - o2.getAge();
				return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
			}
		});
		
		Student student = new Student("lishi", 22);
		Student student1 = new Student("wangwu", 23);
		Student student2 = new Student("zhangsan", 18);
		Student student3 = new Student("zhaoliu", 44);
		Student student4 = new Student("gy", 15);
		Student student5 = new Student("lishi", 22);
		
		treeSet.add(student);
		treeSet.add(student1);
		treeSet.add(student2);
		treeSet.add(student3);
		treeSet.add(student4);
		treeSet.add(student5);
		
		
		
		
		for (Student tempStudent : treeSet) {
			System.out.println("Student===" + tempStudent);
		}

	
	}

}
