package com.corejava.interfaces;

public class InterfImpl implements Interf {

	public static void main(String[] args) {
		InterfImpl  interfImpl = new InterfImpl();
		interfImpl.m1();
		interfImpl.m2();
	}

	@Override
	public void m1() {
		System.out .println("m1 from service provider");
		
	}

	@Override
	public void m2() {
		System.out .println("m2 from service provider");
		
	}

}
