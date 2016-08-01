package com.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MMMMMMDA {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {					//使用hasNext()判断是否还有未取出的元素
			Integer integer = (Integer) iter.next();//使用next()输出读取到的元素
			System.out.println(integer);
			
		}
		
	}

}
