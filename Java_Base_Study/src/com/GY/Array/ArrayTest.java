package com.GY.Array;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		//int[] tempArray = {80,12,34,6,50,48};
		//System.out.println("排序前数组:");
		//printArray(tempArray);
		//System.out.println("排序后数组:");
		//冒牌排序
		//sortArrayTest(tempArray);
		
		//选择排序
		//selectedSortArray(tempArray);
		
		//插入排序法
		//insertSortArray(tempArray);
		//printArray(tempArray);
		
		//测试数组二分法查找
		int[] tempArray = {11,22,33,44,55,66,77};
		int index = getIndex(tempArray, 333);
		System.out.println("index==" + index);
	
	}
	
	
	/*
	 * 数组的冒泡排序代码
	 * 冒泡排序，排序array.length-1次 ， 所以外层循环控制排序的次数，内存循环控制比较。每次比较从
	 * 第一个元素开始，相邻的两个元素两两比较， 看是否满足大小关系要求，如果不满足就让它俩互换。
	 * 一次冒泡会让至少一个元素移动到它应该在的位置，重复n 次
	 * 就完成了 n 个数据的排序工作。
	 */
	public static void sortArrayTest(int[] array) {
		//数组只有一个元素或则没有元素，不需要排序
		if (array.length <= 1) {
			return;
		}
		
		for (int i = 0; i < array.length -1; i++) {
			//标记数组是都还需要排序 提前退出冒泡的标志是，中间没有任何一次的，这个数组已经有序了
			boolean flag = false;
			
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j+1]) {
					//交换数据
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					//如果数组中有元素更换了位置就代表数组还需要排序
					flag = true;
				}
			}
			
			if (!flag) {
				//代表没有数据交换，结束数组排序
				break;
			}
		}
	}
	
	/*
	 * 选择排序的基本思路：把第一个元素和后面的所有元素进行比较
	 * 从0开始，依次和后面的的元素比较，小的往前放，
	 * 第一次比较完成之后，最小出现在最小索引处
	 */
	public static void selectedSortArray(int[] array) {
		 for (int i = 0; i < array.length - 1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	/*
	 * 插入排序基本思想：将n个元素分为已有序列和无忧序列两个部分，每次处理将无有序列中的第一个元素，与
	 * 有序数列的元素从后往前逐个进行比较，找出插入位置，将该元素插入到有序数列的合适位置中
	 */
	public static void insertSortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			//从还没有排序的部分选第一个 和已经排序好的元素进行比较
			for (int j = i; (j > 0) && (array[j] < array[j - 1]); j--) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}
		}
	}
	
	/*
	 * 打印数组
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i]);
			} else {
				System.out.println(array[i] + ",");
			}
		}
	}


	/*
	 * 实现二分查找数组中的数据
	 * 查找要求： 首先要求数组是有序的，如果是无序的则采用基本查找
	 */
	public static int getIndex(int[] arr, int value) {
		int max = arr.length - 1;
		int min = 0;
		
		int mid = (max + min)/2;
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				//代表往左边查找
				max = mid - 1;
			} else {
				//往右边查找
				min = mid + 1;
			}
			
			//如果查找数据，当最小索引 大于 最大索引的时候，表示查找数据不存在
			if (min > max) {
				return - 1;
			}
			
			mid = (max + min)/2;
		}
		
		return mid;
	}



}