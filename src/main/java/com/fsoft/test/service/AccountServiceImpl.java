package com.fsoft.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.test.model.Account;
import com.fsoft.test.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account save(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public void delete(Account account) {
		accountRepository.delete(account);
	}

	@Override
	public Account checkValid(String username, String password) {
		Account account = accountRepository.findByUsernameAndPassword(username,password);
		System.out.println(account);
		if (account != null) {
			return account;
		} else {
			return null;
		}
	}
	
	@Override
	public void deleteById(int id) {
		accountRepository.deleteById(id);
	}

	@Override
	public boolean existsById(int id) {
		return accountRepository.existsById(id);
	}
	
}
