package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Animal{
	
public void getCheckedException() throws InterruptedException {
	
	Thread.sleep(2000);
	try {
		
		FileInputStream fis = new FileInputStream("path");
	} catch (Exception e) {
		// TODO Auto-generated catch block
	//	e.printStackTrace();
	}
}
	
public void getuncheckedException() throws Exception {
	
	try {
	System.out.println(1/0);
	}finally {
		System.exit(0);// not run
		//code>>> always run
		
	}
	
	throw new  Exception("User logout");
}	
}
