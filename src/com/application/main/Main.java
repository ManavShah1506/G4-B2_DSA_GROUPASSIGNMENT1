package com.application.main;

import com.application.services.AdminDepartment;
import com.application.services.HrDepartment;
import com.application.services.TechDepartment;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment Admin = new AdminDepartment();
		System.out.println(" Welcome to "+Admin.departmentName());
		System.out.println(Admin.getTodaysWork());
		System.out.println(Admin.getWorkDeadline());
		System.out.println(Admin.isTodayAHoliday());
		System.out.println();
		
		HrDepartment HR = new HrDepartment();
		System.out.println(" Welcome to "+HR.departmentName());
		System.out.println(HR.doActivity());
		System.out.println(HR.getTodaysWork());
		System.out.println(HR.getWorkDeadline());
		System.out.println(Admin.isTodayAHoliday());
		System.out.println();
		
		TechDepartment Tech = new TechDepartment();
		System.out.println(" Welcome to "+Tech.departmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(Tech.getTechStackInformation());
		System.out.println(Tech.isTodayAHoliday());
		System.out.println();
	
	}

}
