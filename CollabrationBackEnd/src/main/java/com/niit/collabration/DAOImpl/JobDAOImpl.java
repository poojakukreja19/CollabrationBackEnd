package com.niit.collabration.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collabration.DAO.JobDAO;
import com.niit.collabration.Model.Job;

@Transactional
@Repository("jobDAO")
public class JobDAOImpl  implements JobDAO{

	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession()
	{
		return sessionFactory.getCurrentSession(); 
	}
	
	public List<Job> list() {
		return sessionFactory.getCurrentSession().createQuery("from Job").list();
	}

	public boolean save(Job job) {
		 try {
		      getSession().save(job);
		    	   return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
			}

	public boolean update(Job job) {
		try {
		      getSession().update(job);
		    	   return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
	}

	public boolean delete(Job job) {
		try {
		      getSession().delete(job);
		    	   return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
	}

	public boolean deletejobById(int id) {
		try{
			sessionFactory.getCurrentSession().delete(getjobById(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace(); 
			return false;
		}
		}

	public Job getjobById(int id) {
		return (Job) sessionFactory.getCurrentSession().get(Job.class, id);
	}

}
