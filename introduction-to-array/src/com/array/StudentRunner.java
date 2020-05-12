package com.array;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		int[] marks = {99, 98, 100};
		
		Student student = new Student("Martin", marks);
		int number = student.getNumberOfMarks();
		System.out.println("Number of marks " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks " + sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum of marks " + maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum of marks " + minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("average " + average);

	}

}
