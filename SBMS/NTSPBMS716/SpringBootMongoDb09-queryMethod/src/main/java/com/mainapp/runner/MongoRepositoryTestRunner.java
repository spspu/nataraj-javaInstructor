package com.mainapp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mainapp.repository.EmployeeRepository;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public void run(String... args) throws Exception {
		
		//read data
//		List<Object[]> list = empRepo.getEmpsDataByAddrs("hyd");
//		list.forEach(row->System.out.println(Arrays.toString(row)));
		
//		List<EmployeeEntity> list = empRepo.getEmpsFullDataByAddrs("hyd");
//		list.forEach(System.out::println);
		
//		empRepo.getEmpsFullDataByNameAndAddrs("raja", "hyd").forEach(System.out::println);
		
//		empRepo.getEmpsFullDataByNameOrAddrs("raja", "vizag").forEach(System.out::println);
		
//		empRepo.getEmpsFullDataBySalary(10000.0, 200000.0).forEach(row->System.out.println(Arrays.toString(row)));
		
//		empRepo.getEmpsFullDataByEnameChars("r").forEach(System.out::println);
		
		empRepo.getEmpsFullDataByAddrs("hyd","vizag","delhi").forEach(System.out::println);
		
		
	}

}
