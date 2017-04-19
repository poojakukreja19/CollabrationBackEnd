package com.niit.collabration.Model;

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
	private String comment;//group chat

}
