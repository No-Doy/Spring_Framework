package com.Alfano.Brian.Quiz4;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Alfano_spring.xml");
		
		Book bookObj = (Book) context.getBean("bookBean");
		
		String output = bookObj.toString();
		
		System.out.println(output);
		
		
	}
}
