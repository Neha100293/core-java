package com.corejava.object;

public class HashCodeAndEqualsMethod1 {
	int i;

	HashCodeAndEqualsMethod1(int i) {
		this.i = i;
	}

	public String toString() {
		return i+"";
	}
	public int hashCode() {
		return i;
		
	}
	public static void main(String[] args) {
HashCodeAndEqualsMethod1 hcem =new HashCodeAndEqualsMethod1(100);
		System.out.println(hcem);
		/*
		 * if we are giving optrurniuty to Object class toString() method it internally
		 * calls hashCode() method. But if we are overriding toString() method it may
		 * not call hashCode() method. output->100
		 */
	}

}
