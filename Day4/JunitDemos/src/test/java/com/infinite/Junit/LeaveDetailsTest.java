package com.infinite.Junit;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static org.junit.Assert.*;

import org.junit.Test;

public class LeaveDetailsTest {
	
	@Test
	public void testGettersAndSetters() throws ParseException{
		LeaveDetails leave = new LeaveDetails();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		leave.setLeave_No_Of_Days(20);
		leave.setLeave_Mngr_Comments("null");
		leave.setEmp_Id(10);
		leave.setLeave_Start_Date(Date.valueOf("2022-10-10"));
		leave.setLeave_End_Date(Date.valueOf("2022-10-15"));
		leave.setLeave_Type(LeaveType.EL);
		leave.setLeave_Status(LeaveStatus.PENDING);
		leave.setLeave_Reason("fever");
	

		assertEquals(20, leave.getLeave_No_Of_Days());
		assertEquals("null", leave.getLeave_Mngr_Comments());
		assertEquals(10, leave.getEmp_Id());
		assertEquals(Date.valueOf("2022-10-10"), leave.getLeave_Start_Date());
		assertEquals(Date.valueOf("2022-10-15"), leave.getLeave_End_Date());
		assertEquals(LeaveType.EL, leave.getLeave_Type());
		assertEquals(LeaveStatus.PENDING, leave.getLeave_Status());
		assertEquals("fever", leave.getLeave_Reason());
		
	}
	
	@Test
	public void testConstructor(){
		LeaveDetails leave = new LeaveDetails();
		assertNotNull(leave);
		LeaveDetails leave2 = new LeaveDetails(20, "null", 10, Date.valueOf("2022-10-10"), Date.valueOf("2022-10-15"), LeaveType.EL, LeaveStatus.PENDING, "fever");
		
		assertEquals(20, leave2.getLeave_No_Of_Days());
		assertEquals("null", leave2.getLeave_Mngr_Comments());
		assertEquals(10, leave2.getEmp_Id());
		assertEquals(Date.valueOf("2022-10-10"), leave2.getLeave_Start_Date());
		assertEquals(Date.valueOf("2022-10-15"), leave2.getLeave_End_Date());
		assertEquals(LeaveType.EL, leave2.getLeave_Type());
		assertEquals(LeaveStatus.PENDING, leave2.getLeave_Status());
		assertEquals("fever", leave2.getLeave_Reason());
	}

	
	@Test
	public void testtoString(){
		LeaveDetails leave3 = new LeaveDetails(20, "null", 10, Date.valueOf("2022-10-10"), Date.valueOf("2022-10-15"), LeaveType.EL, LeaveStatus.PENDING, "fever");
		String result = "Leave [leave_No_Of_Days=" + 20 + ", leave_Mngr_Comments=" + "null"
				+ ", emp_Id=" + 10 + ", leave_Start_Date=" + Date.valueOf("2022-10-10") + ", leave_End_Date=" + Date.valueOf("2022-10-15")
				+ ", leave_Type=" + LeaveType.EL + ", leave_Status=" + LeaveStatus.PENDING + ", leave_Reason=" + "fever"
				+ "]";
		
		assertEquals(result, leave3.toString());
		
	}
}







