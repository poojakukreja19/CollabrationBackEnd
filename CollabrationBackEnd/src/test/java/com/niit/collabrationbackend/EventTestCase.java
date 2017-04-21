package com.niit.collabrationbackend;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collabration.DAO.EventDAO;
import com.niit.collabration.Model.Event;

import junit.framework.Assert;


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
	
//	@Test
//	public void createEventTestCase()
//	{
//		event.setEvent_id(0);
//		event.setEvent_tittle("Debate");
//		event.setEvent_description("Competition");
//		event.setEvent_dateofevnt(new Date());
//		event.setEvent_status('A');
//		
//		boolean flag =	eventDAO.save(event);
//		Assert.assertEquals("createEventTestCase ",true, flag);	
//	}
//	
//	@Test
//	public void updateeventTestCase()
//	{
//		event.setEvent_id(64);
//		event.setEvent_tittle("Debate");
//		event.setEvent_description("Competition");
//		event.setEvent_dateofevnt(new Date());
//		event.setEvent_status('N');		
//		boolean flag =	eventDAO.update(event);
//		Assert.assertEquals("updateeventTestCase ",true, flag);
//	}
//	
//	@Test
//	public void deleteeventBYId()
//	{
//
//    	boolean flag =	eventDAO.deleteeventById(64);
//		Assert.assertEquals("deleteeventBYId ",true, flag);	
//	}
//	
//	@Test
//	public void geteventBYId()
//	{
//		event=eventDAO.geteventById(65);
//		Assert.assertNotNull("geteventBYId",event);
//	}
	
	@Test
	public void getalleventTestCase()
	{
        int recordsFromDAO =  eventDAO.list().size();
		assertEquals("getalleventTestCase", 7, recordsFromDAO);
	}
	
}
