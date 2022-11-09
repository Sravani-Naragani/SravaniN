package com.infinite.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FeedBack")
public class FeedBack {
	
	@Id
	@Column(name="fid")
private String fid;
	
	
	@Column(name="studentname")
private String studentname;
	
	@Column(name="instructor")
private String instructor;
	
	@Column(name="subject")
private String subject;
	
	
	@Column(name="fbvalue")
private String fbvalue;
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getInstructor() {
	return instructor;
}
public void setInstructor(String instructor) {
	this.instructor = instructor;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getFbvalue() {
	return fbvalue;
}
public void setFbvalue(String fbvalue) {
	this.fbvalue = fbvalue;
}

}


