package com.test_01;
/**
 * 泛型的使用
 * @author zhangpengfei
 * 根据传入值的设定，决定参数的类型
 * 使用通配符：？
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
		p.setJD("经度为：100");
		p.setWD("维度为：120");
		System.out.println(p.getJD());
		System.out.println(p.getWD());
		
		tell(p);
	}
	
	public static void tell(p<?> i) {
		System.out.println(i);
	}
}
