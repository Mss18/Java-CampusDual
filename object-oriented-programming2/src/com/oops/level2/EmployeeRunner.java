package com.oops.level2;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee[] theEmployees = new Employee[4];
		
		theEmployees[0]  = new Employee("Peter", 42, 1500);
		theEmployees[1]  = new Employee("Juan", 38, 1550);
		
		//polymorphism
		theEmployees[2]  = new Boss("Julia", 42, 2550);
		
		//casting
		theEmployees[3] = new Boss("John", 18, 1480);		
		Boss boss2 = (Boss) theEmployees[3];
		
		for(Employee e:theEmployees) {
			System.out.println(e.getName());
		}
	}

}
