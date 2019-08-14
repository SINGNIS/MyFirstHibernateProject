package org.javabrains.nishi.dto.model;

public class Cis_User_Role {
	
	private Integer role_id;
	private Integer role_type;
	private String  role_description;
	private Integer role_user_id; //fk from table cis_user table
	
	public Cis_User_Role(Integer role_id, Integer role_type, String role_description, Integer role_user_id) {
		super();
		this.role_id = role_id;
		this.role_type = role_type;
		this.role_description = role_description;
		this.role_user_id = role_user_id;
	}
	
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public Integer getRole_type() {
		return role_type;
	}
	public void setRole_type(Integer role_type) {
		this.role_type = role_type;
	}
	public String getRole_description() {
		return role_description;
	}
	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}
	public Integer getRole_user_id() {
		return role_user_id;
	}
	public void setRole_user_id(Integer role_user_id) {
		this.role_user_id = role_user_id;
	}
}
