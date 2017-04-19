package com.niit.collabrationbackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collabration.DAO.EventDAO;
import com.niit.collabration.Model.Event;


public class EventTestCase {

@Autowired  static AnnotationConfigApplicationContext context;
	
	@Autowired  static Event event;
	
	@Autowired  static EventDAO  eventDAO;
	
	@BeforeClass
	public static  void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		event = (Event) context.getBean("event");
		
		eventDAO = (EventDAO) context.getBean("eventDAO");
	}
	
}
