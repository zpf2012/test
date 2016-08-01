package com.string_test;
/**
 * StringBuffer中常用的几个方法
 * @author zhangpengfei
 *
 */

public class Demo01 {
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("I love ");
		System.out.println(sbf);
		
		sbf.insert(7, "Java");//如果选择从第九位开始插入会出现异常
		System.out.println(sbf.indexOf("I"));
		sbf.substring(3, 8);
		System.out.println(sbf);
		sbf.replace(2, 2, "memeda");//如果替换的起始位置和结束位置是一样的，那么与插入的结果一样
//		sbf.insert(2,"memeda");
		System.out.println(sbf);
	}
}
