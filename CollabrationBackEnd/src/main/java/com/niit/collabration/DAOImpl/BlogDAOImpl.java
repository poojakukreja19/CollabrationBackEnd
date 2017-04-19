package com.niit.collabration.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collabration.DAO.BlogDAO;
import com.niit.collabration.Model.Blog;

@Transactional
@Repository("blogDAO")
public class BlogDAOImpl implements BlogDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession()
	{
		return sessionFactory.getCurrentSession(); 
	}

	public List<Blog> list() {
		return sessionFactory.getCurrentSession().createQuery("from Blog").list();

	}

	public boolean save(Blog blog) {
		 try {
		      getSession().save(blog);
		    	   return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
			}

	public boolean update(Blog blog) {
		 try {
		      getSession().update(blog);
		    	   return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
			}

	public boolean delete(Blog blog) {
		 try {
		      getSession().delete(blog);
		    	   return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
			}

	public boolean deleteblogById(int id) {
		try{
			sessionFactory.getCurrentSession().delete(getblogById(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace(); 
			return false;
		}
		}

	public Blog getblogById(int id) {
		return (Blog) sessionFactory.getCurrentSession().get(Blog.class, id);
	}

}
