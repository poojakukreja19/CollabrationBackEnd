package com.niit.collabration.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class ChatForum {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Cforum_id;
	
	@Column(name="user_id") //field related to user table
	private int userID;
	
	private String Cforum_message;//group chat

	private Date Cforum_createddate;

	
	public int getCforum_id() {
		return Cforum_id;
	}

	public void setCforum_id(int cforum_id) {
		Cforum_id = cforum_id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getCforum_message() {
		return Cforum_message;
	}

	public void setCforum_message(String cforum_message) {
		Cforum_message = cforum_message;
	}

	public Date getCforum_createddate() {
		return Cforum_createddate;
	}

	public void setCforum_createddate(Date cforum_createddate) {
		Cforum_createddate = cforum_createddate;
	}
	
	
}
