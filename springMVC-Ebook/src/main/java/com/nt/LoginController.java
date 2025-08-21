package com.nt;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.User;
import com.nt.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}

	@RequestMapping("/indexPage")
	public String index() {
		return "index";
	}

	@RequestMapping("/dashboardPage")
	public String dashboardPage() {
		return "dashboard";
	}

	@RequestMapping("/loginPage")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session,
			Model model) {

		User user = loginService.login(username, password);

		if ( username.equals("admin@gmail.com") && password.equals("admin")) {
			session.setAttribute("user", username);
			return "admin/adminHome";
		} else {
			if (user != null) {
				if (username.equals(user.getEmail()) && password.equals(user.getPassword())) {
					session.setAttribute("user", user);
					model.addAttribute("userName", user.getName());
					return "dashboard";
				}
			}
		}
		model.addAttribute("msg", "Invalid Crediantial..");
		return "login";

	}

	@RequestMapping("/registerPage")
	public String registerPage() {
		return "register";
	}

	@RequestMapping("/register")
	public String register(@ModelAttribute User e, Model model) {

		boolean isAdded = loginService.register(e);
		if (isAdded) {
			model.addAttribute("msg", "Register Successfully");
			return "register";
		} else {
			model.addAttribute("errmsg", "Not Register Please try again..");
			return "register";
		}

	}

	@RequestMapping("/recentBookPage")
	public String recentBookPage(HttpSession session, Model model) {
		if (session != null) {
			return "recentBook";
		} else {
			model.addAttribute("msg", "Log-In First");
			return "index";
		}

	}

//	@RequestMapping("/newBook")
//	public String newBookPage(HttpSession session, Model model) {
//		if(session != null) {
//			return "newBook"; 
//		}else {
//			model.addAttribute("msg","Log-In First");
//			return "index";
//		}
//		
//		
//	}

	@RequestMapping("/oldBook")
	public String oldBookPage(HttpSession session, Model model) {
		if (session != null) {
			return "oldBook";
		} else {
			model.addAttribute("msg", "Log-In First");
			return "index";
		}

	}

	@RequestMapping("/logout")
	public String logout(HttpSession session, Model model) {

		if (session != null) {
			session.invalidate();
			model.addAttribute("msg", "LogOut Successfully");
			return "index";
		} else {
			return "dashboard";
		}
	}
}
