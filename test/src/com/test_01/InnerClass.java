package com.test_01;


public final class InnerClass {
	public static final int TOTAL_NAMBER = 5;
	public int id = 123;
	
	public void t1(){
		final int a = 15;
		String s = "t1";
		
		new Aclass{
			public void testA(){
				System.out.println(TOTAL_NAMBER);
				System.out.println(id);
				System.out.println(a);
				System.out.println(s);
				
			}
		}.testA();
	}
	public static void main(String[] args) {
		InnerClass ic = new InnerClass();
		ic.t1();
	}
}
