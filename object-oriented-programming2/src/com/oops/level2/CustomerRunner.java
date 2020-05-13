package com.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line2", "city2", "151515");
		Customer customer = new Customer("Martin", homeAddress);
		System.out.println(customer);
		
		Address workAddress = new Address("line3", "city3", "161616");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);

	}

}
