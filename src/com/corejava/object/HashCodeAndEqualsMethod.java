package com.corejava.object;

public class HashCodeAndEqualsMethod {
int i;
	
public HashCodeAndEqualsMethod(int i) {
	this.i=i;
}
	public int hashCode() {
		return i;
		
	}
	public static void main(String[] args) {
		/*
		 * In this case Object class toString() method got executed which is internally
		 * calls Test class hashCode() method.
		 */
		HashCodeAndEqualsMethod hc =new HashCodeAndEqualsMethod(100);
System.out.println(hc);
	}

}
