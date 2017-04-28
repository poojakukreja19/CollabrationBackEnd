package com.niit.collabration.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Blog extends BaseDomian {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int blog_id;
	private String blog_tittle;
	private String bog_description;
	private Date blog_dateofcreation;
	private String blog_reason;
	private String blog_status;
	
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public String getBlog_tittle() {
		return blog_tittle;
	}
	public void setBlog_tittle(String blog_tittle) {
		this.blog_tittle = blog_tittle;
	}
	public String getBog_description() {
		return bog_description;
	}
	public void setBog_description(String bog_description) {
		this.bog_description = bog_description;
	}
	public Date getBlog_dateofcreation() {
		return blog_dateofcreation;
	}
	public void setBlog_dateofcreation(Date blog_dateofcreation) {
		this.blog_dateofcreation = blog_dateofcreation;
	}
	public String getBlog_reason() {
		return blog_reason;
	}
	public void setBlog_reason(String blog_reason) {
		this.blog_reason = blog_reason;
	}
	public String getBlog_status() {
		return blog_status;
	}
	public void setBlog_status(String blog_status) {
		this.blog_status = blog_status;
	}
	
	
	
	
	
	
}
