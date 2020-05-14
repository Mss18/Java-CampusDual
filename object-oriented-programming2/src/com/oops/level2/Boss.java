package com.oops.level2;

public class Boss extends Employee{
	
	private int plus;

	public Boss(String name, int age, int salary) {
		super(name, salary, salary);
	}
	
	public void setPlus(int plus) {
		plus += 5;
	}
	
	//Override
	public int getSalary() {
		int bossSalary = super.getSalary();
		return bossSalary + plus;
	}
	
}
