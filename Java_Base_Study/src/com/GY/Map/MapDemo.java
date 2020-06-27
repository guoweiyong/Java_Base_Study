package com.GY.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 得到所有键值对对象的集合，然后遍历
 */

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "lisi");
		map.put("2", "zhangsan");
		map.put("3", "wangwu");
		map.put("4", "zhaoliu");
		
		//得到所有键值对的集合
		Set<Entry<String, String>> con = map.entrySet();
		for (Entry<String, String> entry : con) {
			System.out.println("entry====" + entry);
		}
		
	}
}
