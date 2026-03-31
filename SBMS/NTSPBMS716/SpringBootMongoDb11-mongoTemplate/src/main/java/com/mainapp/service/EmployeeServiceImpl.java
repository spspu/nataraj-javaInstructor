package com.mainapp.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.mainapp.entity.EmployeeEntity;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private MongoTemplate template;
	
	@Override
	public String registerEmployee(EmployeeEntity emp) {
//		String idVal = template.insert(emp).getId();
		String idVal = template.save(emp).getId();
		
		return idVal;
	}

	@Override
	public String registerBatchEmployees(List<EmployeeEntity> list) {
		Collection<EmployeeEntity> list1 = template.insertAll(list);
		return list1.size()+" number of employees are saved.";
	}
	
	
	
	
	
	
	
	

}
