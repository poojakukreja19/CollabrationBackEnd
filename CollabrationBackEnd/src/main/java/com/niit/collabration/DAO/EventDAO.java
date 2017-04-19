package com.niit.collabration.DAO;

import java.util.List;

import com.niit.collabration.Model.Event;


public interface EventDAO {

    public List<Event> list();
	
	public boolean save(Event event);
	
	public boolean update(Event event);
	
	public boolean delete(Event event);
	 
	public boolean deleteeventById(int id);

	public Event geteventById(int id);
		
}
