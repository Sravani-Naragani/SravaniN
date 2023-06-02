package com.infinite.access;

import java.io.FileOutputStream;

public class FOS {
	public static void main(String[] args) {
		try{
		FileOutputStream fout = new FileOutputStream("D:\\Hiiiii.txt");
		String s ="Writing this text to this file";
		byte[] b = s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("created");

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
