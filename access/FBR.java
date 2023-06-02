package com.infinite.access;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FBR {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		try{
			
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			System.out.println(s);
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
