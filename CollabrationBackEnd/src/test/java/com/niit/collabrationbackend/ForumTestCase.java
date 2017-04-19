package com.niit.collabrationbackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collabration.DAO.ForumDAO;
import com.niit.collabration.Model.Forum;



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
	
	
	
}
