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
public class ChatForumComment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Ccforum_id;
	
	//private String forumId; 
	
	@Column(name="user_id") //field related to user table
	private int userID;
	
	private String Ccforum_message;//group chat

	private Date Ccforum_commentdate;

	public int getCcforum_id() {
		return Ccforum_id;
	}

	public void setCcforum_id(int ccforum_id) {
		Ccforum_id = ccforum_id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getCcforum_message() {
		return Ccforum_message;
	}

	public void setCcforum_message(String ccforum_message) {
		Ccforum_message = ccforum_message;
	}

	public Date getCcforum_commentdate() {
		return Ccforum_commentdate;
	}

	public void setCcforum_commentdate(Date ccforum_commentdate) {
		Ccforum_commentdate = ccforum_commentdate;
	}
	
	
}
