package com.infinite.access;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class SequenceInputStrea45m {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Alpha.txt");
		FileInputStream fis1 = new FileInputStream("D:\\Hi.txt");
		FileInputStream fis2 = new FileInputStream("D:\\Srav.txt");

		FileOutputStream fout = new FileOutputStream("D:\\Bottel.txt");
		Vector v = new Vector();
		v.add(fis);
		v.add(fis1);
		v.add(fis2);
		Enumeration e = v.elements();
SequenceInputStream sis = new SequenceInputStream(e);

		//SequenceInputStream sis = new SequenceInputStream(fis, fis1);
		
		int i =0;
		while((i=sis.read())!=-1){
			fout.write(i);
			System.out.print((char)i);
		}
//		Scanner sc = new Scanner(sis);
//		while(sc.hasNextLine()){
//			System.out.println(sc.nextLine());
//		}

		

	}

}
