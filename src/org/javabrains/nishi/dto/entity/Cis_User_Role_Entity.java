package org.javabrains.nishi.dto.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="Cis_User_Role")
public class Cis_User_Role_Entity {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usr_role_gen")
	@SequenceGenerator(name = "usr_role_gen", initialValue=1,sequenceName="cis_usr_role" ,allocationSize=256)
	private Integer role_id;
	private Integer role_type;
	private String  role_description;
	
	@OneToOne
	private Cis_User_Entity role_user_id; //fk from table cis_user table
	//Setter Getter
	public Cis_User_Entity getRole_user_id() {
		return role_user_id;
	}
	public void setRole_user_id(Cis_User_Entity role_user_id) {
		this.role_user_id = role_user_id;
	}
	
	public Cis_User_Role_Entity(){}
	public Cis_User_Role_Entity(Integer role_id, Integer role_type, String role_description) {
		super();
		this.role_id = role_id;
		this.role_type = role_type;
		this.role_description = role_description;
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

}
