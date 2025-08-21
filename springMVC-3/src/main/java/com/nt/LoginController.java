package com.nt;

import javax.servlet.http.HttpSession;

import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/") // page mapping
	public String homePage() {
		return "index";
	}

	@RequestMapping("/loginPage") // page mapping
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/loginUser")
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session ,Model model) {
		
		if(username.equals(password)) {
			session.setAttribute("userName", username);
			
			model.addAttribute("userName", username);
			return "dashboard";
		}else {
			model.addAttribute("errorMsg", "Invalid Crediantial");
			return "login";
		}
			
	}
	
	@RequestMapping("/inboxMap")
	public String inbox(HttpSession session, Model model) {
		
		String username = (String) session.getAttribute("userName");
		
		if(username != null) {
			
			model.addAttribute("username", username);
			return "inbox";
		}else{
			
			model.addAttribute("errorMsg","Login First");
			return "login";
		}
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session,Model model) {
		
		if(session!=null) {
			session.invalidate();
			model.addAttribute("msg","Log-Out Successfully");
			return "index";
		}else {
			return "login";
		}
		
	}
	
	
}
