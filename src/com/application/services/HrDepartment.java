package com.application.services;

import com.application.model.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String dn = "HR Department";
		return dn;
	}
	public String getTodaysWork() {
		String gtw = "Fill today's timesheet and mark your attendance";
		return gtw;
	}
	public String getWorkDeadline() {
		String gwd = "Complete by EOD";
		return gwd;
	}
	public String doActivity() {
		String da = "team Lunch";
		return da;
	}
	  
}
