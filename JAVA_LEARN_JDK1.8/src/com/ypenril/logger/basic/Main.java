package com.ypenril.logger.basic;

import java.io.IOException;
import java.util.logging.Level;

/*
*@Author: Yeat Nai Cheng
*@Created Date:30 Jan 2022
*@Description: This is the main class to run the example of the basic logger class
*	Basically there are 3 different types of logger level which are
*	- INFO
*	- WARNING
*	- SEVERE
*
*/
public class Main {
	public static void main(String[] args) {
		method1();

	}

	/**
	 * Method 1 shows the basic 
	 */
	public static void method1() {
		//By default the logger file will be in the project root folder
		String fileName = "BasicLog.txt";
		LoggerBase myLog;
		try {
			myLog = new LoggerBase(fileName);
			//Syntax method 1 of printing the log
			myLog.logger.info("This is Info Log 1");
			myLog.logger.warning("This is the Warning Log 1");
			myLog.logger.severe("This is the Severe Log 1");
			
			//Syntax method 2 of printing the log
			myLog.logger.log(Level.INFO,"This is Info Log 2");
			myLog.logger.log(Level.WARNING,"This is Warning Log 2");
			myLog.logger.log(Level.SEVERE,"This is Severe Log 2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
