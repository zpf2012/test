package com.test_01;

import com.test_IO.test_01_file;

public class inner_class_test02 {
	public Contents getCont() {
		return new Contents(){
			private int i = 11;
			
			public int value() {
				return i;
			}
		};
	}
	public static void main(String[] args) {
		inner_class_test02 it = new inner_class_test02();
		Contents c = it.getCont();
	}
}
