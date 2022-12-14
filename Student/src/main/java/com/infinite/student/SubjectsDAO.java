package com.infinite.student;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class SubjectsDAO {
    public List<String> getSubjects(String instructor) {
        SessionFactory sf = SessionHelper.getConnection();
        Session s = sf.openSession();
        Query q = s.createQuery("from Subjects where instructor='" +instructor+"'");
        List<Subjects> clist = q.list();
        List<String> subjects=new ArrayList<String>();
        for (Subjects c : clist) {
            subjects.add(c.getSubject());
        }
        return subjects;
    }
    public Set<String> getInstructors() {
        SessionFactory sf = SessionHelper.getConnection();
        Session s = sf.openSession();
        Query q = s.createQuery("from Subjects");
        List<Subjects> clist = q.list();
        System.out.println("Count  " +clist.size());
        List<String> instructors=new ArrayList<String>();
        for (Subjects c : clist) {
            instructors.add(c.getInstructor());
        }
        Set<String> hSet = new HashSet<String>();
        for (String x : instructors)
            hSet.add(x);
        return hSet;
    }


    public String recordFeedback(FeedBack feedBack) {
        SessionFactory sf = SessionHelper.getConnection();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.save(feedBack);
        t.commit();
        return "Feedback Stored in Database...";
}
   
    public String generateFeedbackId() {
        SessionFactory sf = SessionHelper.getConnection();
        Session s = sf.openSession();
        Query q = s.createQuery("from FeedBack");
        List<FeedBack> clist = q.list();
        if (clist.size()==0) {
                        return "F001";
        } else {
                        FeedBack obj = clist.get(clist.size()-1);
                        String cid=obj.getFid();
                        String result="";
                        int id = Integer.parseInt(cid.substring(1));
                        id++;
                        if (id >=1 && id <=9) {
                                        result="F00"+id;
                        }
                        if (id >=10 && id <=99) {
                                        result="F0"+id;
                        }
                        if (id >=100 && id <= 999) {
                                        result="F"+id;
                        }
                        return result;
        }
}

   public String addSubject(Subjects subject) {
        SessionFactory sf = SessionHelper.getConnection();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.save(subject);
        t.commit();
        return "Subjects Stored in Database...";
    }
    public String addCourse(CourseList courseList) {
        String cid = generateCourseId();
        courseList.setCourseno(cid);
        SessionFactory sf = SessionHelper.getConnection();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.save(courseList);
        t.commit();
        return "Course Added Successfully...";
    }
    /*public String showSubjects(CourseList courseList) {
        String cid = generateCourseId();
        courseList.setCourseno(cid);
        SessionFactory sf = SessionHelper.getConnection();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.save(courseList);
        t.commit();
        return "Course Added Successfully...";}*/
    
    public String generateCourseId() {
        SessionFactory sf = SessionHelper.getConnection();
        Session s = sf.openSession();
        Query q = s.createQuery("from CourseList");
        List<CourseList> clist = q.list();
        if (clist.size()==0) {
            return "C001";
        } else {
            CourseList obj = clist.get(clist.size()-1);
            String cid=obj.getCourseno();
            String result="";
            int id = Integer.parseInt(cid.substring(1));
            id++;
            if (id >=1 && id <=9) {
                result="C00"+id;
            }
            if (id >=10 && id <=99) {
                result="C0"+id;
            }
            if (id >=100 && id <= 999) {
                result="C"+id;
            }
            return result;
        }
          }

    public List FbCount(String instructor ,String subject){
        SessionFactory sf = SessionHelper.getConnection();
        Session s = sf.openSession();
        Query query= s.createQuery("Select fbValue,count(*) "
                + "from FeedBack where instructor=:instructor AND subject=:subject"
                + " group by FbValue").setParameter("instructor",instructor).setParameter("subject", subject);
        List<Object> count=query.list();
        return count;

}
}