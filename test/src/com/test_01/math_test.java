package com.test_01;

public class math_test {
	public static void main(String[] args) {

		double num = 7.4;
		int a = (int) Math.abs(num+0.5);
		int b = (int) Math.ceil(num+0.5);
		int c = (int) Math.floor(num+0.5);
		int d = (int) Math.round(num+0.5);
		int e = (int) Math.round(num-0.5);
		int f = (int) Math.floor(num-0.5);
		int g = (int) Math.ceil(num-0.5);
		int h = (int) Math.abs(num-0.5);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
	
}
