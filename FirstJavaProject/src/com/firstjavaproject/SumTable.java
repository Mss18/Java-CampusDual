package com.firstjavaproject;

public class SumTable {

	void paint(int numOne, int numTwo, int numThree) {
		for (int i = numTwo; i <= numThree; i++) {
			System.out.printf("%d + %d = %d", numOne, i, numOne + i).println();
		}
	}

	void paint() {
		paint(7, 1, 10);
	}

	void paint(int numOne) {
		paint(numOne, 1, 10);
	}
}
