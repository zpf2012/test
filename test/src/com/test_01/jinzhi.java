package com.test_01;

public class jinzhi {
	public static void main(String[] args) {
		int x = 067;
		int y = 0x123;
		int z = 0b1101;
		int nn = 0xEA45F;

		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println();
		System.out.println(Integer.toHexString(x));
		System.out.println(Integer.toHexString(y));
		System.out.println(Integer.toHexString(z));
		System.out.println(Integer.toHexString(nn));
	}

}
