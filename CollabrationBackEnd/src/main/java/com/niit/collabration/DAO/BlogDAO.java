package com.niit.collabration.DAO;

import java.util.List;
import com.niit.collabration.Model.Blog;

public interface BlogDAO {

	public List<Blog> list();
	
	public boolean save(Blog blog);
	
	public boolean update(Blog blog);
	
	public boolean delete(Blog blog);
	 
	public boolean deleteblogById(int id);

	public Blog getblogById(int id);
		
}
