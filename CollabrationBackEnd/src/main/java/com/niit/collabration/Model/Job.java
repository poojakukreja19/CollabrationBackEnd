package com.niit.collabration.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name ="job_detail")
public class Job extends BaseDomian{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int job_id;
	private String job_tittle;
	private String job_description;
	private Date job_datetime;
	private String job_qualification;
	private char job_status;
	
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public String getJob_tittle() {
		return job_tittle;
	}
	public void setJob_tittle(String job_tittle) {
		this.job_tittle = job_tittle;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public Date getJob_datetime() {
		return job_datetime;
	}
	public void setJob_datetime(Date job_datetime) {
		this.job_datetime = job_datetime;
	}
	public String getJob_qualification() {
		return job_qualification;
	}
	public void setJob_qualification(String job_qualification) {
		this.job_qualification = job_qualification;
	}
	public char getJob_status() {
		return job_status;
	}
	public void setJob_status(char job_status) {
		this.job_status = job_status;
	}
	
	
}
