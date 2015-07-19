package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Please logIn");
		return "hello";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String checkPassword(@RequestParam Map<String,String> req , ModelMap modelMap){

	    modelMap.addAttribute("info","The user is :"+req.get("username")+"  "+req.get("password"));
		return "main";
	}
}