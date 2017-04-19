package com.niit.collabration.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collabration.DAO.EventDAO;
import com.niit.collabration.Model.Event;

@Transactional
@Repository("eventDAO")
public class EventDAOImpl implements EventDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession()
	{
		return sessionFactory.getCurrentSession(); 
	}

	public List<Event> list() {
		return sessionFactory.getCurrentSession().createQuery("from Event").list();

	}

	public boolean save(Event event) {
		try {
			getSession().save(event);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Event event) {
		try {
			getSession().update(event);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Event event) {
		try {
			getSession().delete(event);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteeventById(int id) {
		try{
			sessionFactory.getCurrentSession().delete(geteventById(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace(); 
			return false;
		}
		}
	
	public Event geteventById(int id) {
		return (Event) sessionFactory.getCurrentSession().get(Event.class, id);

	}

}
