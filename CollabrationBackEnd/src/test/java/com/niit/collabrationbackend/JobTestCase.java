package com.niit.collabrationbackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collabration.DAO.JobDAO;
import com.niit.collabration.Model.Job;

public class JobTestCase {

@Autowired  static AnnotationConfigApplicationContext context;
	
	@Autowired  static Job job;
	
	@Autowired  static JobDAO  jobDAO;
	
	@BeforeClass
	public static  void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		job = (Job) context.getBean("job");
		
		jobDAO = (JobDAO) context.getBean("jobDAO");
	}
	
	
}
