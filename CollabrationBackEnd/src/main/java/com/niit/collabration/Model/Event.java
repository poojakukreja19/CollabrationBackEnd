package com.niit.collabration.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Event {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int event_id;
	private String event_tittle;
	private String event_description;
	private char event_status;
	private Date event_dateofevent;

	//private     image;
	//private int user_id;
	
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getEvent_tittle() {
		return event_tittle;
	}
	public void setEvent_tittle(String event_tittle) {
		this.event_tittle = event_tittle;
	}
	public String getEvent_description() {
		return event_description;
	}
	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}
	public char getEvent_status() {
		return event_status;
	}
	public void setEvent_status(char event_status) {
		this.event_status = event_status;
	}
	public Date getEvent_dateofevent() {
		return event_dateofevent;
	}
	public void setEvent_dateofevent(Date event_dateofevent) {
		this.event_dateofevent = event_dateofevent;
	}
	
}
