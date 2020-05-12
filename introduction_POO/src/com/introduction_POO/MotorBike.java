package com.introduction_POO;

public class MotorBike {

	// state
	private int speed; // member variable

	MotorBike() {
		this(5);
	}

	// constructor
	MotorBike(int speed) {
		this.speed = speed;
	}

	// getter
	public int getSpeed() {
		return speed;
	}

	// setter
	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
		// System.out.println(speed);
		// System.out.println(this.speed);
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike started");
	}
}
