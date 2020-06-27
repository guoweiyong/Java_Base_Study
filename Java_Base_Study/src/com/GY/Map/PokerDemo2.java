package com.GY.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * 使用map集合来实现模拟斗地主的一些动作
 * 
 * 需求：
 * 		1.首先我们需要把所有牌编号序号放在map中
 */
public class PokerDemo2 {

	public static void main(String[] args) {
		String[] pokerColors = {"◇","♣","❤","♠"};
		String[] pokerNums = {"3", "4","5","6","7","8","9","10","J","Q","K","A","2"};
		
		HashMap<Integer, String> pokerHashMap = new HashMap<Integer, String>();
		ArrayList<Integer> indexArrayList = new ArrayList<Integer>();
		
		//装牌
		int count = 1;
		for (String numString : pokerNums) {
			for (String string : pokerColors) {
				pokerHashMap.put(count, string.concat(numString));
				indexArrayList.add(count);
				count++;
			}
		}
		indexArrayList.add(count);
		pokerHashMap.put(count, "小王");
		count++;
		pokerHashMap.put(count, "大王");
		indexArrayList.add(count);
		
		
		//洗牌
		Collections.shuffle(indexArrayList);
		
		// 发牌
		TreeSet<Integer> zhanshan = new TreeSet<Integer>();
		TreeSet<Integer> lishi = new TreeSet<Integer>();
		TreeSet<Integer> wangwu = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();

		for (int i = 0; i < indexArrayList.size(); i++) {
			if (i >= indexArrayList.size() - 3) {
				dipai.add(indexArrayList.get(i));
			} else if (i % 3 == 0) {
				zhanshan.add(indexArrayList.get(i));
			} else if (i % 3 == 1) {
				lishi.add(indexArrayList.get(i));
			} else if (i % 3 == 2) {
				wangwu.add(indexArrayList.get(i));
			}
		}

		// 看牌
		lookPoker("zhansan", zhanshan, pokerHashMap);
		lookPoker("lishi", lishi, pokerHashMap);
		lookPoker("wangwu", wangwu, pokerHashMap);
		lookPoker("底牌", dipai, pokerHashMap);
		
	}
	
	/**
	 * 看牌方法
	 * @param nameString
	 * @param pokerArrayList
	 */
	public static void lookPoker(String nameString, TreeSet<Integer> pokerSet, HashMap<Integer, String> pokerMap) {
		System.out.println(nameString + "的牌是：");
		for (Integer numInteger : pokerSet) {
			//不加ln是不换行打印
			System.out.print(pokerMap.get(numInteger) + " ");
		}
		//加ln是换行打印
		System.out.println();
	}
}
