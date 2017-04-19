package com.niit.collabration.DAO;

import java.util.List;

import com.niit.collabration.Model.Userdetail;


	public interface UserdetailDAO {

		public List<Userdetail> list();
		
		public boolean save(Userdetail user);
		
		public boolean update(Userdetail user);
		
		public boolean delete(Userdetail user);
		 
		public boolean deleteuserById(int id);

		public Userdetail getuserById(int id);
		
		public Userdetail getuserBystatus(String status);

		public Userdetail getuserByName(String name);
		
		public boolean validate(int id,String password);
			
	}
