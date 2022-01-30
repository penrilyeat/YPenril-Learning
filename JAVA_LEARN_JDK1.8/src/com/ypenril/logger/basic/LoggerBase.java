package com.ypenril.logger.basic;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
*@Author: Yeat Nai Cheng
*@Created Date:30 Jan 2022
*@Description: This is a customize class created for the Logger class configuration
*@Resource: https://www.youtube.com/watch?v=4Bpg5i4tUFg
*/
public class LoggerBase {
	//Set to public for easier access for writing Log
	public Logger logger;
	FileHandler fh;
	public LoggerBase(String file_name) throws IOException {
		File f=new File(file_name);
		//If the file path is not existed, it will create the file
//		if(!f.exists())
//		{
//			f.createNewFile();
//		}
		fh = new FileHandler(file_name,true);
		logger=Logger.getLogger("test");
		logger.addHandler(fh);
		//Create format and set the format (Default format will be in xml)
		SimpleFormatter formatter=new SimpleFormatter();
		fh.setFormatter(formatter);		
	}
}

