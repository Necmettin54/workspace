package com.eclipsespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Nrecmettin");
		@SuppressWarnings("resource")
		ApplicationContext context=new  ClassPathXmlApplicationContext("Beans.xml");
		AnaKart anakart=(AnaKart) context.getBean("AnaKartbean");
		anakart.Yaz();
		System.exit(0);

	}

}
