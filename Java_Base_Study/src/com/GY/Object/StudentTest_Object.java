package com.GY.Object;

/*
 * Object类的方法：
 * 1.public native int hashCode(): 返回该对象的哈希码值，
 * 	注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值
 * 		（根据实际地址值计算出来的一个整数），你可以理解为地址值
 * 
 * 2.public final native Class<?> getClass() : 返回Object运行时类（字节码文件对象,同一个对象的字节码在内存中存在一次）
 *  	 Class类中
 *   		private native String getName();返回Class对象所表示的实体对象名称
 * 3. public String toString():返回一个以文本方式表示的字符串，建议所有子类都重写此方法
 * 
 * 4.public boolean equals(): 指示某个对象是否和此对象相等（默认情况下比较的地址）
 * 但是比较地址值一般来说意义不大，所以我们需要重写此方法。
 * 怎么重写？
 * 			一般都是用来比较对象的成员变量值是否相等
 * 源码：public boolean equals(Object obj) {
        return (this == obj);
    }
 * 
 * ==.
 * 		基本类型： 比较的是值是否相当
 * 		引用类型： 比较的是地址值是否相同
 * equals（）方法：
 * 		引用类型：默认情况下比较的地址值
 * 
 * 4.protected void finalize() throws Throwable { }:当垃圾回收器确定不存在该对象的引用时，由对象的垃圾回收器调用此方法，用于垃圾回收，但是什么时候回收不确定
 */
public class StudentTest_Object {
	private int age;
	private String name;
	
	public StudentTest_Object() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentTest_Object(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentTest_Object [age=" + age + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
			
		// 这里需要比较成员变量的值是否相等，这里的name是String类型的，引用类型的比较我们
		// 需要使用equals()比较，而不能用==比较
		
		//如果是同一个对象，我们则不需要比对其对象的属性
		if (this == obj) {
			//引用类型比对的是地址值
			return true;
		} 
		//为了提高程序的健壮性，首先判断obj是不是这个学生的一个对象
		//instanceof 判断某个对象是不是该类名的一个对象
		if (!(obj instanceof StudentTest_Object)) {
			return false;
		}
		
		
		StudentTest_Object studentTest_Object = (StudentTest_Object) obj;
		if (this.name == null) {
			if (studentTest_Object.name != null) {
				return false;
			}
			return this.age == studentTest_Object.age;
		} else {
			return this.age == studentTest_Object.age && this.name.equals(studentTest_Object.name);
		}
	}
}
