package com.pack;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main2 {
	static final Logger logger=Logger.getLogger(Main2.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j1.properties");
		logger.debug("Sample debug message");
		logger.error("sample error msg");
		logger.fatal("sample fatal msg");
		logger.info("sample info msg");
		logger.warn("sample warn message");
	}

}
