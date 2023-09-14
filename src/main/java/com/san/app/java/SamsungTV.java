package com.san.app.java;

public class SamsungTV implements TV {

	@Override
	public void on() {
		System.out.println("삼성 TV On.");
	}

	@Override
	public void off() {
		System.out.println("삼성 TV Off.");
	}

}
