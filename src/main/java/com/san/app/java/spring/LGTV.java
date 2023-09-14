package com.san.app.java.spring;

public class LGTV implements TV {

	@Override
	public void on() {
		System.out.println("LG TV On");
	}

	@Override
	public void off() {
		System.out.println("LG TV Off");
	}

}
