package com.niit.collabration.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collabration.DAO.ForumDAO;
import com.niit.collabration.Model.Forum;

@Transactional
@Repository("forumDAO")
public class ForumDAOImpl implements ForumDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession()
	{
		return sessionFactory.getCurrentSession(); 
	}
	
	public List<Forum> list() {
		return sessionFactory.getCurrentSession().createQuery("from Forum").list();
		
	}

	public boolean save(Forum forum) {
		 try {
		      getSession().save(forum);
		    	   return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
			}

	public boolean update(Forum forum) {
		 try {
		      getSession().update(forum);
		    	   return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
			}

	public boolean delete(Forum forum) {
		 try {
		      getSession().delete(forum);
		    	   return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
			}

	public boolean deleteforumById(int id) {
		try{
			sessionFactory.getCurrentSession().delete(getforumById(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace(); 
			return false;
		}
		}

	public Forum getforumById(int id) {
		return (Forum) sessionFactory.getCurrentSession().get(Forum.class, id);

	}

}
