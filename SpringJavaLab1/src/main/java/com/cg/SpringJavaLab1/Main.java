package com.cg.SpringJavaLab1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.cg.SpringJavaLab1.EmployeeConfig;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AnnotationConfigApplicationContext ctx= 
					new AnnotationConfigApplicationContext(EmployeeConfig.class);
			
			Employee emp=(Employee)ctx.getBean("employee");
			System.out.println("Employee Details");
			System.out.println("-----------------------------------");
			System.out.println("Employee ID : "+emp.getEmployeeId()+" \n  Employee Name : "
					+emp.getEmployeeName()+"\n  Employee Salary :"+emp.getSalary()+" \n Employee BU:"
					+emp.getBusinessUnit()+" \n Employee Age:"+emp.getAge());
			
			

		}

}
