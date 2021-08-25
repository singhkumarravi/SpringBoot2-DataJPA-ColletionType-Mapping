package com.olive.runner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Employee;
import com.olive.repo.EmployeeRepositiory;
@Component
public class EmployeeTest implements CommandLineRunner {
    @Autowired
	private EmployeeRepositiory repo;

	public void run(String... args) throws Exception {
		System.out.println("Application Started...................");
		List<String> proj=new ArrayList<String>();
		         proj.add("p1");
		         proj.add("p2");
		         proj.add("p3");
		         proj.add("p4");
		Set<String> mod=new HashSet<String>();
		            mod.add("M1");
		            mod.add("M2");
		            mod.add("M3");
		Map<String,String> c=new HashMap<String, String>();
		                   c.put("c1", "Oracle");
		                   c.put("c2", "Mysql");
		Employee e=new Employee();
		        e.setEmpId(10);
		        e.setEmpName("Ravi Kumar");
		        e.setEmpSal(2020.3);
		        e.setEproj(proj);
		        e.setModule(mod);
		        e.setClient(c);
		repo.save(e);
		System.out.println("Done");
		
	}
    

	

}
