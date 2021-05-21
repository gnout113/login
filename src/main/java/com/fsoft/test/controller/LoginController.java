package com.fsoft.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsoft.test.model.Account;
import com.fsoft.test.service.AccountService;

@Controller
public class LoginController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/")
	public String home() {
		System.out.println(accountService.findAll().get(0).toString());
		return "home";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("username") String username , @ModelAttribute("password") String password, Model model) {
		Account account = accountService.checkValid(username, password);
		if (account != null) {
			if(account.getRole() == true) {
				List<Account> accounts = accountService.findAll();
				model.addAttribute("accounts", accounts);
				return "/admin/mange";
			} else if (account.getRole() == false) {
				model.addAttribute("user" , account);
				return "/user/info";
			}
		} 
			model.addAttribute("msg","Đăng nhập thất bại !!!");
			return "home";		
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "home";
	}
}
