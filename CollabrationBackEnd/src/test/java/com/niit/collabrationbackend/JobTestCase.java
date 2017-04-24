package com.niit.collabrationbackend;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collabration.DAO.JobDAO;
import com.niit.collabration.Model.Job;

import junit.framework.Assert;

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
	
	@Test
	public void createJob_detailTestCase()
	{
		job.setJob_id(0);
		job.setJob_tittle("Testing Profile");
		job.setJob_description("Manual Tseting");
		job.setJob_datetime(new Date());
		job.setJob_qualification("B-tech");
		job.setJob_status('A');
		
		System.out.println("========================save a job=========================");
		boolean flag =	jobDAO.save(job);
		System.out.println("========================create a job=========================");

		Assert.assertEquals("createJob_detailTestCase ",true, flag);
	}
	
	@Test
	public void updateJob_detailTestCase()
	{
		job.setJob_id(87);
		job.setJob_tittle("junior Analyst");
		job.setJob_description("Nontechnical");
		job.setJob_datetime(new Date());
		job.setJob_qualification("B-tech, M-tech");
		job.setJob_status('A');
		
		boolean flag =	jobDAO.update(job);
		Assert.assertEquals("updateJob_detailTestCase ",true, flag);
		
	}
	
	@Test
	public void deleteJob_detailBYId()
	{
		
		boolean flag =	jobDAO.deletejobById(88);
		Assert.assertEquals("deleteJob_detailBYId ",true, flag);	
	}
	
	@Test
	public void getJob_detailBYId()
	{
		job=jobDAO.getjobById(90);
		Assert.assertNotNull("getJob_detailBYId",job);
	}
	
	@Test
	public void getallJob_detailTestCase()
	{
        int recordsFromDAO =  jobDAO.list().size();
		assertEquals("getallJob_detailTestCase", 3, recordsFromDAO);
	}
	
}
