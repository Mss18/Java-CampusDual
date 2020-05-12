package com.introduction_POO;

public class Book {
	// create instance
	private int noCopies;

	// constructor
	Book(int noCopies) {
		this.noCopies = noCopies;
	}

	public void setNoCopies(int noCopies) {
		if (noCopies > 0) {
			this.noCopies = noCopies;
		}
	}

	// increase noCopies
	public void increaseCopies(int howMuch) {
		setNoCopies(this.noCopies + howMuch);
	}

	// decrease noCopies
	public void decreaseCopies(int howMuch) {
		setNoCopies(this.noCopies - howMuch);
	}
}
