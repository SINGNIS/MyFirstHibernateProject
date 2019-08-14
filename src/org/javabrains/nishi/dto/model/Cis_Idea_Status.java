package org.javabrains.nishi.dto.model;

import java.util.Date;

public class Cis_Idea_Status {

	private Integer idea_status_id;
	private String idea_status;
	private Date idea_modified_date;
	private Integer idea_sts_user_id;// fk from table cis_user
	
	
	public Cis_Idea_Status(Integer idea_status_id, String idea_status, Date idea_modified_date,
			Integer idea_sts_user_id) {
		super();
		this.idea_status_id = idea_status_id;
		this.idea_status = idea_status;
		this.idea_modified_date = idea_modified_date;
		this.idea_sts_user_id = idea_sts_user_id;
	}
	public Integer getIdea_status_id() {
		return idea_status_id;
	}
	public void setIdea_status_id(Integer idea_status_id) {
		this.idea_status_id = idea_status_id;
	}
	public String getIdea_status() {
		return idea_status;
	}
	public void setIdea_status(String idea_status) {
		this.idea_status = idea_status;
	}
	public Date getIdea_modified_date() {
		return idea_modified_date;
	}
	public void setIdea_modified_date(Date idea_modified_date) {
		this.idea_modified_date = idea_modified_date;
	}
	public Integer getIdea_sts_user_id() {
		return idea_sts_user_id;
	}
	public void setIdea_sts_user_id(Integer idea_sts_user_id) {
		this.idea_sts_user_id = idea_sts_user_id;
	}
}
