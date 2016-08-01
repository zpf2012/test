package com.test.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo02 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("F");
		set.add("E");
		set.add("D");
		set.add("A");
		set.add("X");
		set.add("V");
		set.add("N");
		set.add("J");
		set.add("L");
		System.out.println(set);
	}
}
