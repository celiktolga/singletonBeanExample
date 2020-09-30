package com.tutorials.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee employee =  (Employee) context.getBean("employee");
		employee.setId(1);
		employee.setName("Tolga");
		
		System.out.println(employee.getId()+" "+employee.getName());
		
		Employee employee2 =  (Employee) context.getBean("employee");		
		System.out.println(employee2.getId()+" "+employee2.getName());
		
		employee.setId(2);
		employee.setName("Tayfun");
		System.out.println(employee2.getId()+" "+employee2.getName());
		((AbstractApplicationContext) context).close();
	}

}
