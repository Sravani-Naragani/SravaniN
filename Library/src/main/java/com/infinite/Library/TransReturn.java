package com.infinite.Library;

import java.sql.Date;

public class TransReturn {
private String userName;
private int BookId;
private Date Fromdate;
private Date Todate;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getBookId() {
	return BookId;
}
public void setBookId(int bookId) {
	BookId = bookId;
}
public Date getFromdate() {
	return Fromdate;
}
public void setFromdate(Date fromdate) {
	Fromdate = fromdate;
}
public Date getTodate() {
	return Todate;
}
public void setTodate(Date todate) {
	Todate = todate;
}

}
