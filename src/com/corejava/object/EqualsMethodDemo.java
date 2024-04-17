package com.corejava.object;

public class EqualsMethodDemo {

	int rollNo;
	String name;

	public EqualsMethodDemo(int rollNo, String name) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualsMethodDemo s1 = new EqualsMethodDemo(1, "Neha");
		EqualsMethodDemo s2 = new EqualsMethodDemo(2, "Dev");
		EqualsMethodDemo s3 = new EqualsMethodDemo(3, "Neha");
		EqualsMethodDemo s4 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s4.equals(s1));
	}
	

}
