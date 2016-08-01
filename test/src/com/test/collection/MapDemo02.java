package com.test.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo02 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = null;
		map1 = new HashMap<Integer,String>();
		map1.put(1, "Hello");
		map1.put(2, "Java");
		Set<Entry<Integer, String>> set = map1.entrySet(); //将键值对内容进行绑定
		
		Iterator<Entry<Integer, String>> se = set.iterator(); //使用迭代器存放键值对内容
		while (se.hasNext()) {
			Map.Entry<Integer,String> entry = (Map.Entry<Integer, String>) se.next();
			System.out.println(entry);
			
		}
		
	}
}
