package com.test_01;

/**
 * 带有泛型的方法
 * @author zhangpengfei
 *
 */

class P1{
	public <T>T tell(T t) {
		return t;
	}
}

public class GenericDemo02 {
	public static void main(String[] args) {
		P1 p = new P1();
		System.out.println(p.tell("Hello"));
	}

}
