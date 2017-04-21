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
	public void createJobTestCase()
	{
		job.setJob_id(0);
		job.setJob_tittle("Java Profile");
		job.setJob_description("Corejava,C++,sql");
		job.setJob_datetime(new Date());
		job.setJob_qualification("B-tech");
		job.setJob_status('A');
		boolean flag =	jobDAO.save(job);
		Assert.assertEquals("createJobTestCase ",true, flag);
	}
	
//	@Test
//	public void updateBlogTestCase()
//	{
//		blog.setBlog_id(57);
//		blog.setBlog_tittle("Festivals");
//		blog.setBog_description("Religious Festival");
//		blog.setBlog_dateofcreation(new Date());
//		blog.setBlog_reason("Awareness");
//		blog.setBlog_status("Not_Active");
//		boolean flag =	blogDAO.update(blog);
//		Assert.assertEquals("updateBlogTestCase ",true, flag);
//		
//	}
	
//	@Test
//	public void deleteblogBYId()
//	{
//		blog.setBlog_id(57);
//		blog.setBlog_tittle("Festivals");
//		blog.setBog_description("Religious Festival");
//		blog.setBlog_dateofcreation(new Date());
//		blog.setBlog_reason("Awareness");
//		blog.setBlog_status("Not_Active");
//		boolean flag =	blogDAO.deleteblogById(57);
//		Assert.assertEquals("deleteblogBYId ",true, flag);	
//	}
	
//	@Test
//	public void getblogBYId()
//	{
//		blog=blogDAO.getblogById(54);
//		Assert.assertNotNull("getblogBYId",blog);
//	}
//	
//	@Test
//	public void getallblogTestCase()
//	{
//        int recordsFromDAO =  blogDAO.list().size();
//		assertEquals("getallblogTestCase", 3, recordsFromDAO);
//	}
//	
}
