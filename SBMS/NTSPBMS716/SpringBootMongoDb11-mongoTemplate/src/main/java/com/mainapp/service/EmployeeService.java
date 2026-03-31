package com.mainapp.service;

import java.util.List;

import com.mainapp.entity.EmployeeEntity;

public interface EmployeeService {
	
	public String registerEmployee(EmployeeEntity emp);
	public String registerBatchEmployees(List<EmployeeEntity> list);
	
	
}
