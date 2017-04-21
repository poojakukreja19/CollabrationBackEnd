package com.niit.collabrationbackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collabration.DAO.ForumDAO;
import com.niit.collabration.Model.Forum;

import junit.framework.Assert;



public class ForumTestCase {

@Autowired  static AnnotationConfigApplicationContext context;
	
	@Autowired  static Forum forum;
	
	@Autowired  static ForumDAO  forumDAO;
	
	@BeforeClass
	public static  void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		forum = (Forum) context.getBean("forum");
		
		forumDAO = (ForumDAO) context.getBean("forumDAO");
	}
	
	@Test
	public void createForumTestCase()
	{
		forum.setForum_id(0);
		
		boolean flag =	forumDAO.save(forum);
		Assert.assertEquals("createForumTestCase ",true, flag);
		
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
	
}
