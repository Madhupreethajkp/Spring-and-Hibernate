package com.pack;

import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;

public class Main3 {
	static final Logger logger=Logger.getLogger(Main3.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		logger.debug("Sample debug message");
		logger.error("sample error msg");
		logger.fatal("sample fatal msg");
		logger.info("sample info msg");
		logger.warn("sample warn message");
	}

}
