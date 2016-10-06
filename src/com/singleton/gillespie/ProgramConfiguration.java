package com.singleton.gillespie;

public class ProgramConfiguration {
	private static ProgramConfiguration instance;
	private int connectionLimit;
	private int portNumber;
	private String url;
	private int timeout;

	private ProgramConfiguration() {
		connectionLimit = 5;
		portNumber = 8080;
		url = "http://www.grandcircus.co";
		timeout = 10000;
	}
	
	public static ProgramConfiguration getInstance() {
		if (instance == null)
			instance = new ProgramConfiguration();
		return instance;
	}
	
	public int getConnectionLimit() {
		return connectionLimit;
	}

	public int getPortNumber() {
		return portNumber;
	}

	public String getUrl() {
		return url;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setConnectionLimit(int connectionLimit) {
		this.connectionLimit = connectionLimit;
	}

	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
}
