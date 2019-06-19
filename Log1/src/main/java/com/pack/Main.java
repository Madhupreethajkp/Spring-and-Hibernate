package com.pack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
static final Logger logger=Logger.getLogger(Main.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		logger.debug("Sample debug message");
		logger.error("sample error msg");
		logger.fatal("sample fatal msg");
		logger.info("sample info msg");
		logger.warn("sample warn message");

	}

}
