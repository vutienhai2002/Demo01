

package vn.edu.pxu.springmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import vn.edu.pxu.springmvc.demo.model.Account;
@Controller

public class AccountController {


		@GetMapping("/login")
		public String login() {
			return "login";
		}

		@ModelAttribute("account")
		public Account setAccount() {
			return new Account();
		}

		@PostMapping("/saveLogin")
		public String saveuser(@ModelAttribute("account") Account account, Model model) {
			if (account.getUsername().equals("admin") && account.getPassword().equals("123456")) {
				model.addAttribute("mess", "User login thành công");
			} else {
				model.addAttribute("mess", "User login thất bại");
			}
			model.addAttribute("myaccount", account);
			return "login-success";
		}
	}


