//package com.fsoft.test.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.fsoft.test.model.Account;
//import com.fsoft.test.model.Role;
//import com.fsoft.test.repository.AccountRepository;
//import com.fsoft.test.repository.RoleRepository;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//	@Autowired
//	private AccountRepository accountRepository;
//
//	@Autowired
//	private RoleRepository roleRepository;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Account account = accountRepository.findByUsername(username);
//		if (account == null) {
//			System.out.println("User not found! " + username);
//			throw new UsernameNotFoundException("User " + username + " was not found in the database");
//		}
//		List<Role> roles = roleRepository.findByAccountId(account.getId());
//		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
//		if (roles != null) {
//			for (Role role : roles) {
//				GrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
//				grantList.add(authority);
//			}
//		}
//
//		UserDetails userDetails = (UserDetails) new User(account.getUsername(), account.getPassword(),grantList);
//		
//		return userDetails;
//	}
//
//}
