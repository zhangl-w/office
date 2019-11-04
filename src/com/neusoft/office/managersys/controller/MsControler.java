package com.neusoft.office.managersys.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.neusoft.office.managersys.po.Dept;
import com.neusoft.office.managersys.po.Menu;
import com.neusoft.office.managersys.po.msempower;
import com.neusoft.office.managersys.po.msuser;
import com.neusoft.office.managersys.po.power;
import com.neusoft.office.managersys.po.uc;
import com.neusoft.office.managersys.service.msService;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
@RequestMapping("/msuser")
public class MsControler {
	@Autowired
	private msService userService;
	
	@RequestMapping(value = "/get.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String getDept(){
		List<Dept> list =userService.getDept();
		System.out.println(list);
		Gson g=new Gson();
		String s= g.toJson(list);
		return s;
		
	}
	@RequestMapping(value = "/getuc.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String get(){
		List<uc> list =userService.getuc();
		System.out.println(list);
		Gson g=new Gson();
		String s= g.toJson(list);
		return s;
		
	}
	@RequestMapping(value = "/getuser.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String getuser(){
		List<msuser> list =userService.getuser();
		System.out.println(list);
		Gson g=new Gson();
		String s= g.toJson(list);
		return s;
	}
	@RequestMapping(value = "/update.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String update(Dept dept){
		
		
		try {
			userService.update(dept);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
		
	}
	@RequestMapping(value = "/del.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String del(Dept dept){
		System.out.println(dept);
		
		try {
			userService.del(dept);;
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
		
	}
	@RequestMapping(value = "/userupdate.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String userupdate(msuser user){
		
		
		try {
			userService.userupdate(user);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
		
	}
	@RequestMapping(value = "/userdel.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String userdel(Integer uid){
		System.out.println(uid);
		
		try {
			userService.userdel(uid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
		
	}
	@RequestMapping(value = "/getpower.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String getpower(){
		List<power> list =userService.getpower();
		System.out.println(list);
		Gson g=new Gson();
		String s= g.toJson(list);
		return s;
	}
	@RequestMapping(value = "/getmenu.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String getmenu(){
		List<Menu> list =userService.getmenu();
		System.out.println(list);
		Gson g=new Gson();
		String s= g.toJson(list);
		return s;
	}
	@RequestMapping(value = "/getc.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String getc(Integer cid){
		System.out.println(cid);
		
		
		String s=userService.getc(cid);
		System.out.println(s);
		return s;
	}
	@RequestMapping(value = "/getempower.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String getempower(Integer cid){
		String ep=userService.getempower(cid);
		String[] s=ep.split(",");
		ArrayList list=new ArrayList();
		for(int i=0;i<s.length;i++){
			list.add(s[i]);
		}
		System.out.println(list);
		Gson g=new Gson();
		String s1= g.toJson(list);
		return s1;
	}
	@RequestMapping(value = "/updateempower.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String updateempower(String str,Integer cid){
		String[] s=str.split("/");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length;i++){
			if(i<s.length-1){
				sb.append(s[i]+",");
			}else{
				sb.append(s[i]);
			}
		}
		String str1=sb.toString();
		try {
			userService.updateempower(str1,cid);
			return "1";
		} catch (Exception e) {
			return "0";
		}
		
	}
	@RequestMapping(value = "/getid.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String getid(String str){
		System.out.println(str);
		List<uc> list=userService.getid(str);
		Gson g=new Gson();
		String s1= g.toJson(list);
		return s1; 
	}
	@RequestMapping(value = "/uduser.a",method ={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String uduser(msuser user){
		try {
			userService.uduser(user);
			return "1";
		} catch (Exception e) {
			return "0";
		}
	}
}
