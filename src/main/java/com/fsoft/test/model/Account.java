package com.fsoft.test.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "username" ,nullable = false, unique = true)
	private String username;

	@Column(name = "fullname" ,nullable = false)
	private String fullName;

	@Column(name = "password" ,nullable = false)
	private String password;

//	@Column(nullable = false)
//	@ManyToMany
//	@JoinTable(name = "account_role", joinColumns = @JoinColumn(name = "accountId"), inverseJoinColumns = @JoinColumn(name = "roleId"))
//	private List<Role> role;
	
	@Column(name = "role" ,nullable = false)
	private boolean role;
	
	public Account() {
		
	}

	public Account(String username, String fullName, String password, boolean role) {
		super();
		this.username = username;
		this.fullName = fullName;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getRole() {
		return role;
	}

	public void setRole(boolean role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", fullName=" + fullName + ", password=" + password
				+ ", role=" + role + "]";
	}

}
