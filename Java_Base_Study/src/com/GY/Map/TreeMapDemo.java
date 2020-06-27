package com.GY.Map;

import java.util.TreeMap;

/*
 * 需求：“aababcabcdabcde”  获取字符串中每一个字母出现的次数
 */
public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		String string = "aababcabcdabcde";
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		//遍历循环数组
		for (char temp : string.toCharArray()) {
			//把字符作为集合的key  然后去查询集合中有没有
			String keyString = String.valueOf(temp);
			if (treeMap.containsKey(keyString)) {
				//如果集合中包含这个key，那就取出这个值 加1
				Integer tempCountInteger = treeMap.get(keyString);
				tempCountInteger += 1;
				treeMap.put(keyString, tempCountInteger);
			} else {
				treeMap.put(keyString, 1);
			}
		}
		
		//现在Map集合显示的是所有字母和出现次数键值对
		StringBuilder stringBuilder = new StringBuilder();
		for (String string2 : treeMap.keySet()) {
			Integer valueInteger = treeMap.get(string2);
			stringBuilder.append(string2 + "(" + valueInteger + ")");
		}
		
		System.out.println("string===" + stringBuilder);
	}

}
