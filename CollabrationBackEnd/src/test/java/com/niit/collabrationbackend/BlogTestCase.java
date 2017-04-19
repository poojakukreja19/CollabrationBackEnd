package com.niit.collabrationbackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collabration.DAO.BlogDAO;
import com.niit.collabration.Model.Blog;


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
	

}
