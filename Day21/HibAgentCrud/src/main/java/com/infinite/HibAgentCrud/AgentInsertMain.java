package com.infinite.HibAgentCrud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class AgentInsertMain {
	public static void main(String[] args) {
		Agent agent = new Agent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter agent Name");
		agent.setName(sc.next());
		System.out.println("Enter city");
		agent.setCity(sc.next());  
		System.out.println("Enter gender");
		agent.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter MaritalStatus ");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("Enter premium ");
		agent.setPremium(sc.nextDouble());
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(agent);
		trans.commit();
		System.out.println("***Record inserted***");


	}

}
