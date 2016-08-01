package com.test_01;

public class children extends Father{
	
	public static void main(String[] args) {
		Father f = new Father();
		f.outname();
		Father f2 = new children();
		f2.outname(); 		
				
	}
	public void outname(){
		super.outname();
		System.out.println("child");
	}
}
