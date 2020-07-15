package com.web.controller;


import java.io.StringReader;
import java.util.Optional;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@Controller
@RequestMapping(value = "/")
public class MainController {
	
	@RequestMapping("/")
	public String viewHomePage() {
		System.out.print("hiiiii");
//	   List<Product> listProducts = service.listAll();
//	   model.addAttribute("listProducts", listProducts);
//	     
	    return "index";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public String Userlogin(@RequestBody String loginn) {
		System.out.println("hello i am in the myweb"+loginn);
	
		return "success";
	}
}