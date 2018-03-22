package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.PeopleService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		PeopleService ps=(PeopleService) act.getBean("peopleService");
		System.out.println(ps.getPeople());
	}
}
