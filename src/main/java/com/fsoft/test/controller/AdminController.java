package com.fsoft.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fsoft.test.model.Account;
import com.fsoft.test.service.AccountService;

@Controller
public class AdminController {
	@Autowired
	private AccountService accountService;

	@PostMapping("/delete")
	public String delete(@ModelAttribute("delID") int delId, Model model, Model model1) {
		try {
			accountService.deleteById(delId);
			model.addAttribute("msg", "Xóa thành công !");
			List<Account> acc = accountService.findAll();
			model1.addAttribute("accounts", acc);
			return "/admin/mange";

		} catch (Exception e) {
			model.addAttribute("msg", "Xóa không thành công !");
			List<Account> acc = accountService.findAll();
			model1.addAttribute("accounts", acc);
			return "/admin/mange";
		}
	}

	@PostMapping("/update")
	public String update(@ModelAttribute("id") int id, @ModelAttribute("fullname") String fullname,
			@ModelAttribute("username") String username, @ModelAttribute("password") String password,
			@ModelAttribute("role") boolean role, Model model, Model model1) {
		if (accountService.existsById(id) == false) {
			List<Account> acc = accountService.findAll();
			model1.addAttribute("accounts", acc);
			return "/admin/mange";
		}
		Account account = new Account(username, fullname, password, role);
		accountService.save(account);
		List<Account> acc = accountService.findAll();
		model1.addAttribute("accounts", acc);
		model.addAttribute("msg1", "Cập Nhật Thành Công !!!");
		return "/admin/mange";
	}

	@PostMapping("/create")
	public String createString(@ModelAttribute("fullname") String fullname,
			@ModelAttribute("username") String username, @ModelAttribute("password") String password,
			@ModelAttribute("role") boolean role, Model model, Model model1) {
		Account account = new Account(username, fullname, password, role);
		accountService.save(account);
		List<Account> acc = accountService.findAll();
		model1.addAttribute("accounts", acc);
		model.addAttribute("msg2", "Tạo Mới Thành Công !!!");
		return "/admin/mange";
	}

}
