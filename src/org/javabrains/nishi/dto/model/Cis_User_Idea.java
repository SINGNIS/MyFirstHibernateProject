package org.javabrains.nishi.dto.model;

import java.util.Date;

public class Cis_User_Idea {
	
	private Integer idea_id;
	private String idea_short_description;
	private String idea_details;
	private Date idea_created_on;
	private Integer idea_user_id; //foreign key from cis_user
	
	
	public Cis_User_Idea(Integer idea_id, String idea_short_description, String idea_details, Date idea_created_on,
			Integer idea_user_id) {
		super();
		this.idea_id = idea_id;
		this.idea_short_description = idea_short_description;
		this.idea_details = idea_details;
		this.idea_created_on = idea_created_on;
		this.idea_user_id = idea_user_id;
	}
	
	public Integer getIdea_id() {
		return idea_id;
	}
	public void setIdea_id(Integer idea_id) {
		this.idea_id = idea_id;
	}
	public String getIdea_short_description() {
		return idea_short_description;
	}
	public void setIdea_short_description(String idea_short_description) {
		this.idea_short_description = idea_short_description;
	}
	public String getIdea_details() {
		return idea_details;
	}
	public void setIdea_details(String idea_details) {
		this.idea_details = idea_details;
	}
	public Date getIdea_created_on() {
		return idea_created_on;
	}
	public void setIdea_created_on(Date idea_created_on) {
		this.idea_created_on = idea_created_on;
	}
	public Integer getIdea_user_id() {
		return idea_user_id;
	}
	public void setIdea_user_id(Integer idea_user_id) {
		this.idea_user_id = idea_user_id;
	}
}
