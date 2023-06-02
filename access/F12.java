package com.infinite.access;

import java.io.File;
import java.io.IOException;

public class F12 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Laddu.txt");
		f.createNewFile();
		System.out.println(f.exists());
		

	}

}
