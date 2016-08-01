package com.test.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * 
 * @author zhangpengfei
 *map.values()返回值类型为Collection类型
 *map.keySet()返回值类型为Set类型
 */
public class MapDemo01 {
	public static void main(String[] args) {
		Map<Integer, String> map = null;
		map = new HashMap<Integer,String>();
		map.put(1, "hello");
		map.put(2, "world");
		map.put(3, "zhang");
		map.put(4, "lee");
		map.entrySet();
		
		Collection<String> value = map.values();	//Map中values()方法返回值类型为Collection类型
		Iterator<String> li = value.iterator();		//使用迭代器
				
		Set<Integer> key= map.keySet();
		Iterator<Integer> iter = key.iterator();
		for(int i = 0; i < value.size();i++){
			while (iter.hasNext()) {
				System.out.print(iter.next()+"----");
				break;
			}
			while (li.hasNext()) {
				System.out.println(li.next());
				break;
			}
		}
		
	}
}
