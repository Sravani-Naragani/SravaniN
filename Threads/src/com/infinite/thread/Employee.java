package com.infinite.thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Employ implements Serializable{
	String name;
	int id;
	public Employ(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}}
	public class Employee {
	public static void main(String[] args) throws IOException {
		Employ f = new Employ("sravani",426);
		try{
			FileOutputStream fout = new FileOutputStream("D://sravani.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(f);
			out.close();
			fout.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("hi");
		
		// Deserialization 
		
		try{
	FileInputStream fin = new FileInputStream("D://sravani.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Employ e2 = (Employ)oin.readObject();
		oin.close();
		fin.close();
		System.out.println(e2.name+" "+e2.id);

		}catch(Exception e){
			
		}
		
	}
	}


