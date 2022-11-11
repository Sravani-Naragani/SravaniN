package com.infinite.lmshib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployDAO {

           SessionFactory sessionFactory;

           public Employ searchEmploy(int empId){
        	   sessionFactory = SessionHelper.getSession();
        	   Session session=sessionFactory.openSession(); 
        	   Query query = session.getNamedQuery("searchEmploy");
        	   query.setParameter("empId", empId);
        	   List<Employ> employList = query.list();
        	   if(employList.size()==0){
        		   return null;
               }
               return employList.get(0);
           }
           public List<Employ> showEmploy() {
                      sessionFactory = SessionHelper.getSession();
               Session session=sessionFactory.openSession(); 
               Query query = session.getNamedQuery("showEmploy");
               List<Employ> employList = query.list();
               return employList;

           }
           public List<LeaveHistory> pendingLeaves(int mgrId) {
       		List<Integer> subOrds = showSubordinates(mgrId);
       		sessionFactory = SessionHelper.getSession();
         	    Session session=sessionFactory.openSession();
         	    Query query2 = session.createQuery("from LeaveHistory where leaveStatus='PENDING' AND empId in (:ids)").setParameterList("ids", subOrds);
         	    List<LeaveHistory> pendingLeaves = query2.list();
         	    return pendingLeaves;
       	}
       	
           public List<Integer> showSubordinates(int mgrId) {
       		sessionFactory = SessionHelper.getSession();
         	    Session session=sessionFactory.openSession();
         	    Criteria cr = session.createCriteria(Employ.class);
         	    cr.add(Restrictions.eq("empMgrId", mgrId));
         	    cr.setProjection(Projections.property("empId"));
         	    List<Integer> subList = cr.list();
         	    return subList;
       	}
}