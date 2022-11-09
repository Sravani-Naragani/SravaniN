package com.infinite.Payroll;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
     import org.hibernate.SessionFactory;
     import org.hibernate.Transaction;




     public class EmployDAO {
         
         SessionFactory sFactory;
         
         
         
         public String addEmploy(Employ employ) {
             sFactory = SessionHelper.getSession();
             Session session = sFactory.openSession();
             Criteria cr = session.createCriteria(Employ.class);
          
             double  sal = employ.getSalary() ;
             double hra = (0.02*sal);
             employ.setHra(hra);
             double da= (0.0125*sal);
             employ.setDa(da);
             double ta = (0.0095*sal);
             employ.setTa(ta);
             double tax = (0.0023*sal);
             employ.setTax(tax);
             double pf = (0.03*sal);
             employ.setPf(pf);
             double gross = sal + hra + da + ta;
             employ.setGross(gross);
             double netpay = gross - tax - pf;
             employ.setNetpay(netpay);
             employ.setLeaveavailable(16);
             Transaction transaction = session.beginTransaction();
             session.save(employ);
             transaction.commit();
             session.close();
             return "Employ Added...";
         }
         
         
       //date
         public Date convertDate(java.util.Date dt) {
                         java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
                         return sqlDate;
         }

        

         
         
         
       //Apply Leave
         
         
         public String applyLeave(LeaveTable leaveTable) {
             sFactory = SessionHelper.getSession();
             Session session = sFactory.openSession();
             Criteria cr = session.createCriteria(LeaveTable.class);
             
             long sdate = leaveTable.getLeaveStartDate().getTime();
             long edate = leaveTable.getLeaveEndDate().getTime();
             
             long diff =  edate - sdate;
             long m = diff/(1000*24*60*60);
             int days=(int)m;
             days=days+1;
             
             leaveTable.setNoOfDays(days);

             int no = leaveTable.getNoOfDays();
             if(no > 3) {
                 leaveTable.setLossOfPay((double) (no-3));
                  }else {
                      leaveTable.setLossOfPay((double) 0);
                    }
             
             Transaction transaction = session.beginTransaction();
             session.save(leaveTable);
             transaction.commit();
             session.close();
             return "Leave Applied successfully";
             
}
     
         
     public List<Employ> searchemploy(int empno) {
         sFactory = SessionHelper.getSession();
         Session session = sFactory.openSession();
         
         Criteria cr = session.createCriteria(Employ.class);
         cr.add(Restrictions.eq("empno", empno));
         List<Employ> employList = cr.list();
         
         return employList;
     }
     
     public List<LeaveTable> searchleave(int empno) {
         sFactory = SessionHelper.getSession();
         Session session = sFactory.openSession();
         
         Criteria cr = session.createCriteria(LeaveTable.class);
         cr.add(Restrictions.eq("empno", empno));
         List<LeaveTable> leaveList = cr.list();
         
         return leaveList;
     }
     
     //Payslip
     
    
  
  public Object payslip(int empno,int month) {
         Employ employ = new Employ();
         LeaveTable leaveTable = new LeaveTable();
         sFactory = SessionHelper.getSession();
         Session session = sFactory.openSession();
         Query query=session.createQuery("select sum(noOfDays) from LeaveTable where empno=:empno AND (MONTH(leaveStartDate)=:month AND MONTH(leaveEndDate)=:month)").setParameter("empno", empno)
                      .setParameter("month", month);
         List<Long> count = query.list();    
         

         return count.get(0);
  }
  //TakeHome
  
  public double takeHome(double salary) {
      
	  sFactory = SessionHelper.getSession();
      Session session = sFactory.openSession();
      LeaveTable leaveTable = new LeaveTable();
      Employ employ = new Employ();
      int month=11;
      int empno=2;
      Object ob = payslip(1, 11);
      long lop = (Long)ob;
      lop = lop - 3;
      double lossofpay = (salary/30.43) * lop;
                                                      
      Query query =session.createQuery("from LeaveTable where empno=:empno"
                                      + " AND (MONTH(leaveStartDate)=:month AND MONTH(leaveEndDate)=:month)").setParameter("empno", empno)
                                      .setParameter("month", month);
      
      List<LeaveTable> leavelist = query.list();
      
      LeaveTable lastRecord = leavelist.get(leavelist.size()-1);
      lastRecord.setLossOfPay(lossofpay);

      Transaction transaction = session.beginTransaction();
      session.update(lastRecord);
      transaction.commit();

      
      List<Employ> emplist = searchemploy(1);
      
      double ntp = emplist.get(0).getNetpay();
      
      double take = ntp - lossofpay;
      
      return  take;
}

  
  
}

     

