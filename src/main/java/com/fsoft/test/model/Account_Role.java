//package com.fsoft.test.model;
//
//import java.io.Serializable;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Account_Role implements Serializable{
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	
//	private int accountId;
//	
//	private int roleId;
//
//	public Account_Role(int id, int accountId, int roleId) {
//		super();
//		this.id = id;
//		this.accountId = accountId;
//		this.roleId = roleId;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getAccountId() {
//		return accountId;
//	}
//
//	public void setAccountId(int accountId) {
//		this.accountId = accountId;
//	}
//
//	public int getRoleId() {
//		return roleId;
//	}
//
//	public void setRoleId(int roleId) {
//		this.roleId = roleId;
//	}
//
//	@Override
//	public String toString() {
//		return "Account_Role [id=" + id + ", accountId=" + accountId + ", roleId=" + roleId + "]";
//	}
//}
