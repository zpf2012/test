package com.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo02 {
	public static void main(String[] args) {
		List<String> list = null;
		list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("C");
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
//			使用迭代输出不能直接删除元素
			System.out.println(iter.next());			
		}
	}
}
