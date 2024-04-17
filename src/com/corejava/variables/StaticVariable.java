package com.corejava.variables;

public class StaticVariable {
	
	static int a=10;
	
	public static void main (String [] args) {
		
		System.out.println(StaticVariable.a);//recomamded
		System.out.println(a);
		StaticVariable staticvariable =new StaticVariable();
		System.out.println(staticvariable.a);
	}

}
