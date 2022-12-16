package com.application.services;

import com.application.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String dn = "Admin Department";
		return dn;
	}
	public String getTodaysWork() {
		String gtw = "Complete your documents submission";
		return gtw;
	}
	public String getWorkDeadline() {
		String gwd = "Complete by EOD";
		return gwd;
	}
	  
  }
