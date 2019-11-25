package com.adtran.servicehub.dao.util;

import javax.servlet.http.HttpServletRequest;

import com.adtran.servicehub.modal.Employee;

public class EmployeeParser {

	public Employee getEmployeeFromRequestForRegistration(HttpServletRequest request) {
		Employee employee = new Employee();
		employee.setId(String.valueOf(request.getParameter("id")));
		employee.setCorpId(String.valueOf(request.getParameter("corpId")));
		return employee;
	}
	public Employee getEmployeeFromRequestForLogin(HttpServletRequest request) {
		Employee employee = new Employee();
		
		return employee;
	}
}
