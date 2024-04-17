package com.corejava.object;

public class CloneDemo implements Cloneable {

	int i = 10;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneDemo cd = new CloneDemo();
		CloneDemo cd1 = (CloneDemo) cd.clone();
		cd1.i = 100;
		cd1.j = 200;
		System.out.println(cd.i + "+++++" + cd.j);
		System.out.println(cd1.i + "++++++++" + cd1.j);
		System.out.println(cd1.hashCode());
		System.out.println(cd.hashCode());
		System.out.println( cd==cd1);
	}

}
