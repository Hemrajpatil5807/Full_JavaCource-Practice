package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Employee;
import com.nt.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/registerPage") // register page mapping
	public String registerPage() {
		return "register";
	}

//	@RequestMapping("/register")
//	public String register(@RequestParam("fname") String fname, @RequestParam String midname,
//			@RequestParam String lname, @RequestParam String mobile, @RequestParam String email,
//			@RequestParam String Birthdate, @RequestParam String Gender, @RequestParam String Address, Model model) {
//		
	// We use @ModelAttribute here to get Form data in Employee Object

	@RequestMapping("/register")
	public String register(@ModelAttribute Employee e, Model model) {
//		System.out.println(fname + " " + midname + " " + lname + " " + mobile + " " + email + " " + Birthdate + " "
//				+ Gender + " " + Address);
//
//		Employee employee = new Employee(fname + " " + midname + " " + lname, mobile, email, Birthdate, Gender,Address);

		boolean isAdded = employeeService.register(e);

		if (isAdded) {
			model.addAttribute("success", "Register Successfully");
			return "result";
		} else {
			model.addAttribute("error", "Not Register Successfully");
			return "result";
		}

	}

	// update
	@RequestMapping("/updatePage") // register page mapping
	public String updatePage() {
		return "update";
	}

	@RequestMapping("/updateUser")
	public String update(@RequestParam int id, @RequestParam String mobile, Model model) {

		boolean isUpdate = employeeService.update(id, mobile);

		if (isUpdate) {
			model.addAttribute("success", "Mobile Update Successfully");
			return "result";
		} else {
			model.addAttribute("error", "Mobile Not Updated");
			return "result";
		}
	}

	// select
	@RequestMapping("/selectPage") // select page mapping
	public String selectPage() {
		return "select";
	}

	@RequestMapping("/selectUser")
	public String select(@RequestParam int id, Model model) {

		Employee e = employeeService.select(id);

		model.addAttribute("emp", e);
		return "display";

	}

	// selectAll
	@RequestMapping("/selectAllUser")
	public String selectAll(Model model) {

		List<Employee> employeeslist = employeeService.selectAll();

		model.addAttribute("empList", employeeslist);
		return "displayAll";
	}

	// delete
	@RequestMapping("/deletePage") // select page mapping
	public String deletePage() {
		return "delete";
	}

	@RequestMapping("/deleteUser")
	public String delete(@RequestParam int id, Model model) {

		boolean isDelete = employeeService.delete(id);

		if (isDelete) {
			model.addAttribute("success", "Delete record Successfully");
			return "result";
		} else {
			model.addAttribute("error", "Record not Deleted");
			return "result";
		}

	}

	// deleteAll
	@RequestMapping("/deleteAllUser")
	public String deleteAll(Model model) {

		boolean isDeleteAll = employeeService.deleteAll();

		if (isDeleteAll) {
			model.addAttribute("success", "All record Delete Successfully");
			return "result";
		} else {
			model.addAttribute("error", "All Record not Deleted");
			return "result";
		}

	}

	//Minimum Salary
	@RequestMapping("/minimumSal")
	public String minimumSal(Model model) {

		Employee e = employeeService.minimumSal();

		model.addAttribute("emp", e);
		return "display";

	}
	
	//Maximum Salary
	@RequestMapping("/maximumSal")
	public String maximumSal(Model model) {

		 Employee e = employeeService.maximumSal();

		model.addAttribute("emp", e);
		return "display";

	}
	
	
	//Having SalaryBetween 1000 to 15000
	@RequestMapping("/salaryBetween")
	public String salaryBetween(Model model) {

		List<Employee> employeeslist = employeeService.salaryBetween();

		model.addAttribute("empList", employeeslist);
		return "displayAll";
	}
	
	
	//NumberOfEmployees
	@RequestMapping("/numberOfEmployee")
	public String  numberOfEmployee(Model model) {
		
		int total = employeeService.numberOfEmployee();
		
		model.addAttribute("total",total);
		
		return "result";
	}
	
	//Name Start With
	@RequestMapping("/nameStart")
	public String nameStart(Model model) {

		List<Employee> employeeslist = employeeService.nameStart();

		model.addAttribute("empList", employeeslist);
		return "displayAll";
	}
}
