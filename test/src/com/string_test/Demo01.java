package com.string_test;
/**
 * StringBuffer�г��õļ�������
 * @author zhangpengfei
 *
 */

public class Demo01 {
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("I love ");
		System.out.println(sbf);
		
		sbf.insert(7, "Java");//���ѡ��ӵھ�λ��ʼ���������쳣
		System.out.println(sbf.indexOf("I"));
		sbf.substring(3, 8);
		System.out.println(sbf);
		sbf.replace(2, 2, "memeda");//����滻����ʼλ�úͽ���λ����һ���ģ���ô�����Ľ��һ��
//		sbf.insert(2,"memeda");
		System.out.println(sbf);
	}
}
