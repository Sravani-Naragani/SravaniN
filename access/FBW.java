package com.infinite.access;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FBW {
	public static void main(String[] args) throws IOException {
		try{
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Hiiiii.txt"));
		bw.write("this is example for BufferedWriter");
		bw.close();
		System.out.println("Hiufuy");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
