package com.test.collection;
/**
 * List 根据插入顺序排序，可以添加重复元素
 * list 
 */
import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
	public static void main(String[] args) {
		List<String> list = null;
		list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
