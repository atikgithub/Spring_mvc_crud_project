package com.jsp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.Service.EmployeeService;
import com.jsp.dto.Employee;

@Controller
public class EmployeeController {
 @Autowired
 EmployeeService employeeService;
 @RequestMapping("/loademployee")
 public ModelAndView load() {
	 ModelAndView andView =  new ModelAndView("saveemployee.jsp");
	 andView.addObject("load", new Employee());
	 return andView; 
 }
 @RequestMapping("/saveEmployee")
 public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
	 Employee employee2=employeeService.saveEmployee(employee);
	 if(employee2 != null) {
		 ModelAndView andView =new ModelAndView("/displayemployee");
		 andView.addObject("msg","data saved");
		 return andView;
	 }else {
		 ModelAndView andView = new ModelAndView("/loademployee");
		 return andView;
	 }
 }
   @RequestMapping("/displayemployee")
   public ModelAndView displayEmployee() {
	   ModelAndView andView= new ModelAndView("display.jsp");
	   return andView.addObject("list", employeeService.getAllEmployee());
   }
   
   @RequestMapping("/updateemp")
   public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
	   Employee employee2=employeeService.updateEmployee(employee);
	   ModelAndView andView= new ModelAndView("/displayemployee");
	   return andView;
   }
   @RequestMapping("/deleteemployee")
   public ModelAndView updateEmployee(@RequestParam int id) {
	   employeeService.deleteEmployeeById(id);
	   ModelAndView andView= new ModelAndView("/displayemployee");
	   return andView;
   }
   
	   
  
}
