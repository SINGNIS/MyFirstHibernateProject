package org.javabrains.nishi.dto.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="Cis_Idea_Status")
public class Cis_Idea_Status_Entity {

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usr_idests_gen")
	@SequenceGenerator(name = "usr_idests_gen", initialValue=1,sequenceName="cis_usr_idests" ,allocationSize=256)	
	private Integer idea_status_id;
	private String idea_status;
	private Date idea_modified_date;
	
	@OneToOne
	private Cis_User_Idea_Entity idests_idea_id; // fk from table cis_user_idea
	public Cis_User_Idea_Entity getIdests_idea_id() {
		return idests_idea_id;
	}
	public void setIdests_idea_id(Cis_User_Idea_Entity idests_idea_id) {
		this.idests_idea_id = idests_idea_id;
	}
	
	public Cis_Idea_Status_Entity(){}
	public Cis_Idea_Status_Entity(Integer idea_status_id, String idea_status, Date idea_modified_date) {
		super();
		this.idea_status_id = idea_status_id;
		this.idea_status = idea_status;
		this.idea_modified_date = idea_modified_date;
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
}
