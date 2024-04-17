package com.corejava.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	TreeSet t=new TreeSet(new MyComparator());
	t.add("Neha");
	t.add("Dev");
	t.add("kratika");
	System.out.println(t);
	

	}

}
