package com.test_01;

public class static_test {
	static int x = 10;
	static{
		x+= 5;
	};
	public static void main(String[] args) {
		System.out.println("x="+x);
	}
	static{
		x /= 3;
	}
}
