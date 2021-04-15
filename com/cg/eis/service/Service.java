package com.cg.eis.service;

import com.cg.eis.bean.*;
import com.cg.eis.pl.*;

public class Service implements EmployeeService{
	EmployeeApp employee=new EmployeeApp();
	Employee e = new Employee();
	@Override
	public void getEmployeeDetails() {
		
		employee.getUserDetails();
	}

	@Override
	public void doInsuranceScheme() {
		employee.doInsurance();
	}

	@Override
	public void doPrintDetailsOfEmployee() {
		employee.print();
	}

	

}
