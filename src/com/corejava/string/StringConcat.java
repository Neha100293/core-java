package com.corejava.string;

public class StringConcat {

	public static void main(String[] args) {
		
		/*
		 * For every String Constant one object will be created in SCP. Because of
		 * runtime operation if an object is required to create compulsory that object
		 * should be placed on the heap but not SCP
		 * Heap                scp
		 * s1                 Spring
		 * Springfall         fall
		 * springwinter       winter    and assign in s1
		 * Springwintersummer summer
		 */
		String s1=new String("spring");
		s1.concat("fall");
		s1=s1+"winter";
		String s2=s1.concat("summer");
		System.out.println(s1);
		System.out.println(s2);
	}

}
