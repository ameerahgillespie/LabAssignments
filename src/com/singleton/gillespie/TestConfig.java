package com.singleton.gillespie;


public class TestConfig {

	public static void main(String[] args) {
		ProgramConfiguration pc = ProgramConfiguration.getInstance();
		pc.setTimeout(20000);
		pc.setUrl("http://www.grandcircus.co/java-development-bootcamp");

		System.out.println("Timeout:\t\t\t" + pc.getTimeout());
		System.out.println("URL:\t\t\t" + pc.getUrl());
		System.out.println("Port:\t\t\t" + pc.getPortNumber());
		System.out.println("Connection Limit:\t" + pc.getConnectionLimit());
	}

}
