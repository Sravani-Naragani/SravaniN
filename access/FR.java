package com.infinite.access;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FR {
	public static void main(String[] args) {
		
		try {
			FileReader	fr = new FileReader("D:\\Helo.txt");
			Scanner sc = new Scanner(fr);
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
