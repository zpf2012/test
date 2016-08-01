package com.test_01;

public class throw_test {
	public static void main(String[] args) {
		try {
			throw new Exception("实例化对象异常");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
