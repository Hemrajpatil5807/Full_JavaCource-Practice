package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import controller.entity.Employee;
import controller.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@RequestMapping
	public String home(Model model) {
		
//		 System.out.println("This is Home");
		 
		 model.addAttribute("name","Hemraj Patil");
		 model.addAttribute("id",101);
		 
		 List<String> fruits = new ArrayList<String>();
		              fruits.add("Banana");
		              fruits.add("Mango");
		              fruits.add("Apple");
		              fruits.add("Grapes");

		  model.addAttribute("fruits",fruits);          
		
		 return "index";
	}

	@RequestMapping("/register")
	public String register() {
//		System.out.println("This Is Register");
		return "register";
	}
	
	
	@RequestMapping("/registerCon")
	public String addEmployee(@ModelAttribute Employee e , Model m) {
		
	    boolean isAdded = homeService.register(e);
	 	
	    if(isAdded) {
	    	 
	    		m.addAttribute("success","Record Added Succeffuly");
	            return "result";
	            
	    }else {
		   
	    	    m.addAttribute("error", "Record Not Added") ;
	            return "result";
	    }
	    
	}
	
	@RequestMapping("/getEmployee")
	public String getEmployeePage() {
		
		return "getEmployee";
	}
	
	@GetMapping("/getEmployeeById")
	public String getEmployee(@RequestParam("id") int id, Model model) {
		System.out.println(id);
		Employee e = homeService.getEmployee(id);
		
		System.out.println(e);
		model.addAttribute("emp",e);
		
		return "display";
	}
	
	
}
