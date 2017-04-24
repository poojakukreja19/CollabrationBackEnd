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
//	@Test
//	public void createUserTestCase()
//	
//
//	{
//    	userdetail.setId(0);
//		userdetail.setName("priya");
//		userdetail.setPassword("priya");
//		userdetail.setAddress("mumbai");
//		userdetail.setMail("priya@gmail.com");
//		userdetail.setDOB("18/09/1993");             //how t add dob
//		userdetail.setIs_online('y');
//		userdetail.setReason(" valid user");
//		userdetail.setActive(true);
//		userdetail.setRole("CUSTOMER");
//		userdetail.setContact("9876543212");
//	       boolean flag =	userdetailDAO.save(userdetail);
//	       Assert.assertEquals("createUserTestCase ",true, flag);
//	}
	
//	@Test
//	public void updateUserTestCase()
//	{
//		userdetail.setId(9);
//		userdetail.setName("pooja");
//		userdetail.setPassword("pooja");
//		userdetail.setAddress("haryana");
//		userdetail.setMail("p@gmail.com");
//		userdetail.setDOB("19/03/1991");             //how t add dob
//		userdetail.setIs_online('y');
//		userdetail.setReason(" valid user");
//		userdetail.setActive(true);
//		userdetail.setRole("ADMIN");
//		userdetail.setContact("9876543212");
//	       boolean flag =	userdetailDAO.update(userdetail);
//	       Assert.assertEquals("createUserTestCase ",true, flag);
//	}

	@Test
	public void deleteuserBYId()
	{
//		userdetail.setId(49);
//		userdetail.setName("priya");
//		userdetail.setPassword("priya");
//		userdetail.setAddress("mumbai");
//		userdetail.setMail("supriya@gmail.com");
//		userdetail.setDOB("18/09/1993");             //how t add dob
//		userdetail.setIs_online('y');
//		userdetail.setReason(" valid user");
//		userdetail.setActive(true);
//		userdetail.setRole("CUSTOMER");
//		userdetail.setContact("9876543212");
	       boolean flag =	userdetailDAO.deleteuserById(49);
	       Assert.assertEquals("deleteuserBYId ",true, flag);
	}
	
//	@Test
//	public void getuserBYId()
//	{
//		userdetail=userdetailDAO.getuserById(47);
//		Assert.assertNotNull("getuserBYId",userdetail);
//	}

//	@Test
//	public void getuserByName()
//	{
//		userdetail=userdetailDAO.getuserByName("kanika");
//		Assert.assertNotNull("getuserByName",userdetail);
//	}

	
//	@Test
//	public void validateCredentialTestCase()
//	{
//		boolean flag = userdetailDAO.validate(9,"pooja");
//		
//		assertEquals("validateCredentialTestCase", true,flag);
//	}

//	@Test
//	public void getallUsersTestCase()
//	{
//        int recordsFromDAO =  userdetailDAO.list().size();
//		assertEquals("getallUsersTestCase", 3, recordsFromDAO);
//	}
//
//	
	// test the user by its status (0 or 1)
	
}

