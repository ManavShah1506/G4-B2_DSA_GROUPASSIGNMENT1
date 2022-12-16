package com.application.services;

import com.application.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		String dn = "Tech Department";
		return dn;
	}
	public String getTodaysWork() {
		String gtw = "Complete coding of module 1";
		return gtw;
	}
	public String getWorkDeadline() {
	    String gwd = "Complete by EOD";
		return gwd;
	}
	public String getTechStackInformation() {
	    String gts = " Core Java";
		return gts;
		}
}
