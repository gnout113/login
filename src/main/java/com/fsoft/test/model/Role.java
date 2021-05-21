//package com.fsoft.test.model;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "role")
//public class Role implements Serializable{
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	
//	private String roleName;
//	
//	@Column(nullable = false)
//	@ManyToMany(mappedBy = "role")
//	private List<Account> account;
//
//	public Role(int id, String roleName, List<Account> account) {
//		super();
//		this.id = id;
//		this.roleName = roleName;
//		this.account = account;
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
//	public String getRoleName() {
//		return roleName;
//	}
//
//	public void setRoleName(String roleName) {
//		this.roleName = roleName;
//	}
//
//	public List<Account> getAccount() {
//		return account;
//	}
//
//	public void setAccount(List<Account> account) {
//		this.account = account;
//	}
//
//	@Override
//	public String toString() {
//		return "Role [id=" + id + ", roleName=" + roleName + ", account=" + account + "]";
//	}
//	
//}
