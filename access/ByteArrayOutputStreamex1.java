package com.infinite.access;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamex1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream out = new FileOutputStream("D:\\Hiiiii.txt");
		FileOutputStream out1 = new FileOutputStream("D:\\Alpha.txt");
		FileOutputStream out2 = new FileOutputStream("D:\\Hello.txt");
		FileOutputStream out3 = new FileOutputStream("D:\\ABCD.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String s = "Hi";
		byte[] b = s.getBytes();
		bout.write(b);
		bout.writeTo(out);
		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.writeTo(out3);
		bout.close();


System.out.println("success");


		
	}

}
