package com.test_01;


public class temp_test {
	int m;
	public temp_test(int a){
		m = a;
	}
	public static void main(String[] args) {
//		
		temp_test t1,t2;
		int j, k;
		j = 3;
		k = 5;
		t1 = new temp_test(j);
		t2 = new temp_test(k);
		System.out.println(t1);
		System.out.println(t2);
	}
}
