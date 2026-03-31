package com.mainapp.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mainapp.entity.EmployeeEntity;
import com.mainapp.service.EmployeeService;

@Component
public class MongoTemplateTestRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeService empService;

	@Override
	public void run(String... args) throws Exception {
//		EmployeeEntity emp = new EmployeeEntity(1001,"raja","hyd",90000.0,true);
//		String idVal = empService.registerEmployee(emp);
//		System.out.println("id value: "+idVal);
		
		
		EmployeeEntity emp1 = new EmployeeEntity(1002,"maju","hyd",50000.0,true);
		EmployeeEntity emp2 = new EmployeeEntity(1003,"kaju","hyd",20000.0,false);
		String msg = empService.registerBatchEmployees(List.of(emp1,emp2));
		System.out.println(msg);
		
	}

}
