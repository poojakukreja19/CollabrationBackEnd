package com.niit.collabration.DAOImpl;

	import java.util.List;

	import javax.transaction.Transactional;

	import org.hibernate.HibernateException;
	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collabration.DAO.UserdetailDAO;
import com.niit.collabration.Model.Userdetail;

	
	@Transactional
	@Repository("userdetailDAO")
	public class UserdetailDAOImpl implements UserdetailDAO {
		
		@Autowired
		private SessionFactory sessionFactory;
		private Session getSession()
		{
			return sessionFactory.getCurrentSession(); 
		}

		public List<Userdetail> list() {
	   
		return sessionFactory.getCurrentSession().createQuery("from Userdetail").list();
		}

		public boolean save(Userdetail user) {
	       try {
	      getSession().save(user);
	    	   return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
		}

		public boolean update(Userdetail user) {
		      try {
				getSession().update(user);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		public boolean deleteuserById(int id) {
			try{
			sessionFactory.getCurrentSession().delete(getuserById(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace(); 
			return false;
		}
		}


		public boolean delete(Userdetail user) {
			try {
				getSession().delete(user);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		public Userdetail getuserById(int id) {
			return (Userdetail) sessionFactory.getCurrentSession().get(Userdetail.class, id);
		}

		public Userdetail getuserByName(String name) {
			return (Userdetail) sessionFactory.getCurrentSession().createQuery("from Userdetail where name = '" +name+ "'").uniqueResult();

		}

		public boolean validate(int id, String password) {
//			Query query = sessionFactory.getCurrentSession().createQuery("from Userdetail where id = ? and password =? ");
//			query.setInteger(1, id);
//			query.setString(2, password);
//			if(query.uniqueResult()==null);
//			{
//				return false;
//			}
//			return true;
//		}
			
			String hql="from Userdetail where id =  '" +id+ "' and password = '"+password+"'";
			if(getSession().createQuery(hql).uniqueResult()  ==null) 
			{
				return false;
			}
			return true;
			}

		public Userdetail getuserBystatus(String status) {
			// TODO Auto-generated method stub
			return null;
		}
}
