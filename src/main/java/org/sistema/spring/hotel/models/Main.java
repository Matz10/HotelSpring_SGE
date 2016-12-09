package org.sistema.spring.hotel.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		Hotel hotel = (Hotel) context.getBean("hotel1");
		System.out.println(hotel.toString());
	}

}
