package com.test_01;

class myException extends Exception{
	public myException(String msg){
		super(msg);
	}
}

public class DIY_Exception {
	public static void main(String[] args) {
		try {
			throw new myException("�Զ����쳣");
		} catch (myException e) {
			System.out.println(e);
		}
	}
}
