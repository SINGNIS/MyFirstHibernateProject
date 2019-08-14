package org.javabrains.nishi.dto.model;

import java.util.Date;

public class Cis_User {
	
	private Integer user_id;
	private Integer user_emp_id;
	private String  user_first_name;
	private String  user_last_name;
	private String  user_email_id;
	private String user_password;
	private String user_confirm_password;
	private Integer user_role_id;
	private Date created_on;
	private Boolean user_active_yn;
	
	public Cis_User(){
	}
	
	public Cis_User(Integer user_id, Integer user_emp_id, String user_first_name, String user_last_name,
			String user_email_id, String user_password, String user_confirm_password, Integer user_role_id,
			Date created_on, Boolean user_active_yn) {
		super();
		this.user_id = user_id;
		this.user_emp_id = user_emp_id;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_email_id = user_email_id;
		this.user_password = user_password;
		this.user_confirm_password = user_confirm_password;
		this.user_role_id = user_role_id;
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
	public Integer getUser_role_id() {
		return user_role_id;
	}
	public void setUser_role_id(Integer user_role_id) {
		this.user_role_id = user_role_id;
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
