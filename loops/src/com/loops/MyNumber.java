package com.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}
	
	//2 to number -1
	//How can check if a number is divisible by 2?
	public boolean isPrime() {
		
		if(number < 2) {
			return false;
		}
		
		for(int i = 2; i <= number; i++) {
		if(number % 2 == 0) {
			return false;
		}
			}
		return true;
	}

	public int sumUptoN() {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	//except 1 and 6 => 2, 3
	//2 + 3 + 4 + 5
	public int sumOfDivisors() {
		int sum = 0;
		for(int i = 2; i <= number; i++) {
			if(number % i == 0) {
			sum += i;
		}
		}
		return sum;
}
	//1
	//1 2
	//1 2 3
	public void printNumerTriangle() {
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}		
	}
}
