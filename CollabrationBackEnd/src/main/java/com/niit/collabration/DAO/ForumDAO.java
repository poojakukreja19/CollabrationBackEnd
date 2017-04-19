package com.niit.collabration.DAO;

import java.util.List;

import com.niit.collabration.Model.Forum;


public interface ForumDAO {

    public List<Forum> list();
	
	public boolean save(Forum forum);
	
	public boolean update(Forum forum);
	
	public boolean delete(Forum forum);
	 
	public boolean deleteforumById(int id);

	public Forum getforumById(int id);
		
}
