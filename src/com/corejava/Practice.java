package com.corejava;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Practice(int id,String name, int age,double salary){

	this.id=id;
	this.name=name;
	this.age=age;
	this.salary=salary;}

	public static void main(String[] args) {
		
	

		
		List<Practice> employee=new ArrayList<>();
		Practice empployee1=new Practice(1,"Neha",28,30000);
		Practice empployee2=new Practice(2,"kratika",24,55000);
		Practice empployee3=new Practice(3,"preety",20,30038);
		Practice empployee4=new Practice(4,"spana",25,45000);
		Practice empployee5=new Practice(5,"Neelima",28,56000);
		employee.add(empployee1);
		employee.add(empployee2);
		employee.add(empployee3);
		employee.add(empployee4);
		employee.add(empployee5);

		
		System.out.println("no of Employee"+ employee.toString());
		for(Practice emp:employee){
		System.out.println(emp);}

		}
}
