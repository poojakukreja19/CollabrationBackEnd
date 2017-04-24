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
public class JobApplication {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jobApp_id;
	
	@Column(name="user_id") //field related to user table
	private int userID;
	
	@Column(name="job_id")
	private int jobID;    //field related to job table
	
	private Date jobApp_dateApplied;
	
	private String jobApp_remarks;
	
	private char jobApp_status;

	public int getJobApp_id() {
		return jobApp_id;
	}

	public void setJobApp_id(int jobApp_id) {
		this.jobApp_id = jobApp_id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public Date getJobApp_dateApplied() {
		return jobApp_dateApplied;
	}

	public void setJobApp_dateApplied(Date jobApp_dateApplied) {
		this.jobApp_dateApplied = jobApp_dateApplied;
	}

	public String getJobApp_remarks() {
		return jobApp_remarks;
	}

	public void setJobApp_remarks(String jobApp_remarks) {
		this.jobApp_remarks = jobApp_remarks;
	}

	public char getJobApp_status() {
		return jobApp_status;
	}

	public void setJobApp_status(char jobApp_status) {
		this.jobApp_status = jobApp_status;
	}
	
	
}
