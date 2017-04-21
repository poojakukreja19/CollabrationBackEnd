package com.niit.collabrationbackend;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collabration.DAO.BlogDAO;
import com.niit.collabration.Model.Blog;

import junit.framework.Assert;


public class BlogTestCase {

@Autowired  static AnnotationConfigApplicationContext context;
	
	@Autowired  static Blog blog;
	
	@Autowired  static BlogDAO  blogDAO;
	
	@BeforeClass
	public static  void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		blog = (Blog) context.getBean("blog");
		
		blogDAO = (BlogDAO) context.getBean("blogDAO");
	}
	

//	@Test
//	public void createBlogTestCase()
//	{
//		blog.setBlog_id(0);
//		blog.setBlog_tittle("Festivals");
//		blog.setBog_description("Religious Festival");
//		blog.setBlog_dateofcreation(new Date());
//		blog.setBlog_reason("Awareness");
//		blog.setBlog_status("Active");
//		boolean flag =	blogDAO.save(blog);
//		Assert.assertEquals("createBlogTestCase ",true, flag);
//		
//	}
	
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
	
	@Test
	public void getblogBYId()
	{
		blog=blogDAO.getblogById(54);
		Assert.assertNotNull("getblogBYId",blog);
	}
	
	@Test
	public void getallblogTestCase()
	{
        int recordsFromDAO =  blogDAO.list().size();
		assertEquals("getallblogTestCase", 3, recordsFromDAO);
	}
}
