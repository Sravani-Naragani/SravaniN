package com.infinite.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CheckedExc {
	public static void main(String[] args) {
		
	//File Not found exception.
		
		    try {
		      File file = new File("file.txt");
		      Scanner scanner = new Scanner(file);
		    } catch (FileNotFoundException e) {
		      System.out.println("File not found");
		    }
		  

		System.out.println("want to sleep");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// Interrupted Exception
		}
}
		