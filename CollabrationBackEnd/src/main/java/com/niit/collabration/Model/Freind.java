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
public class Freind {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int freind_id;
	
	@Column(name="user_id") //field related to user table
	private int userID;
	
	@Column(name="freind2_id") //field related to freind table
	private int freind2ID;
	
	//new,accepted,rejected
	private String freind_status;
	
	private char freind_isOnline;
	
	private Date freind_lastSeenTime;

	
	public int getFreind_id() {
		return freind_id;
	}

	public void setFreind_id(int freind_id) {
		this.freind_id = freind_id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getFreind2ID() {
		return freind2ID;
	}

	public void setFreind2ID(int freind2id) {
		freind2ID = freind2id;
	}

	public String getFreind_status() {
		return freind_status;
	}

	public void setFreind_status(String freind_status) {
		this.freind_status = freind_status;
	}

	public char getFreind_isOnline() {
		return freind_isOnline;
	}

	public void setFreind_isOnline(char freind_isOnline) {
		this.freind_isOnline = freind_isOnline;
	}

	public Date getFreind_lastSeenTime() {
		return freind_lastSeenTime;
	}

	public void setFreind_lastSeenTime(Date freind_lastSeenTime) {
		this.freind_lastSeenTime = freind_lastSeenTime;
	}
	
	
	
}
