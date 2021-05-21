package com.fsoft.test.service;

import java.util.List;

import com.fsoft.test.model.Account;

public interface AccountService {
	
	Account save(Account account);
	
	List<Account> findAll();
	
	void delete(Account account);
	
	Account checkValid(String username , String password);
	
	void deleteById(int id);
	
	boolean existsById(int id);
}
