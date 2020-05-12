package com.introduction_POO;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(25);
		Book effectiveJava = new Book(20);
		Book cleanCode = new Book(30);

		System.out.println(artOfComputerProgramming);
		System.out.println(effectiveJava);
		System.out.println(cleanCode);

		// artOfComputerProgramming.setNoCopies(50);
		// effectiveJava.setNoCopies(25);
		// cleanCode.setNoCopies(85);

		artOfComputerProgramming.increaseCopies(10);
		// System.out.println(artOfComputerProgramming.getNoCopies());
		artOfComputerProgramming.decreaseCopies(5);
		// System.out.println(artOfComputerProgramming.getNoCopies());

		effectiveJava.increaseCopies(10);
		// System.out.println(effectiveJava.getNoCopies());
		effectiveJava.decreaseCopies(5);
		// System.out.println(effectiveJava.getNoCopies());

		cleanCode.increaseCopies(10);

		cleanCode.decreaseCopies(5);
		// System.out.println(cleanCode.getNoCopies());
	}

}
