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
		while (iter.hasNext()) {					//ʹ��hasNext()�ж��Ƿ���δȡ����Ԫ��
			Integer integer = (Integer) iter.next();//ʹ��next()�����ȡ����Ԫ��
			System.out.println(integer);
			
		}
		
	}

}
