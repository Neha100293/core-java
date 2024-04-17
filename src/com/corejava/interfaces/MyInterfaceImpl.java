package com.corejava.interfaces;

public class MyInterfaceImpl implements MyInterface {
	public void wish() {
		System.out.println("Hi Good Morning all!!");
	}

	public static void main(String[] args) {
		MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
		myInterfaceImpl.wish();
	}

}