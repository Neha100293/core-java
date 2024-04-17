package com.corejava.object;

public class HashCodeDemo {

	private int id;
	private String name;
	private String address;

	
	HashCodeDemo(){}
	HashCodeDemo(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	public static void main(String[] args) {

		HashCodeDemo hashcodedemo = new HashCodeDemo(101, "Neha", "delhi");
		HashCodeDemo hashcodedemo2 = new HashCodeDemo(102, "Dev", "delhi");
		System.out.println(hashcodedemo.hashCode());
		System.out.println(hashcodedemo2);
		System.out.println(hashcodedemo2.hashCode()+"-------"+hashcodedemo.hashCode());
		
		
	}
	

	public String toString() {
		return id + "........." + name + "....." + address;

	}
	/*
	 * //overrride hashCode() public int hashCode() { return id; }
	 */
}
