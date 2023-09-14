package com.san.app.java;


import com.san.app.java.spring.LGTV;
import com.san.app.java.spring.SamsungTV;
import com.san.app.java.spring.TV;

public class MainExample {

	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.on();
		tv.off();
		
		TV tv2 = new LGTV();
		tv2.on();
		tv2.off();

	}

}
