package com.test_01;
/**
 * ���͵�ʹ��
 * @author zhangpengfei
 * ���ݴ���ֵ���趨����������������
 * ʹ��ͨ�������
 */

class p<T>{
	private T JD;
	private T WD;
	
	public void setJD(T jD) {
		JD = jD;
	}
	
	public T getJD() {
		return JD;
	}
	
	public void setWD(T wD) {
		WD = wD;
	}
	
	public T getWD() {
		return WD;
	}
	
}

public class GenericDemo01 {
	public static void main(String[] args) {
		p<String> p = new p<String>();
		p.setJD("����Ϊ��100");
		p.setWD("ά��Ϊ��120");
		System.out.println(p.getJD());
		System.out.println(p.getWD());
		
		tell(p);
	}
	
	public static void tell(p<?> i) {
		System.out.println(i);
	}
}
