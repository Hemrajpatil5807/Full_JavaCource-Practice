package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Employee;
import com.nt.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password) {
		
		
		Employee user = loginService.login(username,password);
		if (user != null) {
			if(username.equals(user.getEmail()) && password.equals(user.getPassword())) {
				
				return "dashboard";
			}
		}
		
	    return "login";
	
	}
	
	
	
	@RequestMapping("/registerPage")
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping("/register")
	public void register(@ModelAttribute Employee e) {
		
		loginService.register(e);
		
	}
	
}
