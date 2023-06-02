package com.infinite.access;

import java.io.FileInputStream;

public class FIS {
	public static void main(String[] args) {
		try{
			FileInputStream fin = new FileInputStream("D:\\Hiiiii.txt");
			int a = 0;
			while((a=fin.read())!=-1){
				System.out.print((char)a);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
