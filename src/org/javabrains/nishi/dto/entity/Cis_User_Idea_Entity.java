package org.javabrains.nishi.dto.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="Cis_User_Idea")
public class Cis_User_Idea_Entity {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="idea_seq_gen")
	@SequenceGenerator(name="idea_seq_gen", initialValue=1,sequenceName="cis_idea_seq",allocationSize=256)
	private Integer idea_id;
	private String idea_short_description;
	private String idea_details;
	private Date idea_created_on;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Cis_User_Entity idea_user_id; //foreign key from cis_user
	
	//Getter and Setter
	public Cis_User_Entity getIdea_user_id() {
		return idea_user_id;
	}
	public void setIdea_user_id(Cis_User_Entity idea_user_id) {
		this.idea_user_id = idea_user_id;
	}

	public Cis_User_Idea_Entity(){
	}
	
	public Cis_User_Idea_Entity(Integer idea_id, String idea_short_description, String idea_details, Date idea_created_on,
			Integer idea_user_id) {
		super();
		this.idea_id = idea_id;
		this.idea_short_description = idea_short_description;
		this.idea_details = idea_details;
		this.idea_created_on = idea_created_on;
		
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
}
