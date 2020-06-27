package com.GY.Map;

import java.util.ArrayList;
import java.util.Collections;

import javax.security.auth.x500.X500Principal;

/*
 * 使用ArrayList来实现斗地主 发牌 洗牌 看牌等操作
 * 
 * 需求分析：
 * 		1.装牌
 * 		2.洗牌
 * 		3.发牌
 * 		4。看牌
 */
public class PokerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.首先我们创建一个牌盒
		String[] pokerColors = {"♠","❤","♣","◇"};
		String[] pokerNums = {"3", "4","5","6","7","8","9","10","J","Q","K","A","2"};
		
		ArrayList<String> pokerArrayList = new ArrayList<String>();
		//装牌
		for (String coloer : pokerColors) {
			for (String numString : pokerNums) {
				pokerArrayList.add(coloer.concat(numString));
			}
		}
		
		pokerArrayList.add("小王");
		pokerArrayList.add("大王");
		
		//洗牌
		Collections.shuffle(pokerArrayList);
		
		//发牌
		ArrayList<String> zhanshan = new ArrayList<String>();
		ArrayList<String> lishi = new ArrayList<String>();
		ArrayList<String> wangwu = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();
		
		for (int i = 0; i < pokerArrayList.size(); i++) {
			if (i >= pokerArrayList.size() - 3) {
				dipai.add(pokerArrayList.get(i));
			} else if (i % 3 == 0) {
				zhanshan.add(pokerArrayList.get(i));
			} else if (i % 3 == 1) {
				lishi.add(pokerArrayList.get(i));
			} else if (i % 3 == 2) {
				wangwu.add(pokerArrayList.get(i));
			}
		}
		
		// 看牌
		lookPoker("zhansan", zhanshan);
		lookPoker("lishi", lishi);
		lookPoker("wangwu", wangwu);
		lookPoker("底牌", dipai);
	}

	/**
	 * 看牌方法
	 * @param nameString
	 * @param pokerArrayList
	 */
	public static void lookPoker(String nameString, ArrayList<String> pokerArrayList) {
		System.out.println(nameString + "的牌是：");
		for (String string : pokerArrayList) {
			//不加ln是不换行打印
			System.out.print(string + " ");
		}
		//加ln是换行打印
		System.out.println();
	}
}
