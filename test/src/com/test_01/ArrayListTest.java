package com.test_01;

import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,7,9,12,23);
		for(int i = 0 ; i < list.size();i++){
			System.out.print(list.get(i)+",");
		}
	}
}
