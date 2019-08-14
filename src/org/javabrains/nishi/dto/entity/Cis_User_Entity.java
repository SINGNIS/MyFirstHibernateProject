package org.javabrains.nishi.dto.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity(name="Cis_User")
public class Cis_User_Entity {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usr_seq_gen")
	@SequenceGenerator(name="usr_seq_gen", initialValue=1, sequenceName="cis_usr_seq", allocationSize=256 )
	private Integer user_id;
	//@Column(name="user_emp_id" ,nullable=false ,updatable=false)
	private Integer user_emp_id;
	private String  user_first_name;
	private String  user_last_name;
	private String  user_email_id;
	private String user_password;
	private String user_confirm_password;
	private Date created_on;
	private Boolean user_active_yn;
	
	@OneToMany(mappedBy="idea_user_id")
	Collection<Cis_User_Idea_Entity> user_idea=new ArrayList<Cis_User_Idea_Entity>();
	public Collection<Cis_User_Idea_Entity> getUser_idea() {
		return user_idea;
	}
	public void setUser_idea(Collection<Cis_User_Idea_Entity> user_idea) {
		this.user_idea = user_idea;
	}

	public Cis_User_Entity(){
	}
	
	public Cis_User_Entity(Integer user_id, Integer user_emp_id, String user_first_name, String user_last_name,
			String user_email_id, String user_password, String user_confirm_password,
			Date created_on, Boolean user_active_yn) {
		super();
		this.user_id = user_id;
		this.user_emp_id = user_emp_id;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_email_id = user_email_id;
		this.user_password = user_password;
		this.user_confirm_password = user_confirm_password;
		this.created_on = created_on;
		this.user_active_yn = user_active_yn;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getUser_emp_id() {
		return user_emp_id;
	}
	public void setUser_emp_id(Integer user_emp_id) {
		this.user_emp_id = user_emp_id;
	}
	public String getUser_first_name() {
		return user_first_name;
	}
	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	public String getUser_last_name() {
		return user_last_name;
	}
	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}
	public String getUser_email_id() {
		return user_email_id;
	}
	public void setUser_email_id(String user_email_id) {
		this.user_email_id = user_email_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_confirm_password() {
		return user_confirm_password;
	}
	public void setUser_confirm_password(String user_confirm_password) {
		this.user_confirm_password = user_confirm_password;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public Boolean getUser_active_yn() {
		return user_active_yn;
	}
	public void setUser_active_yn(Boolean user_active_yn) {
		this.user_active_yn = user_active_yn;
	}
}
