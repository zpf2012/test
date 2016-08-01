package com.test.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 * 
 * @author zhangpengfei
 *	set 不可以添加重复元素
 *  HashSet不会排序
 *  TreeSet不会排序
 */
public class SetDemo01 {
	public static void main(String[] args) {

		SetDemo01 sd = new SetDemo01();
		sd.TreeSetDemo();
		
		sd.HashSetDemo();
	}
	/*
	 * TreeSet：以树的形式储存数据，数据会被排序
	 */
	 public void TreeSetDemo() {
		Set<Integer> st = null;
		st = new TreeSet<Integer>();
		st.add(3);
		st.add(1);
		st.add(2);
		st.add(45);
		st.add(34);
		st.add(39);
		st.add(12);
		st.add(25);
		st.add(67);
		st.add(0);
		st.add(8);
		st.add(70);		
		System.out.println("TreeSet: "+st);
	}
	 /*
	  * HashSet :相当于一个集合，数据不会被排序
	  */
	 public void HashSetDemo() {
			Set<Integer> st = null;
			st = new HashSet<Integer>();
			st.add(3);
			st.add(1);
			st.add(1);
			st.add(2);
			st.add(45);
			st.add(34);
			st.add(39);
			st.add(12);
			st.add(25);
			st.add(67);
			st.add(0);
			st.add(8);
			st.add(70);		
			System.out.println("HastSet: "+st);
		}
}
