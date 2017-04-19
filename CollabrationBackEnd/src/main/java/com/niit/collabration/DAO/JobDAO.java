package com.niit.collabration.DAO;

import java.util.List;

import com.niit.collabration.Model.Job;


public interface JobDAO {
    
	public List<Job> list();
	
	public boolean save(Job job);
	
	public boolean update(Job job);
	
	public boolean delete(Job job);
	 
	public boolean deletejobById(int id);

	public Job getjobById(int id);
}
