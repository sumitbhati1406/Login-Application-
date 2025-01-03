package com.UvTech.loginWeb.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoginEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; // private int id - boolean Boolean //wrapper classes
	private String userName;
	private String password;
	public LoginEntity(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public LoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "LoginEntity [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
