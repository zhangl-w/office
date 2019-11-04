package com.neusoft.office.gongzuojihua.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.neusoft.office.gongzuojihua.po.All;
import com.neusoft.office.gongzuojihua.po.Dept;
import com.neusoft.office.gongzuojihua.po.Emp;
import com.neusoft.office.gongzuojihua.po.Plan;
import com.neusoft.office.gongzuojihua.po.User;
import com.neusoft.office.gongzuojihua.service.UserService;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("emp.a")
	@ResponseBody
	public String selectEmp(){
		List<Emp> list = userService.selectEmp();
		List<Dept> list1 = userService.getDept();
		List<Plan> list2 = userService.getPlan();
		System.out.println(list+""+list1+""+list2);
		Map<String,Object> map = new HashMap<>();
		map.put("emp", list);
		map.put("dept", list1);
		map.put("plan", list2);
		Gson a = new Gson();
		return a.toJson(map);
	}
	@RequestMapping("all.a")
	@ResponseBody
	public String getAll(){
		List<All> list = userService.getAll();
		System.out.println(list);
		Gson a = new Gson();
		return a.toJson(list);
	}
	@RequestMapping("runWork.a")
	@ResponseBody
	public String runWork(){
		List<All> list = userService.runWork();
		System.out.println(list);
		Gson a = new Gson();
		return a.toJson(list);
	}
	@RequestMapping("endWork.a")
	@ResponseBody
	public String endWork(){
		List<All> list = userService.endWork();
		System.out.println(list);
		Gson a = new Gson();
		return a.toJson(list);
	}
	@RequestMapping("waitWork.a")
	@ResponseBody
	public String waitWork(){
		List<All> list = userService.waitWork();
		System.out.println(list);
		Gson a = new Gson();
		return a.toJson(list);
	}
	@RequestMapping("fabu.a")
	public void fabu(String only){
		int n = Integer.parseInt(only);
		userService.fabu(n);
	}
	@RequestMapping("shangbao.a")
	public void shangbao(All all){
		userService.shangbao(all);
	}
	@RequestMapping("shenhe.a")
	public void shenhea(All all){
		userService.shenhea(all);
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		all.setTime(currentDate.toString());
		userService.addIdea(all);
		
	}
	@RequestMapping("sfabu.a")
	@ResponseBody
	public String selectFB(){
		List<All> list = userService.selectFB();
		System.out.println(list);
		Gson a = new Gson();
		return a.toJson(list);
	}
	@RequestMapping("jshenhe.a")
	@ResponseBody
	public void jshenhe(All all){
		userService.jshenhe(all);
		int a = all.getFlag();
		if(a==8){
			userService.addIdea(all);
		}
	}
	@RequestMapping("jwaitWork.a")
	@ResponseBody
	public String jwaitWork(){
		List<All> list = userService.jwaitWork();
		System.out.println(list);
		Gson a = new Gson();
		return a.toJson(list);
	}

}
