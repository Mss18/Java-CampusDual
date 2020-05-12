package com.introduction_POO;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);

		MotorBike somethingElse = new MotorBike();

		System.out.println(ducati);
		System.out.println(honda);

		System.out.println(somethingElse);

		ducati.start();
		honda.start();

		ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.decreaseSpeed(100);
		honda.decreaseSpeed(100);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		// int ducatiSpeed = ducati.getSpeed();// get ducati speed
		// ducatiSpeed += 100;// increase it by 100
		// ducati.setSpeed(ducatiSpeed);// set it to ducati

		// int hondaSpeed = honda.getSpeed();// get honda speed
		// hondaSpeed += 100;// increase it by 100
		// honda.setSpeed(hondaSpeed);// set it to honda

	}

}
