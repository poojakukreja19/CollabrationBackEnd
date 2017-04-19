package com.niit.collabrationbackend;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collabration.DAO.UserdetailDAO;
import com.niit.collabration.Model.Userdetail;

import junit.framework.Assert;

public class UserdetailTestCase {

@Autowired  static AnnotationConfigApplicationContext context;
	
	@Autowired  static Userdetail userdetail;
	
	@Autowired  static UserdetailDAO  userdetailDAO;
	
	@BeforeClass
	public static  void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		userdetail = (Userdetail) context.getBean("userdetail");
		
		userdetailDAO = (UserdetailDAO) context.getBean("userdetailDAO");
	}
	@Test
	public void createUserTestCase()
	{
		userdetail.setId(0);
		userdetail.setName("pooja");
		userdetail.setPassword("pooja");
		userdetail.setAddress("Faridabaf");
		userdetail.setMail("pooja@gmail.com");
		userdetail.setDOB(new Date());             //how t add dob
		userdetail.setIs_online('y');
		userdetail.setReason("not a valid user");
		userdetail.setActive(true);
		userdetail.setRole("CUSTOMER");
		userdetail.setContact("9876543212");
	       boolean flag =	userdetailDAO.save(userdetail);
	       Assert.assertEquals("createUserTestCase ",true, flag);
	}
	
	
}
