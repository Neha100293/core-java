package com.corejava.object;

public class ToStringDemo {

	private int id;
	private String name;

	ToStringDemo() {

	}

	ToStringDemo(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) {

		ToStringDemo student1 = new ToStringDemo(101, "Neha");
		ToStringDemo student2 = new ToStringDemo(102, "Dev");

		System.out.println(student1);
		System.out.println(student2.toString());

	}

//override tostring method
	public String toString() {
		return id + "........" + name;
	}
}
