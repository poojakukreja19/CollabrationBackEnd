package com.niit.collabration.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Job {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String tittle;
}
