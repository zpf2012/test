package com.test.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 * 
 * @author zhangpengfei
 *	set ����������ظ�Ԫ��
 *  HashSet��������
 *  TreeSet��������
 */
public class SetDemo01 {
	public static void main(String[] args) {

		SetDemo01 sd = new SetDemo01();
		sd.TreeSetDemo();
		
		sd.HashSetDemo();
	}
	/*
	 * TreeSet����������ʽ�������ݣ����ݻᱻ����
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
	  * HashSet :�൱��һ�����ϣ����ݲ��ᱻ����
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
