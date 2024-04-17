package com.corejava.object;

public class StringDemo {

	public static void main(String[] args) {
		 String s1=new String ("Neha");
		 String s2=new String ("Neha");
		 String s3="Neha";
		 String s4 =s3;
		 StringBuffer sb1=new StringBuffer("Neha");
		 StringBuffer sb2 =new StringBuffer("Neha");
		// TODO Auto-generated method stub
		 System.out.println(s1.concat(s2));
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(sb1==sb2);
System.out.println(sb1.equals(sb2));
System.out.println(Object.class.getName());
System.out.println(s4==s3);
	}

}
