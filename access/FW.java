package com.infinite.access;

import java.io.FileWriter;
import java.io.IOException;

public class FW {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\Helo.txt");
			fw.write("Hello Everyone this is File writer hello file");
			fw.close();
			System.out.println("success");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
