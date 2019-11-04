package com.neusoft.office.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.neusoft.office.login.po.User;
import com.neusoft.office.login.service.LoginService;
import com.neusoft.office.managersys.po.Dept;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller()
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login.a")
	@ResponseBody
	public String login(User u){
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		List<User> list =loginService.login(u);
		System.out.println(list);
		Gson g=new Gson();
		String s= g.toJson(list);
		if(list!=null){
			System.out.println(s);
			return s;
		}else{
			return " ";
		}
		
		
		
	}

}
