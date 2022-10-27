package com.infinite.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class QuestionDAO {

	
	SessionFactory sessionFactory;
	
	public String addQuestion(Question question) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(question);
		transaction.commit();
		return "Question Added Successsfully...";
	}
	
	
	public List<Question> showQuestion() {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Question");
		List<Question> questionsList = query.list();
		return questionsList;



		}

			
		

	
}