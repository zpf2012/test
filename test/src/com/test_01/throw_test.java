package com.test_01;

public class throw_test {
	public static void main(String[] args) {
		try {
			throw new Exception("ʵ���������쳣");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
