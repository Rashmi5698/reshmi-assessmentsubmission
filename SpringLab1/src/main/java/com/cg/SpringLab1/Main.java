package com.cg.SpringLab1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XmlBeanFactory bean=new XmlBeanFactory(new ClassPathResource("employee.xml"));
		Employee emp=(Employee)bean.getBean("employee");
		System.out.println("Employee Details");
		System.out.println("-----------------------------------");
		System.out.println("Employee ID : "+emp.getEmployeeId()+" \n  Employee Name : "
				+emp.getEmployeeName()+"\n  Employee Salary :"+emp.getSalary()+" \n Employee BU:"
				+emp.getBusinessUnit()+" \n Employee Age:"+emp.getAge());
		
		

	}

}
