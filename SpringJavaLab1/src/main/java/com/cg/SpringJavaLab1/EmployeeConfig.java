package com.cg.SpringJavaLab1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class EmployeeConfig {
	@Bean
	public Employee employee() {
		return new Employee(11, "Ramya",1233.9,"Analyst", 23);
	}
	/*@Bean
	public Employee employee() {
		Employee emp=new Employee();
		emp.setAge(23);
		
	}*/

}
