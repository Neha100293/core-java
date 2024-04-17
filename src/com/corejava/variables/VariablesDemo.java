package com.corejava.variables;

public class VariablesDemo {
	static int[] d = new int[3];

	static int a = 10; // class variables
	int c = 20;// instance variable

	public static void main(String[] args) {
		int b = 100;// local variable
		VariablesDemo variables = new VariablesDemo();
//		
		//System.out.println(d);
	System.out.println(d[0]);
		System.out.println(variables.c);// call by reference name
		System.out.println(a);// call by class name
		variables.a = 888;
		variables.c = 999;

		VariablesDemo variables1 = new VariablesDemo();
		System.out.println(a);
		System.out.println(variables1.c);
		System.out.println(b);

	}
}
