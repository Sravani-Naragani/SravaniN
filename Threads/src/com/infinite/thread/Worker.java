package com.infinite.thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class workers implements Serializable{
	String name;
	int wid;
	public workers(String name, int wid) {
		this.name = name;
		this.wid = wid;
	}
	
}

public class Worker {
	public static void main(String[] args) {
		workers w = new workers("sravani",426);
//		try{
//			FileOutputStream fout = new FileOutputStream("sravani.txt");
//			ObjectOutputStream out = new ObjectOutputStream(fout);
//			out.writeObject(w);
//			out.close();
//			fout.close();
//		}catch(Exception e){
//		
//	System.out.println("File Not found");
//}
//System.out.println("success");


	try{
		FileInputStream fin = new FileInputStream("sravani.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		workers s = (workers)oin.readObject();
		oin.close();
		fin.close();
		System.out.println(s.name + " " +s.wid);

	}catch(Exception e){
		System.out.println("hi");
	}
}
}