package com.test.file;

import org.apache.camel.CamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelSpringApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		CamelContext camelContext = (CamelContext) applicationContext.getBean("myCamelContext");
		try {
			camelContext.start();
			Thread.sleep(5000);
			camelContext.stop();
		} catch (Exception e) {
			System.out.println("Exception is: " + e);
			e.printStackTrace();
		}

	}

}
