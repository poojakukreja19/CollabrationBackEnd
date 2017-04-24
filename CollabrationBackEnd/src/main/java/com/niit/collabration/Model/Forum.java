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
public class Forum {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int forum_id;
	
	@Column(name="user_id") //field related to user table
	private int userID;
	
	@Column(name="freind_id") //field related to freind table
	private int freindID;
	
	private Date forum_datetime;
	private String comment;//group chat
	
	
	public int getForum_id() {
		return forum_id;
	}
	public void setForum_id(int forum_id) {
		this.forum_id = forum_id;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getFreindID() {
		return freindID;
	}
	public void setFreindID(int freindID) {
		this.freindID = freindID;
	}
	public Date getForum_datetime() {
		return forum_datetime;
	}
	public void setForum_datetime(Date forum_datetime) {
		this.forum_datetime = forum_datetime;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	
}
